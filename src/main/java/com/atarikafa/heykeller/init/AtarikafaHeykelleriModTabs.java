
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.atarikafa.heykeller.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class AtarikafaHeykelleriModTabs {
	public static CreativeModeTab TAB_ATARIKAFA_HEYKELLERI;

	public static void load() {
		TAB_ATARIKAFA_HEYKELLERI = new CreativeModeTab("tabatarikafa_heykelleri") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(AtarikafaHeykelleriModBlocks.BLOGA_TIRMANAN_ATARIKAFA);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
