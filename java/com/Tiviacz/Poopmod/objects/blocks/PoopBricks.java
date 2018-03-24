package com.Tiviacz.Poopmod.objects.blocks;

import com.Tiviacz.Poopmod.init.base.BlockBase;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class PoopBricks extends BlockBase
{

	public PoopBricks(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(1.5F);
		setResistance(30.0F);
		setHarvestLevel("pickaxe", 0);
		
	}

}
