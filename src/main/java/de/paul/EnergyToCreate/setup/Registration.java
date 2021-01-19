package de.paul.EnergyToCreate.setup;

import de.paul.EnergyToCreate.EnergyToCreate;
import de.paul.EnergyToCreate.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class Registration {
	
	public static void register() {
		EnergyToCreate.LOGGER.error("Register ItemGroup");
		ModItemGroup.register();
	}
	
	@SubscribeEvent
	public static void onItemRegisterEvent(RegistryEvent.Register<Item> event) {
		EnergyToCreate.LOGGER.error("Register Items");
		ModItems.register(event.getRegistry());
		ModBlocks.registerBlockItems(event.getRegistry());
	}
	
	@SubscribeEvent
	public static void onBlockRegisterEvent(RegistryEvent.Register<Block> event) {
		EnergyToCreate.LOGGER.error("Register Blocks");
		ModBlocks.register(event.getRegistry());
	}
	
	@SubscribeEvent
	public static void onTileEntityTypeRegisterEvent(RegistryEvent.Register<TileEntityType<?>> event) {
		EnergyToCreate.LOGGER.error("Register TileEntitys");
		ModTileEntitys.register(event.getRegistry());
	}
}
