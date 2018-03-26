package com.Tiviacz.Poopmod.init;

import java.util.ArrayList;
import java.util.List;

import com.Tiviacz.Poopmod.init.base.ArmorBase;
import com.Tiviacz.Poopmod.init.base.AxeBase;
import com.Tiviacz.Poopmod.init.base.FoodBase;
import com.Tiviacz.Poopmod.init.base.HoeBase;
import com.Tiviacz.Poopmod.init.base.ItemBase;
import com.Tiviacz.Poopmod.init.base.PickaxeBase;
import com.Tiviacz.Poopmod.init.base.ShovelBase;
import com.Tiviacz.Poopmod.init.base.SwordBase;
import com.Tiviacz.Poopmod.objects.tools.PoopKatana;
import com.Tiviacz.Poopmod.objects.tools.PoopWarAxe;
import com.Tiviacz.Poopmod.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 

{
		
		public static final List<Item> ITEMS = new ArrayList<Item>();
				
		//Materials
		public static final ToolMaterial poop_tool = EnumHelper.addToolMaterial("tool_poop", 3, 350, 7.0F, 2.5F, 10);
		public static final ArmorMaterial poop_armor = EnumHelper.addArmorMaterial("poop_armor", Reference.MOD_ID +":poop", 15, new int[] {3, 5, 6, 3}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.0F);
		
		
		
		
		//Items
		public static final Item poop_raw_ingot = new ItemBase("poop_raw_ingot");
		public static final Item poop_ingot = new ItemBase("poop_ingot");
		public static final Item raw_empty_roll = new ItemBase("raw_empty_roll");
		public static final Item toilet_paper = new ItemBase("toilet_paper");
		
		
		//Food
		public static final Item chocolate_bar = new FoodBase("chocolate_bar", 4, false);
		
		
		
		//Tools
		public static final Item poop_axe = new AxeBase("poop_axe", poop_tool);
		public static final Item poop_hoe = new HoeBase("poop_hoe", poop_tool);
		public static final Item poop_pickaxe = new PickaxeBase("poop_pickaxe", poop_tool);
		public static final Item poop_shovel = new ShovelBase("poop_shovel", poop_tool); 
		public static final Item poop_sword = new SwordBase("poop_sword", poop_tool);
		public static final Item poop_katana = new PoopKatana("poop_katana", PoopKatana.poop_katana_material);
		public static final Item poop_war_axe = new PoopWarAxe("poop_war_axe", PoopWarAxe.poop_war_axe_material);
	
		
		
		
		//Armor
		public static final Item poop_helmet = new ArmorBase("poop_helmet", poop_armor, 1, EntityEquipmentSlot.HEAD);
		public static final Item poop_chestplate = new ArmorBase("poop_chestplate", poop_armor, 1, EntityEquipmentSlot.CHEST);
		public static final Item poop_leggings = new ArmorBase("poop_leggings", poop_armor, 2, EntityEquipmentSlot.LEGS);
		public static final Item poop_boots = new ArmorBase("poop_boots", poop_armor, 1, EntityEquipmentSlot.FEET);
		
		
}
