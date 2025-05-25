package xzgyo.shit.events;

import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.entity.SpawnPlacementRegisterEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import xzgyo.shit.ShitMod;
import xzgyo.shit.entity.ModEntities;
import xzgyo.shit.entity.SiChuanFenDa;

@Mod.EventBusSubscriber(modid = ShitMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CommonModEvents {
    @SubscribeEvent
    public static void entityAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.SI_CHUAN_FEN_DA.get(), SiChuanFenDa.createAttributes().build());
    }

    @SubscribeEvent
    public static void registerSpawnPlacements(SpawnPlacementRegisterEvent event) {
        event.register(
                ModEntities.SI_CHUAN_FEN_DA.get(),
                SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.WORLD_SURFACE,
                SiChuanFenDa::canSpawn,
                SpawnPlacementRegisterEvent.Operation.OR
        );

    }
}
