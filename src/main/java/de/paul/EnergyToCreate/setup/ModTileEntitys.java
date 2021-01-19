package de.paul.EnergyToCreate.setup;

import de.paul.EnergyToCreate.tileEntitys.EnergyGeneratorTileEntity;
import de.paul.EnergyToCreate.tileEntitys.RotationGeneratorTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.registries.IForgeRegistry;

public class ModTileEntitys {
	
	public static final TileEntityType<?> ROTATION_GENERATOR = TileEntityType.Builder.create(() -> new RotationGeneratorTileEntity(), ModBlocks.ROTATION_GENERATOR).build(null).setRegistryName("rotation_generator_tile_entity");
	public static final TileEntityType<?> ENERGY_GENERATOR = TileEntityType.Builder.create(() -> new EnergyGeneratorTileEntity(), ModBlocks.ENERGY_GENERATOR).build(null).setRegistryName("energy_generator_tile_entity");
	
	public static void register(IForgeRegistry<TileEntityType<?>> registry) {
		registry.register(ROTATION_GENERATOR);
		registry.register(ENERGY_GENERATOR);
	}
}
