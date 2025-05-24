package xzgyo.shit.item;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties SHIT = new FoodProperties.Builder()
            .alwaysEat()
            .nutrition(4)
            .saturationMod(.5f)
            .fast()
            .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 300), 1f) //md小可爱反胃居然叫这个
            .effect(() -> new MobEffectInstance(MobEffects.BLINDNESS, 600), 1f) //失明
            .effect(() -> new MobEffectInstance(MobEffects.WEAKNESS, 200), 1f) //肾虚（bushi）
            .build(); //粑粑

    public static final FoodProperties EGG_TART = new FoodProperties.Builder()
            .alwaysEat()
            .nutrition(4)
            .saturationMod(.5f)
            .fast()
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 400), 1f) //生命恢复
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 400), 1f) //抗火
            .effect(() -> new MobEffectInstance(MobEffects.SATURATION, 400), 1f) //饱和
            .build(); //蛋挞

    public static final FoodProperties PIZZA = new FoodProperties.Builder()
            .alwaysEat()
            .nutrition(4)
            .saturationMod(.5f)
            .fast()
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 400), 1f)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 400), 1f)
            .effect(() -> new MobEffectInstance(MobEffects.SATURATION, 400), 1f)
            .build(); //批萨

    public static final FoodProperties CABBAGE = new FoodProperties.Builder()
            .alwaysEat()
            .nutrition(4)
            .saturationMod(.5f)
            .fast()
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 400), 1f)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 400), 1f)
            .effect(() -> new MobEffectInstance(MobEffects.SATURATION, 400), 1f)
            .build(); //白菜
}
