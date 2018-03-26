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
		
		//Added additional vanilla blocks to EFFECTIVE_ON. -FluXed314
		private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(new Block[] {Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE, Blocks.STANDING_SIGN, Blocks.WALL_SIGN, Blocks.ACACIA_FENCE, Blocks.ACACIA_FENCE_GATE, Blocks.BIRCH_FENCE, Blocks.BIRCH_FENCE_GATE, Blocks.DARK_OAK_FENCE, Blocks.DARK_OAK_FENCE_GATE, Blocks.JUNGLE_FENCE, Blocks.JUNGLE_FENCE_GATE, Blocks.OAK_FENCE, Blocks.OAK_FENCE_GATE, Blocks.SPRUCE_FENCE, Blocks.SPRUCE_FENCE_GATE, Blocks.TRAPDOOR, Blocks.WOODEN_SLAB, Blocks.DOUBLE_WOODEN_SLAB, Blocks.ACACIA_DOOR, Blocks.BIRCH_DOOR, Blocks.DARK_OAK_DOOR, Blocks.JUNGLE_DOOR, Blocks.OAK_DOOR, Blocks.SPRUCE_DOOR, Blocks.JUKEBOX, Blocks.NOTEBLOCK, Blocks.TRAPPED_CHEST, Blocks.ACACIA_STAIRS, Blocks.BIRCH_STAIRS, Blocks.DARK_OAK_STAIRS, Blocks.JUNGLE_STAIRS, Blocks.OAK_STAIRS, Blocks.SPRUCE_STAIRS, Blocks.STANDING_BANNER, Blocks.WALL_BANNER, Blocks.CRAFTING_TABLE, Blocks.CACTUS, Blocks.COCOA, Blocks.CHORUS_FLOWER, Blocks.CHORUS_PLANT, Blocks.BROWN_MUSHROOM_BLOCK, Blocks.RED_MUSHROOM_BLOCK});
    
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
