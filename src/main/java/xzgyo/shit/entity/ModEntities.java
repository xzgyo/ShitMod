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
                    .sized(0.1f, 0.1f)
                    .build(new ResourceLocation(ShitMod.MOD_ID, "shitball").toString())
    );

    public static final RegistryObject<EntityType<Cabbage>> CABBAGE = ENTITIES.register("cabbage",
            () -> EntityType.Builder.<Cabbage>of(Cabbage::new, MobCategory.MISC)
                    .sized(0.1f, 0.1f)
                    .build(new ResourceLocation(ShitMod.MOD_ID, "cabbage").toString())
    );

    public static final RegistryObject<EntityType<SiChuanFenDa>> SI_CHUAN_FEN_DA = ENTITIES.register("si_chuan_fen_da",
            () -> EntityType.Builder.<SiChuanFenDa>of(SiChuanFenDa::new, MobCategory.MONSTER)
                    .setTrackingRange(64)
                    .setUpdateInterval(3)
                    .sized(.6f, 1.8f)
                    .build(new ResourceLocation(ShitMod.MOD_ID, "si_chuan_fen_da").toString())
    );
}
