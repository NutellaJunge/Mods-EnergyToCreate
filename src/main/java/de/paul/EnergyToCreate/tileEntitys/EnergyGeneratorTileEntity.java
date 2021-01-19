package de.paul.EnergyToCreate.tileEntitys;

import com.simibubi.create.content.contraptions.base.KineticTileEntity;

import de.paul.EnergyToCreate.EnergyToCreate;
import de.paul.EnergyToCreate.setup.ModTileEntitys;

public class EnergyGeneratorTileEntity extends KineticTileEntity {

	public EnergyGeneratorTileEntity() {
		super(ModTileEntitys.ENERGY_GENERATOR);
	}

	@Override
	public void tick() {
		int speed = (int) Math.abs(getSpeed());
		
		if (speed == 0)
			return;
		
		EnergyToCreate.LOGGER.error("Energy Speed: "+speed);
	}

}
