package de.paul.EnergyToCreate.setup;

import de.paul.EnergyToCreate.items.AluminumIngot;
import de.paul.EnergyToCreate.items.AluminumSheet;
import de.paul.EnergyToCreate.items.Capacitor;
import de.paul.EnergyToCreate.items.RedstoneAlloy;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {
	
	public static final Item REDSTONE_ALLOY = new RedstoneAlloy();
	public static final Item ALUMINUM_INGOT = new AluminumIngot();
	public static final Item ALUMINUM_SHEET = new AluminumSheet();
	public static final Item CAPACITOR = new Capacitor();

	public static void register(IForgeRegistry<Item> registry) {
		registry.register(REDSTONE_ALLOY);
		registry.register(ALUMINUM_INGOT);
		registry.register(ALUMINUM_SHEET);
		registry.register(CAPACITOR);
	}
}
