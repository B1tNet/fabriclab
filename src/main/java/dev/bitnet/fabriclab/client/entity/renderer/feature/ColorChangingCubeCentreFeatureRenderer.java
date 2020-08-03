package dev.bitnet.fabriclab.client.entity.renderer.feature;

import dev.bitnet.fabriclab.client.entity.model.ColorChangingCubeEntityModel;
import dev.bitnet.fabriclab.client.entity.model.feature.ColorChangingCubeCentreModel;
import dev.bitnet.fabriclab.entity.ColorChangingCubeEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.util.Identifier;

import static dev.bitnet.fabriclab.FabricLab.MODID;

public class ColorChangingCubeCentreFeatureRenderer extends FeatureRenderer<ColorChangingCubeEntity, ColorChangingCubeEntityModel> {
    private static final Identifier TEXTURE = new Identifier(MODID, "textures/entity/color_changing_cube/core.png");
    private final ColorChangingCubeCentreModel MODEL = new ColorChangingCubeCentreModel();

    public ColorChangingCubeCentreFeatureRenderer(FeatureRendererContext<ColorChangingCubeEntity, ColorChangingCubeEntityModel> context) {
        super(context);
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, ColorChangingCubeEntity entity, float limbAngle, float limbDistance, float tickDelta, float animationProgress, float headYaw, float headPitch) {
        if (!entity.isInvisible()) {
            float[] rgb = SheepEntity.getRgbColor(entity.getColor());
            float v = rgb[0];
            float w = rgb[1];
            float x = rgb[2];
            render(this.getContextModel(), this.MODEL, TEXTURE, matrices, vertexConsumers, light, entity, limbAngle, limbDistance, tickDelta, animationProgress, headYaw, headPitch, v, w, x);
        }
    }
}
