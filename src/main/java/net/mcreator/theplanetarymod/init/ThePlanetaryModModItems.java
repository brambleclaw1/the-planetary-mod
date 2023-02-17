
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theplanetarymod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.theplanetarymod.item.WardenPlanetItem;
import net.mcreator.theplanetarymod.item.SnifferDimensionItem;
import net.mcreator.theplanetarymod.item.SlimeDimensionItem;
import net.mcreator.theplanetarymod.item.AllayPlanetItem;
import net.mcreator.theplanetarymod.ThePlanetaryModMod;

public class ThePlanetaryModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ThePlanetaryModMod.MODID);
	public static final RegistryObject<Item> ALLAY_PLANET = REGISTRY.register("allay_planet", () -> new AllayPlanetItem());
	public static final RegistryObject<Item> WARDEN_PLANET = REGISTRY.register("warden_planet", () -> new WardenPlanetItem());
	public static final RegistryObject<Item> SLIME_DIMENSION = REGISTRY.register("slime_dimension", () -> new SlimeDimensionItem());
	public static final RegistryObject<Item> SNIFFER_DIMENSION = REGISTRY.register("sniffer_dimension", () -> new SnifferDimensionItem());
}
