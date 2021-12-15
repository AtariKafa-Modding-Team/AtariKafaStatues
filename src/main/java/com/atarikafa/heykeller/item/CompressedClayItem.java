
package com.atarikafa.heykeller.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class CompressedClayItem extends Item {
	public CompressedClayItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("compressed_clay");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
