package de.paul.EnergyToCreate.setup;

import com.simibubi.create.repack.registrate.AbstractRegistrate;

import de.paul.EnergyToCreate.EnergyToCreate;
import de.paul.EnergyToCreate.items.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Registration extends AbstractRegistrate<Registration> {
	
	protected Registration() {
		super(EnergyToCreate.MOD_ID);
	}
	
	public static final Registration REGISTRATION = new Registration();

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, EnergyToCreate.MOD_ID);
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, EnergyToCreate.MOD_ID);
	public static final DeferredRegister<TileEntityType<?>> TILE_ENTITYS = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, EnergyToCreate.MOD_ID);
	
	public static void register() {
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		
		ITEMS.register(modEventBus);
		BLOCKS.register(modEventBus);
		TILE_ENTITYS.register(modEventBus);
		
		ModItemGroup.register();
		
		ModItems.register();
		ModBlocks.register();
		ModTileEntitys.register();
	}
}
