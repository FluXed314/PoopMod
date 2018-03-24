package com.Tiviacz.Poopmod.objects.tools;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

import com.Tiviacz.Poopmod.Main;
import com.Tiviacz.Poopmod.init.ModItems;
import com.Tiviacz.Poopmod.util.IHasModel;
import com.google.common.collect.Multimap;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class PoopKatana extends ItemSword implements IHasModel
{
	
		public static final ToolMaterial poop_katana_material = EnumHelper.addToolMaterial("poop_katana_material", 0, 350, 7.0F, 2.5F, 10);
		
		
		public PoopKatana(String name, ToolMaterial material)
		{
			super(material);
			setUnlocalizedName(name);
			setRegistryName(name);
			setCreativeTab(Main.newtab);
			
			ModItems.ITEMS.add(this);
		}
		
		@Override
		public void registerModels() 
		{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		}
		
		
		@Override
	    public Multimap<String, AttributeModifier> getAttributeModifiers(EntityEquipmentSlot slot, ItemStack stack) {
	        final Multimap<String, AttributeModifier> modifiers = super.getAttributeModifiers(slot, stack);
	 
	        if (slot == EntityEquipmentSlot.MAINHAND) {
	        	replaceModifier(modifiers, SharedMonsterAttributes.ATTACK_DAMAGE, ATTACK_DAMAGE_MODIFIER, 0.5);
	            replaceModifier(modifiers, SharedMonsterAttributes.ATTACK_SPEED, ATTACK_SPEED_MODIFIER, 0.665);  // 1+0.04 Here = 1.5-0.1 In Game
	        }
	 
	        return modifiers;
	    }
	    
	    private void replaceModifier(Multimap<String, AttributeModifier> modifierMultimap, IAttribute attribute, UUID id,
	            double multiplier) {
	        final Collection<AttributeModifier> modifiers = modifierMultimap.get(attribute.getName());
	
	        final Optional<AttributeModifier> modifierOptional = modifiers.stream()
	                .filter(attributeModifier -> attributeModifier.getID().equals(id)).findFirst();
	 
	        if (modifierOptional.isPresent()) { 
	            final AttributeModifier modifier = modifierOptional.get();
	            modifiers.remove(modifier); 
	            modifiers.add(new AttributeModifier(modifier.getID(), modifier.getName(), modifier.getAmount() * multiplier,
	                    modifier.getOperation())); 
	        }
	    }
	}

