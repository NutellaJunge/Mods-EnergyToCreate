package de.paul.EnergyToCreate;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import de.paul.EnergyToCreate.setup.Registration;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(value = EnergyToCreate.MOD_ID)
public class EnergyToCreate {
	
	public static final String MOD_ID = "etoc";
	
	public static final Logger LOGGER = LogManager.getLogger();
	
	public EnergyToCreate() {
		Mod.EventBusSubscriber.Bus.MOD.bus().get().register(Registration.class);
		
		Registration.register();
	}
}
