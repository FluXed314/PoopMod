package com.Tiviacz.Poopmod.objects.tools;

import java.util.Set;

import com.Tiviacz.Poopmod.Main;
import com.Tiviacz.Poopmod.init.ModItems;
import com.Tiviacz.Poopmod.util.IHasModel;
import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraftforge.common.util.EnumHelper;

public class PoopWarAxe extends ItemTool implements IHasModel

{
		public static final ToolMaterial poop_war_axe_material = EnumHelper.addToolMaterial("poop_war_axe_material", 0, 350, 7.0F, 2.5F, 10);
	
		private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(new Block[] {Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE});
    
			public PoopWarAxe(String name, ToolMaterial material) {
				super(material, EFFECTIVE_ON);
				setUnlocalizedName(name);
				setRegistryName(name);
				setCreativeTab(Main.newtab);
				this.attackSpeed = -3.0F;
				this.attackDamage = 9.0F;
	    
				ModItems.ITEMS.add(this);
			}

				public float getStrVsBlock(ItemStack stack, IBlockState state)
			{
					Material material = state.getMaterial();
					return material != Material.WOOD && material != Material.PLANTS && material != Material.VINE ? super.getDestroySpeed(stack, state) : this.efficiency;
			}	

				@Override
				public void registerModels() {
					Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}