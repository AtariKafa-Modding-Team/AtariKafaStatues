
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.atarikafa.heykeller.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import java.util.List;
import java.util.ArrayList;

import com.atarikafa.heykeller.block.UcanAtarikafaBlock;
import com.atarikafa.heykeller.block.ThorKafaBlock;
import com.atarikafa.heykeller.block.OzgurKafaBlock;
import com.atarikafa.heykeller.block.OturanAtarikafaBlock;
import com.atarikafa.heykeller.block.ElleriniKaldiranAtarikafaBlock;
import com.atarikafa.heykeller.block.ElSallayanAtarikafaBlock;
import com.atarikafa.heykeller.block.BlogaTirmananAtarikafaBlock;
import com.atarikafa.heykeller.block.AmudaKalkanAtarikafaBlock;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AtarikafaHeykelleriModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block AMUDA_KALKAN_ATARIKAFA = register(new AmudaKalkanAtarikafaBlock());
	public static final Block BLOGA_TIRMANAN_ATARIKAFA = register(new BlogaTirmananAtarikafaBlock());
	public static final Block ELLERINI_KALDIRAN_ATARIKAFA = register(new ElleriniKaldiranAtarikafaBlock());
	public static final Block EL_SALLAYAN_ATARIKAFA = register(new ElSallayanAtarikafaBlock());
	public static final Block OTURAN_ATARIKAFA = register(new OturanAtarikafaBlock());
	public static final Block OZGUR_KAFA = register(new OzgurKafaBlock());
	public static final Block THOR_KAFA = register(new ThorKafaBlock());
	public static final Block UCAN_ATARIKAFA = register(new UcanAtarikafaBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			AmudaKalkanAtarikafaBlock.registerRenderLayer();
			BlogaTirmananAtarikafaBlock.registerRenderLayer();
			ElleriniKaldiranAtarikafaBlock.registerRenderLayer();
			ElSallayanAtarikafaBlock.registerRenderLayer();
			OturanAtarikafaBlock.registerRenderLayer();
			OzgurKafaBlock.registerRenderLayer();
			ThorKafaBlock.registerRenderLayer();
			UcanAtarikafaBlock.registerRenderLayer();
		}
	}
}
