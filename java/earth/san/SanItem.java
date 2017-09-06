package earth.san;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class SanItem extends Item{
	public SanItem(int maxStackSize, CreativeTabs tab, String name)
	{
		setMaxStackSize(maxStackSize);
		setCreativeTab(tab);
		setUnlocalizedName(name);
	}
}
