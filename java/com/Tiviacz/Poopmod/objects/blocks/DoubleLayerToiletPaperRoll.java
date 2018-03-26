package com.Tiviacz.Poopmod.objects.blocks;

import com.Tiviacz.Poopmod.init.base.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class DoubleLayerToiletPaperRoll extends BlockBase implements ITileEntityProvider
	
{

	public static final AxisAlignedBB Double_Layer_AABB = new AxisAlignedBB(0.3125D, 0D, 0.3125D, 0.6875D, 0.4375D, 0.6875D);

	public DoubleLayerToiletPaperRoll(String name, Material material)
{
		super(name, material);

		setSoundType(SoundType.CLOTH);
		setHardness(0.0F);
		setResistance(0.0F);
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
    return Double_Layer_AABB;
    
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return null;
	}
	
	@Override
	  public boolean canPlaceBlockAt(World worldIn, BlockPos pos)
	    {
	        return super.canPlaceBlockAt(worldIn, pos) ? this.canBlockStay(worldIn, pos) : false;
	    }
	
	@Override
  public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos)
  {
      if (!this.canBlockStay(worldIn, pos))
      {
    	  this.dropBlockAsItem(worldIn, pos, state, 0);
          worldIn.setBlockToAir(pos);
      }
  }
	
	private boolean canBlockStay(World worldIn, BlockPos pos)
  {
		return worldIn.getBlockState(pos.down()).isFullCube();
  }
	
	@Override
    public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face)
    {
        return BlockFaceShape.UNDEFINED;
    }
}