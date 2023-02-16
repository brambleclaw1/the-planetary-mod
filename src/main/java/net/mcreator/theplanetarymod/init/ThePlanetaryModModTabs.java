
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theplanetarymod.init;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class ThePlanetaryModModTabs {
	public static CreativeModeTab TAB_PLANETARY_MOD;

	public static void load() {
		TAB_PLANETARY_MOD = new CreativeModeTab("tabplanetary_mod") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.NETHER_PORTAL);
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
