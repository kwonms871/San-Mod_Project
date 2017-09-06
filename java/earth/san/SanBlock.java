package earth.san;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class SanBlock extends Block{
	
	protected SanBlock(Material material, float hardness, SoundType sound, CreativeTabs tab)
	{
		super(material);
		setHardness(hardness);
		setStepSound(sound);
		setCreativeTab(tab);
	}

}
