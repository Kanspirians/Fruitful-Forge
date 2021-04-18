package com.teamaurora.fruitful.core.registry;

import com.teamaurora.fruitful.common.potion.SustainingEffect;
import com.teamaurora.fruitful.core.Fruitful;
import net.minecraft.potion.Effect;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = Fruitful.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class FruitfulEffects {
    public static final DeferredRegister<Effect> EFFECTS = DeferredRegister.create(ForgeRegistries.POTIONS, Fruitful.MODID);

    public static RegistryObject<Effect> SUSTAINING = EFFECTS.register("sustaining", SustainingEffect::new);
}
