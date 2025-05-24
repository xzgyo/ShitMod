package xzgyo.shit.item;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties SHIT = new FoodProperties.Builder()
            .alwaysEat()
            .nutrition(1)
            .saturationMod(.5f)
            .fast()
            .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 300), 1f) //md小可爱反胃居然叫这个
            .effect(() -> new MobEffectInstance(MobEffects.BLINDNESS, 600), 1f) //失明
            .effect(() -> new MobEffectInstance(MobEffects.WEAKNESS, 200), 1f) //肾虚（bushi）
            .build(); //粑粑

    public static final FoodProperties EGG_TART = new FoodProperties.Builder()
            .alwaysEat()
            .nutrition(3)
            .saturationMod(2f)
            .fast()
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 400), 1f) //生命恢复
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 400), 1f) //抗火
            .effect(() -> new MobEffectInstance(MobEffects.SATURATION, 400), 1f) //饱和
            .build(); //蛋挞

    public static final FoodProperties PIZZA = new FoodProperties.Builder()
            .alwaysEat()
            .nutrition(5)
            .saturationMod(5f)
            .effect(() -> new MobEffectInstance(MobEffects.WATER_BREATHING, 400), 1f) //水下呼吸
            .effect(() -> new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 400), 1f) //村庄英雄
            .build(); //比萨

    public static final FoodProperties CABBAGE = new FoodProperties.Builder()
            .alwaysEat()
            .nutrition(2)
            .saturationMod(2f)
            .effect(() -> new MobEffectInstance(MobEffects.POISON, 450), 1f) //中毒
            .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 400), 12f) //生命恢复
            .build(); //白菜

    public static final FoodProperties PLATE = new FoodProperties.Builder()
            .alwaysEat()
            .nutrition(5)
            .saturationMod(5f)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 3600), 1f) //急迫
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 450), 1f) //抗性提升
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 400),  2f) //力量
            .build(); //盘菜

    public static final FoodProperties EGG_FRIED_RICE = new FoodProperties.Builder()
            .alwaysEat()
            .nutrition(5)
            .saturationMod(6f)
            /*.effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 3600), 1f) //急迫
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 450), 1f) //抗性提升
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 400),  2f) //力量*/
            .build(); //盘菜
}
