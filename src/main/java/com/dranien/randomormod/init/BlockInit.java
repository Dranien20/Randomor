package com.dranien.randomormod.init;

import java.util.ArrayList;
import java.util.List;

import com.dranien.randomormod.objects.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit {
	public static List<Block> BLOCKS = new ArrayList<Block>();
	
	//Block
	public static final Block BLOCK_TUTO = new BlockBase("block_tuto", Material.IRON, 6.0F, 30.0F, 2, "pickaxe");
}
