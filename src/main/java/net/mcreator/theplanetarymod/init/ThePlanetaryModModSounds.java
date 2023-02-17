
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theplanetarymod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.theplanetarymod.ThePlanetaryModMod;

public class ThePlanetaryModModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, ThePlanetaryModMod.MODID);
	public static final RegistryObject<SoundEvent> ALLAY_MUSIC = REGISTRY.register("allay_music",
			() -> new SoundEvent(new ResourceLocation("the_planetary_mod", "allay_music")));
	public static final RegistryObject<SoundEvent> OBSIDIAN_PINNACLE = REGISTRY.register("obsidian_pinnacle",
			() -> new SoundEvent(new ResourceLocation("the_planetary_mod", "obsidian_pinnacle")));
}
