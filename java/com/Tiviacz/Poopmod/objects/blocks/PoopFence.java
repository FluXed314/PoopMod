package com.Tiviacz.Poopmod.objects.blocks;

import com.Tiviacz.Poopmod.init.base.BlockFenceBase;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class PoopFence extends BlockFenceBase
{

	public PoopFence(String name, Material material, MapColor mapColorIn) {
		super(name, material, mapColorIn);
		
		setSoundType(SoundType.STONE);
		setHardness(1.5F);
		setResistance(30.0F);
		setHarvestLevel("pickaxe", 0);
		
		
	}

}
