package de.paul.EnergyToCreate.setup;

import java.util.function.Supplier;

import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableSet;

import de.paul.EnergyToCreate.EnergyToCreate;
import de.paul.EnergyToCreate.tileEntitys.RotationGeneratorTileEntity;
import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;

public class ModTileEntitys {

	public static final RegistryObject<TileEntityType<TileEntity>> ROTATION_GENERATOR = register("rotation_generator_entity", RotationGeneratorTileEntity::new, ModBlocks.ROTATION_GENERATOR.get());
	
	public static <E extends TileEntity> RegistryObject<TileEntityType<E>> register(String name, Supplier<E> factory, Block... blocks) {
		TileEntityType<E> tileEntityType = new TileEntityType<E>(factory, ImmutableSet.copyOf(blocks), null);
		return Registration.TILE_ENTITYS.register(name, Suppliers.ofInstance(tileEntityType));
	}
	
	public static void register() {
		EnergyToCreate.LOGGER.error("Register TileEntitys");
	}
}
