package de.paul.EnergyToCreate.items;

import de.paul.EnergyToCreate.ModItemGroup;
import net.minecraft.item.Item;

public class Capacitor extends Item {

	public Capacitor() {
		super(new Item.Properties().group(ModItemGroup.ENERGYTOCREATE));
		setRegistryName("capacitor");
	}

}
