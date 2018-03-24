package com.Tiviacz.Poopmod.objects.blocks;

import javax.annotation.Nullable;

import com.Tiviacz.Poopmod.init.base.BlockBase;
import com.google.common.base.Predicate;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class PoopItemBlock extends BlockBase implements ITileEntityProvider
{

	public static final AxisAlignedBB Poop_AABB = new AxisAlignedBB(0.3125D, 0D, 0.3125D, 0.6875D, 0.1875D, 0.6875D);
	
	public PoopItemBlock(String name, Material material) 
	{	
		super(name, material);
		
		setSoundType(SoundType.GROUND);
		setHardness(0F);
		setResistance(0F);
		setHarvestLevel("hand", 0);
	}
	
    @Override
    public boolean isOpaqueCube(IBlockState state)
    {
    	return false;
    }
    
    @Override
    public boolean isFullCube(IBlockState state)
    {
    	return false;
    }
    
    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) 
    {
		return Poop_AABB;
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) 
	{
		return null;
	}
	
}
