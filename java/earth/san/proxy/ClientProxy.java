package earth.san.proxy;

import cpw.mods.fml.client.registry.ClientRegistry;
import earth.san.San;
import earth.san.render.ItemRenderPillar;
import earth.san.render.RenderPillar;
import earth.san.tileentity.TileEntityPillarBlock;
import earth.san.tileentity.TileEntityPipe;
import earth.san.tileentity.TileEntityRenderPipe;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy {
	
	public void registerRenderThings() {
		TileEntitySpecialRenderer render = new RenderPillar();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPillarBlock.class, render);
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(San.Block_Pillar), new ItemRenderPillar(render, new TileEntityPillarBlock()));
	}
	
	public void registerTileEntitySpecialRenderer() {
		
	}
	
	public void registerProxies() {
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPipe.class, new TileEntityRenderPipe());
	}
}
