
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.atarikafa.heykeller.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AtarikafaHeykelleriModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item AMUDA_KALKAN_ATARIKAFA = register(AtarikafaHeykelleriModBlocks.AMUDA_KALKAN_ATARIKAFA,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item BLOGA_TIRMANAN_ATARIKAFA = register(AtarikafaHeykelleriModBlocks.BLOGA_TIRMANAN_ATARIKAFA,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item ELLERINI_KALDIRAN_ATARIKAFA = register(AtarikafaHeykelleriModBlocks.ELLERINI_KALDIRAN_ATARIKAFA,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item EL_SALLAYAN_ATARIKAFA = register(AtarikafaHeykelleriModBlocks.EL_SALLAYAN_ATARIKAFA,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item OTURAN_ATARIKAFA = register(AtarikafaHeykelleriModBlocks.OTURAN_ATARIKAFA, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item OZGUR_KAFA = register(AtarikafaHeykelleriModBlocks.OZGUR_KAFA, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item THOR_KAFA = register(AtarikafaHeykelleriModBlocks.THOR_KAFA, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item UCAN_ATARIKAFA = register(AtarikafaHeykelleriModBlocks.UCAN_ATARIKAFA, CreativeModeTab.TAB_BUILDING_BLOCKS);

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
