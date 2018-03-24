package com.Tiviacz.Poopmod.init.base;

import com.Tiviacz.Poopmod.Main;
import com.Tiviacz.Poopmod.init.ModItems;
import com.Tiviacz.Poopmod.util.IHasModel;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item.ToolMaterial;

public class PickaxeBase extends ItemPickaxe implements IHasModel 
{
	public PickaxeBase(String name, ToolMaterial material) {
		
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.newtab);
		
		ModItems.ITEMS.add(this);
	}
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this, 0,"inventory");
}
}


