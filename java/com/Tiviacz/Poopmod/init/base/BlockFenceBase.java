package com.Tiviacz.Poopmod.init.base;

import com.Tiviacz.Poopmod.Main;
import com.Tiviacz.Poopmod.init.ModBlocks;
import com.Tiviacz.Poopmod.init.ModItems;
import com.Tiviacz.Poopmod.util.IHasModel;

import net.minecraft.block.BlockFence;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockFenceBase extends BlockFence implements IHasModel
	{
		public BlockFenceBase(String name, Material material, MapColor mapColorIn)
		{
			super(material, mapColorIn);
			setUnlocalizedName(name);
			setRegistryName(name);
			setCreativeTab(Main.newtab);
			
			ModBlocks.BLOCKS.add(this);
			ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
			
			
		}
		@Override
		
		public void registerModels()
		{
			Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
		}
	}

