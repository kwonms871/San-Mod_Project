package earth.san.block;

import java.util.Random;

import earth.san.San;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class Asphalt_road_AWDL extends BlockContainer{
	
	
	public IIcon Side0;
	public IIcon Side1;
	public IIcon Side2;
	public IIcon Side3;
	public IIcon Side4;
	public IIcon Side5;
	
	public Asphalt_road_AWDL(Material material, float hardness, SoundType sound, CreativeTabs tab)
	{
		super(material);
		setHardness(hardness);
		setStepSound(sound);
		setCreativeTab(tab);
	}
	
	public void registerBlockIcons(IIconRegister icon) {
		Side0 = icon.registerIcon("san:Block_asphalt_road_AWDL");
		Side1 = icon.registerIcon("san:Block_asphalt_road_AWDL");
		Side2 = icon.registerIcon("san:Block_asphalt_road");
		Side3 = icon.registerIcon("san:Block_asphalt_road");
		Side4 = icon.registerIcon("san:Block_asphalt_road");
		Side5 = icon.registerIcon("san:Block_asphalt_road");
	}
	public IIcon getIcon(int side, int meta) {
		if(side == 0) {
			return Side0;
		}else if(side == 1) {
			return Side1;
		}else if(side == 2) {
			return Side2;
		}else if(side == 3) {
			return Side3;
		}else if(side == 4) {
			return Side4;
		}else if(side == 5) {
			return Side5;
		}
		return null;
	}
	
	public Item getItemDropped(World world, int x, int y, int z) {
		return Item.getItemFromBlock(San.Block_asphalt_road_AWDL);
	}
	
	public void onBlockAdded(World world, int x, int y, int z) {
		super.onBlockAdded(world, x, y, z);
		this.setDefaultDirection(world, x, y, z);
	}

	private void setDefaultDirection(World world, int x, int y, int z) {
		if(!world.isRemote) {
			Block b1 = world.getBlock(x, y, z - 1);
			Block b2 = world.getBlock(x, y, z + 1);
			Block b3 = world.getBlock(x - 1, y, z);
			Block b4 = world.getBlock(x + 1, y, z);
			
			byte b0 = 3;
			
			if(b1.func_149730_j() && !b2.func_149730_j()) {
				b0 = 3;
			}
			if(b2.func_149730_j() && !b1.func_149730_j()) {
				b0 = 2;
			}
			if(b3.func_149730_j() && !b4.func_149730_j()) {
				b0 = 5;
			}
			if(b4.func_149730_j() && !b3.func_149730_j()) {
				b0 = 4;
			}
			
			world.setBlockMetadataWithNotify(x, y, z, b0, 2);
		}
		
	}
	

	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entityplayer, ItemStack itemstack) {
		int l = MathHelper.floor_double((double)(entityplayer.rotationYaw * 4.0F / 360F) + 0.5D) & 3;
		
		if(l == 0) {
			world.setBlockMetadataWithNotify(x, y, z, 2, 2);
		}
		
		if(l == 1) {
			world.setBlockMetadataWithNotify(x, y, z, 5, 2);
		}
		
		if(l == 2) {
			world.setBlockMetadataWithNotify(x, y, z, 3, 2);
		}
		
		if(l == 3) {
			world.setBlockMetadataWithNotify(x, y, z, 4, 2);
		}
		
		if(itemstack.hasDisplayName()) {
			
		}
	}
	
}
