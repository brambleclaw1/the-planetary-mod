
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theplanetarymod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.biome.Biome;

import net.mcreator.theplanetarymod.world.biome.AllayBiomeBiome;
import net.mcreator.theplanetarymod.ThePlanetaryModMod;

public class ThePlanetaryModModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, ThePlanetaryModMod.MODID);
	public static final RegistryObject<Biome> ALLAY_BIOME = REGISTRY.register("allay_biome", AllayBiomeBiome::createBiome);
}
