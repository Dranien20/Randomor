package com.dranien.randomormod;

import com.dranien.randomormod.proxy.CommonProxy;
import com.dranien.randomormod.util.References;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = References.MODID, name = References.NAME, version = References.VERSION, acceptedMinecraftVersions = References.MINECRAFT_VERSION)
public class Main
{

	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = References.CLIENT_PROXY, serverSide = References.COMMON_PROXY)
	public static CommonProxy proxy;
	
	public static org.apache.logging.log4j.Logger logger;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent a) {
		logger = a.getModLog();
		
		proxy.preInit();
	}
	
	@EventHandler
	public static void Init(FMLInitializationEvent a) {
		
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent a) {
		
	}
}
