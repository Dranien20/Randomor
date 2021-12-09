package com.dranien.randomormod.objects.blocks;

import com.dranien.randomormod.Main;
import com.dranien.randomormod.init.BlockInit;
import com.dranien.randomormod.init.ItemInit;
import com.dranien.randomormod.util.interfaces.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.creativetab.CreativeTabs;


public class BlockBase extends Block implements IHasModel{

	public BlockBase(String name, Material material, float hardness, float resistance, int minigLevel, String tool) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(hardness);
		setResistance(resistance);
		setHarvestLevel(tool, minigLevel);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(name));
	}
	
	@Override
	public void registerModels(){
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0);
	}
}
