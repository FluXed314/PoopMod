package com.Tiviacz.Poopmod.tab;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.Tiviacz.Poopmod.init.ModBlocks;
import com.Tiviacz.Poopmod.init.ModItems;
import com.google.common.base.Function;
import com.google.common.collect.Ordering;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class PoopModTab extends CreativeTabs
{
	
	public PoopModTab() 
	{
		super("pooptab");
		setBackgroundImageName("item_search.png");
	}
	@Override
	public ItemStack getTabIconItem() {
	return new ItemStack(ModBlocks.poop);
		
	}
	@Override
    public boolean hasSearchBar() {
        return true;
	}

	
	
}
		

