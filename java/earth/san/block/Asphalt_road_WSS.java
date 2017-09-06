package earth.san.block;

import net.minecraft.block.Block;

import java.util.Random;

import earth.san.San;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

public class Asphalt_road_WSS extends Block{
	public IIcon Side0;
	public IIcon Side1;
	public IIcon Side2;
	public IIcon Side3;
	public IIcon Side4;
	public IIcon Side5;
	
	public Asphalt_road_WSS(Material material, float hardness, SoundType sound, CreativeTabs tab)
	{
		super(material);
		setHardness(hardness);
		setStepSound(sound);
		setCreativeTab(tab);
	}

	public void registerBlockIcons(IIconRegister icon) {
		Side0 = icon.registerIcon("san:Block_asphalt_road_WSS");
		Side1 = icon.registerIcon("san:Block_asphalt_road_WSS");
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
	
}
