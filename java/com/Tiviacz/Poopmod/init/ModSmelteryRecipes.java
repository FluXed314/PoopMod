package com.Tiviacz.Poopmod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModSmelteryRecipes 
{
	 public static void init()
	    {
	        GameRegistry.addSmelting(ModItems.poop_raw_ingot, new ItemStack(ModItems.poop_ingot), 1.0F);
	        GameRegistry.addSmelting(ModBlocks.poop_block, new ItemStack(ModBlocks.poop_hardened), 1.0F);
	        GameRegistry.addSmelting(ModItems.raw_empty_roll, new ItemStack(ModBlocks.empty_roll), 1.0F);
	    }
}
