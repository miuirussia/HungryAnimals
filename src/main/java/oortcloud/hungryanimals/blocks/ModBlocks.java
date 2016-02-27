package oortcloud.hungryanimals.blocks;


import oortcloud.hungryanimals.HungryAnimals;
import oortcloud.hungryanimals.core.lib.References;
import oortcloud.hungryanimals.core.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	public static Block millStone;
	public static Block excreta;
	public static Block niterBed;
	public static Block trough;
	public static Block trapcover;
	public static Block floorcover_leaf;
	public static Block floorcover_wool;
	public static Block floorcover_ironbar;
	public static Block floorcover_hay;
	
	public static void init()
	{
		excreta = new BlockExcreta();
		niterBed = new BlockNiterBed();
		trough = new BlockTrough();
		trapcover = new BlockTrapCover();
		floorcover_leaf = new BlockFloorCover(Blocks.leaves, Strings.blockFloorCoverLeafName);
		floorcover_wool = new BlockFloorCover(Blocks.wool, Strings.blockFloorCoverWoolName);
		floorcover_hay = new BlockFloorCover(Blocks.hay_block, Strings.blockFloorCoverHayName);
	}

	public static String getName(String unlocalizedName)
	{
		return unlocalizedName.substring(unlocalizedName.indexOf("tile.") + 5);
		
	}
	
	public static void register(Block block) {
		GameRegistry.registerBlock(block, getName(block.getUnlocalizedName()));
	}
}
