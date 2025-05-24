package xzgyo.shit.entity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import xzgyo.shit.ShitMod;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ShitMod.MOD_ID);

    public static final RegistryObject<EntityType<ShitBall>> SHITBALL = ENTITIES.register("shitball",
            () -> EntityType.Builder.<ShitBall>of(ShitBall::new, MobCategory.MISC)
                    .sized(1.0f, 1.0f)
                    .build(new ResourceLocation(ShitMod.MOD_ID, "shitball").toString())
    );
}
