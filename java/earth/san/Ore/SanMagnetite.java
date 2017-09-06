package earth.san.Ore;

import java.util.Random;

import earth.san.San;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class SanMagnetite extends Block{
	
	public SanMagnetite(Material material, float hardness, SoundType sound, CreativeTabs tab)
	{
		super(material);
		setHardness(hardness);
		setStepSound(sound);
		setCreativeTab(tab);
	}
	
	@Override
	public Item getItemDropped(int matadata, Random rand, int fortune) {
		return San.itemMagnetite;
	}

	@Override
	public int quantityDropped(Random rand) {
		return 3 + rand.nextInt(10);
	}
}
