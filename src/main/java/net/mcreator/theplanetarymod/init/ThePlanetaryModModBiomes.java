
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theplanetarymod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.biome.Biome;

import net.mcreator.theplanetarymod.world.biome.WardenBiomeBiome;
import net.mcreator.theplanetarymod.world.biome.SnifferBiomeBiome;
import net.mcreator.theplanetarymod.world.biome.SlimeBiomeBiome;
import net.mcreator.theplanetarymod.world.biome.ObsidianPinnaclesBiome;
import net.mcreator.theplanetarymod.world.biome.AllayBiomeBiome;
import net.mcreator.theplanetarymod.ThePlanetaryModMod;

public class ThePlanetaryModModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, ThePlanetaryModMod.MODID);
	public static final RegistryObject<Biome> ALLAY_BIOME = REGISTRY.register("allay_biome", AllayBiomeBiome::createBiome);
	public static final RegistryObject<Biome> WARDEN_BIOME = REGISTRY.register("warden_biome", WardenBiomeBiome::createBiome);
	public static final RegistryObject<Biome> SLIME_BIOME = REGISTRY.register("slime_biome", SlimeBiomeBiome::createBiome);
	public static final RegistryObject<Biome> SNIFFER_BIOME = REGISTRY.register("sniffer_biome", SnifferBiomeBiome::createBiome);
	public static final RegistryObject<Biome> OBSIDIAN_PINNACLES = REGISTRY.register("obsidian_pinnacles", ObsidianPinnaclesBiome::createBiome);
}
