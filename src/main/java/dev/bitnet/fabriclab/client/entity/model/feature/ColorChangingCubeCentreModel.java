package dev.bitnet.fabriclab.client.entity.model.feature;

import dev.bitnet.fabriclab.entity.ColorChangingCubeEntity;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;

public class ColorChangingCubeCentreModel extends EntityModel<ColorChangingCubeEntity> {
    private ModelPart base;

    public ColorChangingCubeCentreModel() {
        textureHeight = 28;
        textureWidth = 56;

        base = new ModelPart(this, 0, 0);
        base.addCuboid(-7,-7,-7, 14, 14, 14);
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
        matrices.translate(0,-0.5,0);
        base.render(matrices, vertices, light, overlay, red, green, blue, alpha);
    }

    @Override
    public void setAngles(ColorChangingCubeEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {

    }
}
