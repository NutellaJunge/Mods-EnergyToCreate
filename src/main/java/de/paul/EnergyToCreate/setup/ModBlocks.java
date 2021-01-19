package de.paul.EnergyToCreate.setup;

import de.paul.EnergyToCreate.ModItemGroup;
import de.paul.EnergyToCreate.blocks.BauxitOre;
import de.paul.EnergyToCreate.blocks.EnergyGenerator;
import de.paul.EnergyToCreate.blocks.RotationGenerator;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {
	
	public static final BauxitOre BAUXIT_ORE = new BauxitOre();
	public static final RotationGenerator ROTATION_GENERATOR = new RotationGenerator();
	public static final EnergyGenerator ENERGY_GENERATOR = new EnergyGenerator();
	
	public static void register(IForgeRegistry<Block> registry) {
		registry.register(BAUXIT_ORE);
		registry.register(ROTATION_GENERATOR);
		registry.register(ENERGY_GENERATOR);
	}
	
	public static void registerBlockItems(IForgeRegistry<Item> registry) {
		registry.register(asBlockItem(BAUXIT_ORE));
		registry.register(asBlockItem(ROTATION_GENERATOR));
		registry.register(asBlockItem(ENERGY_GENERATOR));
	}

	private static Item asBlockItem(Block b) {
		Item i = new BlockItem(b, new Item.Properties().group(ModItemGroup.ENERGYTOCREATE)).setRegistryName(b.getRegistryName());
		return i;
	}
}
