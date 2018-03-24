package com.Tiviacz.Poopmod.objects.blocks;

import java.util.Random;

import com.Tiviacz.Poopmod.init.base.BlockBase;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class PoopLantern extends BlockBase
{

	public PoopLantern(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.GLASS);
		setHardness(0.3F);
		setResistance(1.5F);
		setHarvestLevel("hand", 0);
		setLightLevel(1.0F);
		
		
		
	}
	
	protected boolean canSilkHarvest()
    {
        return true;
    }
	
	 public int quantityDropped(Random random)
	    {
	        return 0;
	    }

	
}
