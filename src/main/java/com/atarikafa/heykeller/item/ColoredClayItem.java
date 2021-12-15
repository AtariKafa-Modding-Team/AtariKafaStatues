
package com.atarikafa.heykeller.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import com.atarikafa.heykeller.init.AtarikafaHeykelleriModTabs;

public class ColoredClayItem extends Item {
	public ColoredClayItem() {
		super(new Item.Properties().tab(AtarikafaHeykelleriModTabs.TAB_ATARIKAFA_HEYKELLERI).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("colored_clay");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
