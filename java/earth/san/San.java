package earth.san;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import earth.san.Ore.SanMagnetite;
import earth.san.Ore.SanOreBlocks;
import earth.san.Ore.SanOreItem;
import earth.san.Ore.SanOreMain;
import earth.san.Ore.WorldGenerationOre;
import earth.san.block.Asphalt_road_ADL;
import earth.san.block.Asphalt_road_AWDL;
import earth.san.block.Asphalt_road_BT;
import earth.san.block.Asphalt_road_SL;
import earth.san.block.Asphalt_road_WDS;
import earth.san.block.Asphalt_road_WSS;
import earth.san.block.BlockPipe;
import earth.san.block.Pillar;
import earth.san.proxy.CommonProxy;
import earth.san.tileentity.TileEntityPipe;
import net.minecraft.block.Block;
import net.minecraft.block.Block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

@Mod(modid=San.MODID, name=San.NAME, version=San.VERSION)
public class San {
	public static final String MODID = "san";
	public static final String NAME = "San";
	public static final String VERSION = "1.5";
	
	@SidedProxy(clientSide="earth.san.proxy.ClientProxy", serverSide="earth.san.proxy.CommonProxy")
	public static CommonProxy objCommonProxy;
	
	//아이템
	public static Item itemCopperIngot;
	public static Item itemTinIngot;
	public static Item itemLeadIngot;
	public static Item itemLithiumIngot;
	public static Item itemAluminumIngot;
	public static Item itemSilverIngot;
	public static Item itemBronzeIngot;
	public static Item itemZincIngot;
	public static Item itemSteelIngot;
	public static Item itemNickelIngot;
	public static Item itemTungstenIngot;
	public static Item itemTitaniumIngot;
	public static Item itemMagnetite;
	
	public static Item itemYellowribbon;
	
	//블럭
	public static Block blockCopperOre;
	public static Block blockTinOre;
	public static Block blockLeadOre;
	public static Block blockLithiumOre;
	public static Block blockSilverOre;
	public static Block blockAluminumOre;
	public static Block blockConcreteBuild;
	public static Block blockConcreteYellowBuild;
	public static Block blockConcretePinkBuild;
	public static Block blockConcreteSkyBlueBuild;
	public static Block blockConcreteBlackBuild;
	public static Block blockConcreteGreenBuild;
	public static Block blockConcreteRedBuild;
	public static Block blockConcreteBlueBuild;
	public static Block blockCopper;
	public static Block blockTin;
	public static Block blockLead;
	public static Block blockSilver;
	public static Block blockAluminum;
	public static Block blockNickelOre;
	public static Block blockMagnetite;
	public static Block Block_asphalt_road;
	public static Block Block_asphalt_road_AWDL;
	public static Block Block_asphalt_road_WDS;
	public static Block Block_asphalt_road_WSS;
	public static Block Block_asphalt_road_SL;
	public static Block Block_asphalt_road_DT;
	public static Block Block_asphalt_road_ADL;
	public static Block blockPipe;
	
	//MetaBlock
	public static Block Ore;
	
	
	//fluid
	
	//material
	
	
	//Rendered Block
	public static Block Block_Pillar;
	
	//모델 블럭
	
	@Instance(value=San.MODID)
	public static San san;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) 
	// 모드 로딩 중 init() 보다 먼저 호출되는 이벤트, 모드 설정을 불러오는 부분
	{
		//아이템
		itemCopperIngot = new SanItem(64, tabSan, "itemCopperIngot").setUnlocalizedName("itemCopperIngot").setTextureName("san:itemCopperIngot");
		itemTinIngot = new SanItem(64, tabSan, "itemTinIngot").setUnlocalizedName("itemTinIngot").setTextureName("san:itemTinIngot");
		itemLeadIngot = new SanItem(64, tabSan, "itemLeadIngot").setUnlocalizedName("itemLeadIngot").setTextureName("san:itemLeadIngot");
		itemLithiumIngot = new SanItem(64, tabSan, "itemLithiumIngot").setUnlocalizedName("itemLithiumIngot").setTextureName("san:itemLithiumIngot");
		itemAluminumIngot = new SanItem(64, tabSan, "itemAluminumIngot").setUnlocalizedName("itemAluminumIngot").setTextureName("san:itemAluminumIngot");
		itemSilverIngot = new SanItem(64, tabSan, "itemSilverIngot").setUnlocalizedName("itemSilverIngot").setTextureName("san:itemSilverIngot");
		itemBronzeIngot = new SanItem(64, tabSan, "itemBronzeIngot").setUnlocalizedName("itemBronzeIngot").setTextureName("san:itemBronzeIngot");
		itemZincIngot = new SanItem(64, tabSan, "itemZincIngot").setUnlocalizedName("itemZincIngot").setTextureName("san:itemZincIngot"); 
		itemSteelIngot = new SanItem(64, tabSan, "itemSteelIngot").setUnlocalizedName("itemSteelIngot").setTextureName("san:itemSteelIngot");
		itemNickelIngot = new SanItem(64, tabSan, "itemNickelIngot").setUnlocalizedName("itemNickelIngot").setTextureName("san:itemNickelIngot");
		itemTungstenIngot = new SanItem(64, tabSan, "itemTungstenIngot").setUnlocalizedName("itemTungstenIngot").setTextureName("san:itemTungstenIngot");
		itemTitaniumIngot = new SanItem(64, tabSan, "itemTitaniumIngot").setUnlocalizedName("itemTitaniumIngot").setTextureName("san:itemTitaniumIngot");
		itemMagnetite = new SanItem(64, tabSan, "itemMagnetite").setUnlocalizedName("itemMagnetite").setTextureName("san:itemMagnetite");
		itemYellowribbon = new SanItem(1, tabSan, "itemYellowribbon").setUnlocalizedName("itemYellowribbon").setTextureName("san:itemYellowribbon");
		
		//블럭
		Ore = new SanOreBlocks(null).setBlockName("Ore");
		blockConcreteBuild = new SanBlock(Material.rock, 2.0F, Block.soundTypeStone, tabSan).setBlockName("blockConcreteBuild").setBlockTextureName("san:blockConcreteBuild");
		blockConcreteYellowBuild = new SanBlock(Material.rock, 2.0F, Block.soundTypeStone, tabSan).setBlockName("blockConcreteYellowBuild").setBlockTextureName("san:blockConcreteYellowBuild");
		blockConcretePinkBuild = new SanBlock(Material.rock, 2.0F, Block.soundTypeStone,tabSan).setBlockName("blockConcretePinkBuild").setBlockTextureName("san:blockConcretePinkBuild");
		blockConcreteSkyBlueBuild = new SanBlock(Material.rock, 2.0F, Block.soundTypeStone,tabSan).setBlockName("blockConcreteSkyBlueBuild").setBlockTextureName("san:blockConcreteSkyBlueBuild");
		blockConcreteBlackBuild = new SanBlock(Material.rock, 2.0F, Block.soundTypeStone,tabSan).setBlockName("blockConcreteBlackBuild").setBlockTextureName("san:blockConcreteBlackBuild");
		blockConcreteGreenBuild = new SanBlock(Material.rock, 2.0F, Block.soundTypeStone,tabSan).setBlockName("blockConcreteGreenBuild").setBlockTextureName("san:blockConcreteGreenBuild");
		blockConcreteRedBuild = new SanBlock(Material.rock, 2.0F, Block.soundTypeStone,tabSan).setBlockName("blockConcreteRedBuild").setBlockTextureName("san:blockConcreteRedBuild");
		blockConcreteBlueBuild = new SanBlock(Material.rock, 2.0F, Block.soundTypeStone,tabSan).setBlockName("blockConcreteBlueBuild").setBlockTextureName("san:blockConcreteBlueBuild");
		blockCopper = new SanBlock(Material.rock, 2.6F, Block.soundTypeStone,tabSan).setBlockName("blockCopper").setBlockTextureName("san:blockCopper");
		blockTin = new SanBlock(Material.rock, 2.6F, Block.soundTypeStone,tabSan).setBlockName("blockTin").setBlockTextureName("san:blockTin");
		blockLead = new SanBlock(Material.rock, 2.6F, Block.soundTypeStone,tabSan).setBlockName("blockLead").setBlockTextureName("san:blockLead");
		blockSilver = new SanBlock(Material.rock, 2.6F, Block.soundTypeStone,tabSan).setBlockName("blockSilver").setBlockTextureName("san:blockSilver");
		blockAluminum = new SanOreMain(Material.rock, 2.6F,Block.soundTypeStone,tabSan).setBlockName("blockAluminum").setBlockTextureName("san:blockAluminum");
		blockNickelOre = new SanOreBlocks(null).setBlockName("blockNickelOre").setBlockTextureName("san:blockNickelOre");
		blockMagnetite = new SanMagnetite(Material.rock, 5.5F,Block.soundTypeStone,tabSan).setBlockName("blockMagnetite").setBlockTextureName("san:blockMagnetite");
		Block_asphalt_road = new SanBlock(Material.rock, 6.8F,Block.soundTypeStone,tabSan).setBlockName("Block_asphalt_road").setBlockTextureName("san:Block_asphalt_road");
		Block_asphalt_road_AWDL = new Asphalt_road_AWDL(Material.rock, 6.8F,Block.soundTypeStone,tabSan).setBlockName("Block_asphalt_road_AWDL").setBlockTextureName("san:block_asphalt_road_AWDL");
		Block_asphalt_road_WDS = new Asphalt_road_WDS(Material.rock, 6.8F,Block.soundTypeStone,tabSan).setBlockName("Block_asphalt_road_WDS").setBlockTextureName("san:Block_asphalt_road_WDS");
		Block_asphalt_road_WSS = new Asphalt_road_WSS(Material.rock, 6.8F,Block.soundTypeStone,tabSan).setBlockName("Block_asphalt_road_WSS").setBlockTextureName("san:Block_asphalt_road_WSS");
		Block_asphalt_road_SL = new Asphalt_road_SL(Material.rock, 6.8F,Block.soundTypeStone,tabSan).setBlockName("Block_asphalt_road_SL").setBlockTextureName("san:Block_asphalt_road_SL");
		Block_asphalt_road_DT = new Asphalt_road_BT(Material.rock, 6.8F,Block.soundTypeStone,tabSan).setBlockName("Block_asphalt_road_DT").setBlockTextureName("san:Block_asphalt_road_DT");
		Block_asphalt_road_ADL = new Asphalt_road_ADL(Material.rock, 6.8F,Block.soundTypeStone,tabSan).setBlockName("Block_asphalt_road_ADL").setBlockTextureName("san:Block_asphalt_road_ADL");
		blockPipe = new BlockPipe().setBlockName("blockPipe").setCreativeTab(tabSan);
		
		//Rendered Block
		Block_Pillar = new Pillar(Material.rock).setBlockName("pillar");
		
		//fluid
		
		//아이템
		GameRegistry.registerItem(itemCopperIngot, itemCopperIngot.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemTinIngot, itemTinIngot.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemLeadIngot, itemLeadIngot.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemLithiumIngot, itemLithiumIngot.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemAluminumIngot, itemAluminumIngot.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemSilverIngot, itemSilverIngot.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemBronzeIngot, itemBronzeIngot.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemZincIngot, itemZincIngot.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemNickelIngot, itemNickelIngot.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemTungstenIngot, itemTungstenIngot.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemTitaniumIngot, itemTitaniumIngot.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemMagnetite, itemMagnetite.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemYellowribbon, itemYellowribbon.getUnlocalizedName().substring(5));
		
		//블럭
		GameRegistry.registerBlock(Ore, SanOreItem.class,Ore.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockConcreteBuild, blockConcreteBuild.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockConcreteYellowBuild, blockConcreteYellowBuild.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockConcretePinkBuild, blockConcretePinkBuild.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockConcreteSkyBlueBuild, blockConcreteSkyBlueBuild.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockConcreteBlackBuild, blockConcreteBlackBuild.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockConcreteGreenBuild, blockConcreteGreenBuild.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockConcreteRedBuild, blockConcreteRedBuild.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockConcreteBlueBuild, blockConcreteBlueBuild.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockCopper, blockCopper.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockTin, blockTin.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockLead, blockLead.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockSilver, blockSilver.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockAluminum, blockAluminum.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockMagnetite, blockMagnetite.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(Block_asphalt_road, Block_asphalt_road.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(Block_asphalt_road_AWDL, Block_asphalt_road_AWDL.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(Block_asphalt_road_WDS, Block_asphalt_road_WDS.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(Block_asphalt_road_WSS, Block_asphalt_road_WSS.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(Block_asphalt_road_SL, Block_asphalt_road_SL.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(Block_asphalt_road_DT, Block_asphalt_road_DT.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(Block_asphalt_road_ADL, Block_asphalt_road_ADL.getUnlocalizedName().substring(5));
		
		GameRegistry.registerBlock(blockPipe, "blockPipe");
		
		GameRegistry.registerBlock(Block_Pillar, Block_Pillar.getUnlocalizedName().substring(5));
		
		//Rendered Block
		objCommonProxy.registerRenderThings();
		
		//자원 생성
		WorldGenerationOre.San();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		// 모드 로딩 중간에 호출되는 이벤트, 조합법과 광물을 추가하는 부분
		GameRegistry.addRecipe(new ItemStack(blockConcreteBlackBuild,8), new Object[] {"CCC","CRC","CCC", 'C', blockConcreteBuild, 'R', Items.dye});
		GameRegistry.addRecipe(new ItemStack(blockConcreteBuild,8), new Object[] {"CRC","RTR","CRC", 'C', Items.clay_ball, 'R', Blocks.gravel, 'T', Blocks.sand});
		GameRegistry.addRecipe(new ItemStack(blockConcreteYellowBuild,8), new Object[] {"CCC","CRC","CCC", 'C', blockConcreteBuild, 'R', Blocks.yellow_flower});
		GameRegistry.addRecipe(new ItemStack(blockCopper), new Object[] {"CCC","CCC","CCC", 'C', itemCopperIngot});
		GameRegistry.addRecipe(new ItemStack(blockTin), new Object[] {"CCC","CCC","CCC", 'C', itemTinIngot});
		GameRegistry.addRecipe(new ItemStack(blockLead), new Object[] {"CCC","CCC","CCC", 'C', itemLeadIngot});
		GameRegistry.addRecipe(new ItemStack(blockSilver), new Object[] {"CCC","CCC","CCC", 'C', itemSilverIngot});
		GameRegistry.addRecipe(new ItemStack(blockAluminum), new Object[] {"CCC","CCC","CCC", 'C', itemAluminumIngot});
		GameRegistry.addRecipe(new ItemStack(itemYellowribbon), new Object[] {"CRC","CRC","RCR",'R', Blocks.yellow_flower});
		
		GameRegistry.addShapelessRecipe(new ItemStack(itemCopperIngot,9), blockCopper);
		GameRegistry.addShapelessRecipe(new ItemStack(itemTinIngot,9), blockTin);
		GameRegistry.addShapelessRecipe(new ItemStack(itemLeadIngot,9), blockLead);
		GameRegistry.addShapelessRecipe(new ItemStack(itemSilverIngot,9), blockSilver);
		GameRegistry.addShapelessRecipe(new ItemStack(itemAluminumIngot,9), blockAluminum);
		
		GameRegistry.registerTileEntity(TileEntityPipe.class, MODID + ":" + "Pipe");
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) 
	{
		// 모드 로딩 중 init() 이후에 호출되는 이벤트, 다른 모드와 상호작용함으로써 호환성을 높이는 부분
		
	}
	
	public static CreativeTabs tabSan = new CreativeTabs("tabSan") {
		@Override
		public Item getTabIconItem() {
			return new ItemStack(itemCopperIngot).getItem();
		}
	};
}