package xzgyo.shit.events;

import net.minecraft.client.model.PlayerModel;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import xzgyo.shit.ShitMod;
import xzgyo.shit.client.model.SiChuanFenDaModel;
import xzgyo.shit.client.renderer.SiChuanFenDaRenderer;
import xzgyo.shit.entity.ModEntities;

@Mod.EventBusSubscriber(modid = ShitMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientModEvents {
    @SubscribeEvent
    public static void registerRenders(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(ModEntities.SI_CHUAN_FEN_DA.get(), SiChuanFenDaRenderer::new);
    }

    @SubscribeEvent
    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(SiChuanFenDaModel.LAYER_LOCATION, SiChuanFenDaModel::createBodyLayer);
    }
}
