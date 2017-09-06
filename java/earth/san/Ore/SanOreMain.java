package earth.san.Ore;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class SanOreMain extends Block{
	
	public SanOreMain(Material material, float hardness, SoundType sound, CreativeTabs tab)
	{
		super(material);
		this.setHardness(hardness);
		this.setStepSound(sound);
		this.setCreativeTab(tab);
		this.setHarvestLevel("pickaxe", 3);
	}

}
