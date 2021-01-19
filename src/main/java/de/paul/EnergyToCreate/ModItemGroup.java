package de.paul.EnergyToCreate;

import de.paul.EnergyToCreate.setup.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup extends ItemGroup {
	
	public static final ItemGroup ENERGYTOCREATE = new ModItemGroup();

	public ModItemGroup() {
		super("etoc_group");
	}

	@Override
	public ItemStack createIcon() {
		return new ItemStack(ModItems.REDSTONE_ALLOY);
	}

	public static void register() {}

}
