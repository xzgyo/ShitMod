package xzgyo.shit.client.model;

import net.minecraft.client.model.PlayerModel;
import net.minecraft.client.model.geom.LayerDefinitions;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.resources.ResourceLocation;
import xzgyo.shit.ShitMod;

public class SiChuanFenDaModel extends PlayerModel {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(ShitMod.MOD_ID, "si_chuan_fen_da"), "main");

    public SiChuanFenDaModel(ModelPart part, boolean slim) {
        super(part, slim);
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshDef = createMesh(new CubeDeformation(0f), true);
        return LayerDefinition.create(meshDef, 64, 64);
    }
}
