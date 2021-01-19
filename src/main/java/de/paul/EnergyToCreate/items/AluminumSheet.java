package de.paul.EnergyToCreate.items;

import de.paul.EnergyToCreate.ModItemGroup;
import net.minecraft.item.Item;

public class AluminumSheet extends Item {

	public AluminumSheet() {
		super(new Item.Properties().group(ModItemGroup.ENERGYTOCREATE));
		setRegistryName("aluminum_sheet");
	}

}
