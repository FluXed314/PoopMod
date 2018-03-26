package com.Tiviacz.Poopmod.objects.blocks;

import com.Tiviacz.Poopmod.Main;
import com.Tiviacz.Poopmod.init.ModBlocks;
import com.Tiviacz.Poopmod.init.ModItems;
import com.Tiviacz.Poopmod.init.base.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class ToiletBlock extends BlockBase implements ITileEntityProvider
{
	
	public static final AxisAlignedBB Toilet_Block_AABB = new AxisAlignedBB(0.1875D, 0, 0.1875D, 0.8125D, 0.625D, 0.8125D);
	
	public ToiletBlock(String name, Material material)
	{
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setResistance(30.0F);
		setHarvestLevel("pickaxe", 2);
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
		    return Toilet_Block_AABB;
		    
	}
		        
		    public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);
		    {
		    this.setDefaultState(blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH)); 
		    }



		    @Override
		    public IBlockState getStateFromMeta(int meta) {
		    EnumFacing facing = EnumFacing.getFront(meta);

		    if(facing.getAxis()==EnumFacing.Axis.Y) {
		    facing=EnumFacing.NORTH;
		    }

		    return getDefaultState().withProperty(FACING, facing);
		    }

		    @Override
		    public int getMetaFromState(IBlockState state) {
		    return ((EnumFacing) state.getValue(FACING)).getIndex();
		    }
		    
		    @Override
		    protected BlockStateContainer createBlockState() {
		    return new BlockStateContainer(this, new IProperty[]{FACING});
		    }
		    @Override
		    public IBlockState getStateForPlacement(World worldIn, BlockPos pos,
		    EnumFacing facing, float hitX, float hitY, float hitZ, int meta,
		    EntityLivingBase placer) {
		    return getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
		    }
		    
		    
		    @Override
		    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
		    {
		        if(!worldIn.isRemote) 
		        {
		            ItemStack handItem = playerIn.getHeldItem(EnumHand.MAIN_HAND);
		            
		            if(handItem.getItem() == ModItems.toilet_paper)
		            {
		                
		                float x = playerIn.getPosition().getX();
		                float y = playerIn.getPosition().getY();
		                float z = playerIn.getPosition().getZ();
		           		               	                
		                
		                
		                InventoryHelper.spawnItemStack(worldIn, x, y, z, new ItemStack(ModBlocks.poop));
		                playerIn.inventory.decrStackSize(playerIn.inventory.currentItem, 1);
		                
		                
		            }
		            
		            if(handItem.getItem() == Item.getItemFromBlock(ModBlocks.single_layer_toilet_paper))
		            {
		                
		                float x = playerIn.getPosition().getX();
		                float y = playerIn.getPosition().getY();
		                float z = playerIn.getPosition().getZ();
		           		               	                
		                
		                
		                InventoryHelper.spawnItemStack(worldIn, x, y, z, new ItemStack(ModBlocks.poop));
		                InventoryHelper.spawnItemStack(worldIn, x, y, z, new ItemStack(ModBlocks.poop));             
		                playerIn.inventory.decrStackSize(playerIn.inventory.currentItem, 1);
		                
		                
		            }
		            
		            if(handItem.getItem() == Item.getItemFromBlock(ModBlocks.double_layer_toilet_paper))
		           	{
		               
		                float x = playerIn.getPosition().getX();
		                float y = playerIn.getPosition().getY();
		                float z = playerIn.getPosition().getZ();
		           		               	                
		                
		                
		                InventoryHelper.spawnItemStack(worldIn, x, y, z, new ItemStack(ModBlocks.poop));
		                InventoryHelper.spawnItemStack(worldIn, x, y, z, new ItemStack(ModBlocks.poop));
		                InventoryHelper.spawnItemStack(worldIn, x, y, z, new ItemStack(ModBlocks.poop));
		                InventoryHelper.spawnItemStack(worldIn, x, y, z, new ItemStack(ModBlocks.poop));
		                InventoryHelper.spawnItemStack(worldIn, x, y, z, new ItemStack(ModBlocks.poop)); 
		                playerIn.inventory.decrStackSize(playerIn.inventory.currentItem, 1);
		        	  
		           	}
		           
		            if(handItem.getItem() == Item.getItemFromBlock(ModBlocks.three_layer_toilet_paper))
		           {
		               
		                float x = playerIn.getPosition().getX();
		                float y = playerIn.getPosition().getY();
		                float z = playerIn.getPosition().getZ();
		           		               	                
		                
		                
		                InventoryHelper.spawnItemStack(worldIn, x, y, z, new ItemStack(ModBlocks.poop));  
		                InventoryHelper.spawnItemStack(worldIn, x, y, z, new ItemStack(ModBlocks.poop));
		                InventoryHelper.spawnItemStack(worldIn, x, y, z, new ItemStack(ModBlocks.poop));
		                InventoryHelper.spawnItemStack(worldIn, x, y, z, new ItemStack(ModBlocks.poop));
		                InventoryHelper.spawnItemStack(worldIn, x, y, z, new ItemStack(ModBlocks.poop));
		                InventoryHelper.spawnItemStack(worldIn, x, y, z, new ItemStack(ModBlocks.poop));
		                InventoryHelper.spawnItemStack(worldIn, x, y, z, new ItemStack(ModBlocks.poop));
		                InventoryHelper.spawnItemStack(worldIn, x, y, z, new ItemStack(ModBlocks.poop));
		                InventoryHelper.spawnItemStack(worldIn, x, y, z, new ItemStack(ModBlocks.poop));
		                InventoryHelper.spawnItemStack(worldIn, x, y, z, new ItemStack(ModBlocks.poop));
		                InventoryHelper.spawnItemStack(worldIn, x, y, z, new ItemStack(ModBlocks.poop));
		                InventoryHelper.spawnItemStack(worldIn, x, y, z, new ItemStack(ModBlocks.poop));
		                InventoryHelper.spawnItemStack(worldIn, x, y, z, new ItemStack(ModBlocks.poop));
		                InventoryHelper.spawnItemStack(worldIn, x, y, z, new ItemStack(ModBlocks.poop));
		                playerIn.inventory.decrStackSize(playerIn.inventory.currentItem, 1);
		                
		           }
		    }	
		       
		        return true;
		    }
		 
		    
		    

			@Override
			public TileEntity createNewTileEntity(World worldIn, int meta) {
				return null;
			}
	}
	
	

