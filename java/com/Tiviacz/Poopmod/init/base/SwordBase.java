package com.Tiviacz.Poopmod.init.base;

import com.Tiviacz.Poopmod.Main;
import com.Tiviacz.Poopmod.init.ModItems;
import com.Tiviacz.Poopmod.util.IHasModel;

import net.minecraft.item.ItemSword;

public class SwordBase extends ItemSword implements IHasModel
{

	public SwordBase(String name, ToolMaterial material) {
		
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
