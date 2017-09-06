package earth.san.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import earth.san.San;
import earth.san.tileentity.TileEntityPillarBlock;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class Pillar extends BlockContainer{

	public Pillar(Material material) {
		super(material);
		
		this.setHardness(3.2F);
		this.setResistance(5.0F);
		this.setBlockBounds(0F, 0F, 0F, 1F, 1F, 1F);
		this.setCreativeTab(San.tabSan);
	}
	
	public int getRenderType() {
		return -1;
	}
	
	public boolean isOpaqueCube() {
		return false;
	}
	
	public boolean renderAsNormalBlock() {
		return false;
	}

	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		return new TileEntityPillarBlock();
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon(San.MODID + ":" + this.getUnlocalizedName().substring(5));
	}

}
