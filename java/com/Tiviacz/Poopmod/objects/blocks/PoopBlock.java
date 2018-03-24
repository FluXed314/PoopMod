package com.Tiviacz.Poopmod.objects.blocks;

import com.Tiviacz.Poopmod.init.base.BlockBase;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class PoopBlock extends BlockBase
{

	public PoopBlock(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.GROUND);
		setHardness(0.5F);
		setResistance(2.5F);
		setHarvestLevel("hand", 0);
		
	}
	
}
