package earth.san.Ore;

import java.util.Random;

import cpw.mods.fml.common.IWorldGenerator;
import earth.san.San;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class earthGenOre implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId) {
		case -1:
			generateNether(random, chunkX * 16, chunkZ * 16, world);
			break;
		case 0:
			generateOverworld(random, chunkX * 16, chunkZ * 16, world);
			break;
		case 1:
			generateEnd(random, chunkX * 16, chunkZ * 16, world);
			break;
		default:
			;
		}
	}
	
	private void addOre(Block block, Block blockSpawn, Random random, World world, int posX, int posZ, int minY, int maxY, int minVeinSize, int maxVeinSize, int spawnChance) {
		for(int i = 0; i < spawnChance; i++) {
			int defaultChunkSize = 16;
			
			int xPos = posX + random.nextInt(defaultChunkSize);
			int yPos = minY + random.nextInt(maxY - minY);
			int zPos = posZ + random.nextInt(defaultChunkSize);
			
			new WorldGenMinable(block, (minVeinSize + random.nextInt(maxVeinSize - minVeinSize)), blockSpawn).generate(world, random, xPos, yPos, zPos);
		}
	}

	private void generateEnd(Random random, int chunkX, int chunkZ, World world) {
		// TODO Auto-generated method stub
		
	}

	private void generateOverworld(Random random, int chunkX, int chunkZ, World world) {
		addOre(San.Ore, Blocks.stone, random, world, chunkX, chunkZ, 5, 64, 3, 10, 20);
		addOre(San.blockMagnetite, Blocks.stone, random, world, chunkX, chunkZ, 4, 50, 2, 8, 20);
	}

	private void generateNether(Random random, int chunkX, int chunkZ, World world) {
		// TODO Auto-generated method stub
		
	}

}
