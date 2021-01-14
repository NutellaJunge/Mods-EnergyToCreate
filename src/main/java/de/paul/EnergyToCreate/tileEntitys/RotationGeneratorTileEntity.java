package de.paul.EnergyToCreate.tileEntitys;

import com.simibubi.create.content.contraptions.base.GeneratingKineticTileEntity;
import de.paul.EnergyToCreate.EnergyToCreate;
import de.paul.EnergyToCreate.setup.ModTileEntitys;

public class RotationGeneratorTileEntity extends GeneratingKineticTileEntity {

	public RotationGeneratorTileEntity() {
		super(ModTileEntitys.ROTATION_GENERATOR.get());
	}

	@Override
	public void tick() {
		EnergyToCreate.LOGGER.debug("Speed: "+getSpeed());
	}

}
