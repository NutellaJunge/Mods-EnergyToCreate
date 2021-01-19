package de.paul.EnergyToCreate.items;

import de.paul.EnergyToCreate.ModItemGroup;
import net.minecraft.item.Item;

public class RedstoneAlloy extends Item {

	public RedstoneAlloy() {
		super(new Item.Properties().group(ModItemGroup.ENERGYTOCREATE));
		setRegistryName("redstone_alloy");
	}
}
