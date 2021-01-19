package de.paul.EnergyToCreate.items;

import de.paul.EnergyToCreate.ModItemGroup;
import net.minecraft.item.Item;

public class AluminumIngot extends Item {

	public AluminumIngot() {
		super(new Item.Properties().group(ModItemGroup.ENERGYTOCREATE));
		setRegistryName("aluminum_ingot");
	}

}
