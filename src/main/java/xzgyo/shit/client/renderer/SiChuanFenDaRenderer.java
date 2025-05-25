package xzgyo.shit.client.renderer;

import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.PlayerModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import xzgyo.shit.ShitMod;
import xzgyo.shit.client.model.SiChuanFenDaModel;
import xzgyo.shit.entity.SiChuanFenDa;

public class SiChuanFenDaRenderer extends MobRenderer<SiChuanFenDa, PlayerModel<SiChuanFenDa>> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(ShitMod.MOD_ID, "textures/entity/si_chuan_fen_da.png");
    public SiChuanFenDaRenderer(EntityRendererProvider.Context ctx) {
        super(ctx, new PlayerModel<>(ctx.bakeLayer(SiChuanFenDaModel.LAYER_LOCATION), false), 1.0f);
    }

    @Override
    public ResourceLocation getTextureLocation(SiChuanFenDa entity) {
        return TEXTURE;
    }
}
