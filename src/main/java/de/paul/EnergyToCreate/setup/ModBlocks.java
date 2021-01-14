package de.paul.EnergyToCreate.setup;

import com.google.common.base.Supplier;

import de.paul.EnergyToCreate.EnergyToCreate;
import de.paul.EnergyToCreate.blocks.BauxitOre;
import de.paul.EnergyToCreate.blocks.RotationGenerator;
import de.paul.EnergyToCreate.items.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;

public class ModBlocks {
	
	public static final RegistryObject<Block> BAUXIT_ORE = register("bauxit_ore", () -> new BauxitOre());
	
	public static final RegistryObject<Block> ROTATION_GENERATOR = register("rotation_generator", () -> new RotationGenerator());
	
	public static void register() {
		EnergyToCreate.LOGGER.error("Register Blocks");
		EnergyToCreate.LOGGER.error("test: "+ROTATION_GENERATOR.get());
	}
	
	private static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<T> block) {
		return Registration.BLOCKS.register(name, block);
	}
	
	private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
		RegistryObject<T> ret = registerNoItem(name, block);
		Registration.ITEMS.register(name, () -> new BlockItem(ret.get(), new Item.Properties().group(ModItemGroup.ENERGYTOCREATE)));
		return ret;
	}
}
