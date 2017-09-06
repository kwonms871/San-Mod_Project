package earth.san.Ore;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class WorldGenerationOre {
	public static void San() {
		initialiseWorldGen();
	}
	
	public static void initialiseWorldGen() {
		registerWorldGen(new earthGenOre(), 1);
	}
	
	public static void registerWorldGen(IWorldGenerator worldGenClass, int weightedProberblity) {
		GameRegistry.registerWorldGenerator(worldGenClass, 1);
	}

}
