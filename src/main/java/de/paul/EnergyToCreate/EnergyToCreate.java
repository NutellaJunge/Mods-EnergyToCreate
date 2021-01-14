package de.paul.EnergyToCreate;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import de.paul.EnergyToCreate.setup.Registration;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(value = EnergyToCreate.MOD_ID)
public class EnergyToCreate {
	
	public static final String MOD_ID = "etoc";
	
	public static final Logger LOGGER = LogManager.getLogger();
	
	public EnergyToCreate() {
		Registration.register();
		
		MinecraftForge.EVENT_BUS.register(this);
	}
}
