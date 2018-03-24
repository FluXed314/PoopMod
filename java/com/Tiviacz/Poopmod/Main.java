package com.Tiviacz.Poopmod;

import com.Tiviacz.Poopmod.init.ModSmelteryRecipes;
import com.Tiviacz.Poopmod.proxy.CommonProxy;
import com.Tiviacz.Poopmod.tab.PoopModTab;
import com.Tiviacz.Poopmod.util.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)

public class Main 

{
	
	
		public static CreativeTabs newtab = new PoopModTab(); 

		//Some Events Handlers
		@Instance
		public static Main instance;		
		@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
		public static CommonProxy proxy;
		@EventHandler
		public static void PreInit(FMLPreInitializationEvent event)
		{
			
		}
		@EventHandler
		public static void init(FMLInitializationEvent event)
		{
			ModSmelteryRecipes.init();
		}
		@EventHandler
		public static void PostInit(FMLPostInitializationEvent event)
		{
			
		}


}
