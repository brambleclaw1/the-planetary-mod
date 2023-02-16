
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theplanetarymod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.theplanetarymod.block.AllayPlanetPortalBlock;
import net.mcreator.theplanetarymod.ThePlanetaryModMod;

public class ThePlanetaryModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ThePlanetaryModMod.MODID);
	public static final RegistryObject<Block> ALLAY_PLANET_PORTAL = REGISTRY.register("allay_planet_portal", () -> new AllayPlanetPortalBlock());
}
