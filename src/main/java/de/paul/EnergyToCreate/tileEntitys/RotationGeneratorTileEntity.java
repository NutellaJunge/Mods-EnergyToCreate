package de.paul.EnergyToCreate.tileEntitys;

import com.simibubi.create.content.contraptions.base.GeneratingKineticTileEntity;
import de.paul.EnergyToCreate.setup.ModTileEntitys;

public class RotationGeneratorTileEntity extends GeneratingKineticTileEntity {

	public float speed = 20;
	
	public RotationGeneratorTileEntity() {
		super(ModTileEntitys.ROTATION_GENERATOR);
	}

	@Override
	public void tick() {
		
	}
	
	@Override
	public float getSpeed() {
		return speed;
	}

}
