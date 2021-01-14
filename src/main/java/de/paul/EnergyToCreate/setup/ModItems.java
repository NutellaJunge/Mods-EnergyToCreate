package de.paul.EnergyToCreate.setup;

import de.paul.EnergyToCreate.EnergyToCreate;
import de.paul.EnergyToCreate.items.AluminumIngot;
import de.paul.EnergyToCreate.items.AluminumSheet;
import de.paul.EnergyToCreate.items.Capacitor;
import de.paul.EnergyToCreate.items.RedstoneAlloy;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {
	
	public static RegistryObject<Item> REDSTONE_ALLOY = Registration.ITEMS.register("redstone_alloy", () -> new RedstoneAlloy());
	
	public static RegistryObject<Item> ALUMINUM_INGOT = Registration.ITEMS.register("aluminum_ingot", () -> new AluminumIngot());
	public static RegistryObject<Item> ALUMINUM_SHEET = Registration.ITEMS.register("aluminum_sheet", () -> new AluminumSheet());
	
	public static RegistryObject<Item> CAPACITOR = Registration.ITEMS.register("capacitor", () -> new Capacitor());
	
	public static void register() {
		EnergyToCreate.LOGGER.error("Register Items");
	}
}
