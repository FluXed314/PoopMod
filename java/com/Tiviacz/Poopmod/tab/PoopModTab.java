package com.Tiviacz.Poopmod.tab;

import com.Tiviacz.Poopmod.init.ModBlocks;
import com.Tiviacz.Poopmod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

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




		

