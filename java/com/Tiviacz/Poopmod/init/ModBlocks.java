package com.Tiviacz.Poopmod.init;

import java.util.ArrayList;
import java.util.List;

import com.Tiviacz.Poopmod.objects.blocks.ToiletBlock;
import com.Tiviacz.Poopmod.objects.blocks.DoubleLayerToiletPaperRoll;
import com.Tiviacz.Poopmod.objects.blocks.EmptyRoll;
import com.Tiviacz.Poopmod.objects.blocks.Poop;
import com.Tiviacz.Poopmod.objects.blocks.PoopBlock;
import com.Tiviacz.Poopmod.objects.blocks.PoopBricks;
import com.Tiviacz.Poopmod.objects.blocks.PoopFence;
import com.Tiviacz.Poopmod.objects.blocks.PoopHardened;
import com.Tiviacz.Poopmod.objects.blocks.PoopLantern;
import com.Tiviacz.Poopmod.objects.blocks.PoopPillar;
import com.Tiviacz.Poopmod.objects.blocks.PoopStairs;
import com.Tiviacz.Poopmod.objects.blocks.PoopTrophy;
import com.Tiviacz.Poopmod.objects.blocks.SingleLayerToiletPaperRoll;
import com.Tiviacz.Poopmod.objects.blocks.ThreeLayerToiletPaperRoll;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
		public static final List<Block> BLOCKS = new ArrayList<Block>();
		
		//Blocks
		
		public static final Block poop_block = new PoopBlock("poop_block", Material.GROUND);
		public static final Block poop_bricks = new PoopBricks("poop_bricks", Material.ROCK);
		public static final Block poop_hardened = new PoopHardened("poop_hardened", Material.ROCK);
		public static final Block toilet_block = new ToiletBlock("toilet_block", Material.ROCK);
		public static final Block poop_pillar = new PoopPillar("poop_pillar", Material.ROCK);
		public static final Block poop_lantern = new PoopLantern("poop_lantern", Material.PACKED_ICE);
		public static final Block poop_fence = new PoopFence("poop_fence", Material.ROCK, null);
		public static final Block poop_stairs = new PoopStairs("poop_stairs", Material.ROCK, poop_bricks.getDefaultState());
		public static final Block poop = new Poop("poop", Material.GROUND);
		public static final Block single_layer_toilet_paper = new SingleLayerToiletPaperRoll("single_layer_toilet_paper_roll", Material.CLOTH);
		public static final Block double_layer_toilet_paper = new DoubleLayerToiletPaperRoll("double_layer_toilet_paper_roll", Material.CLOTH);
		public static final Block three_layer_toilet_paper = new ThreeLayerToiletPaperRoll("three_layer_toilet_paper_roll", Material.CLOTH);
		public static final Block empty_roll = new EmptyRoll("empty_roll", Material.CLOTH);
		public static final Block poop_trophy = new PoopTrophy("poop_trophy", Material.IRON);
		
		
}

