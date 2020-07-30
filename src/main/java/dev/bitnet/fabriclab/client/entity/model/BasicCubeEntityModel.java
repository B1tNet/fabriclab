package dev.bitnet.fabriclab.client.entity.model;

import dev.bitnet.fabriclab.entity.BasicCubeEntity;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;

public class BasicCubeEntityModel extends EntityModel<BasicCubeEntity> {
    private final ModelPart base;

    public BasicCubeEntityModel() {
        this.textureHeight = 32;
        this.textureWidth = 64;

        base = new ModelPart(this, 0, 0);
        base.addCuboid(-8, -8, -8, 16, 16, 16);
    }

    @Override
    public void setAngles(BasicCubeEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {

    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
        matrices.translate(0, 1, 0);

        base.render(matrices, vertices, light, overlay, red, green, blue, alpha);
    }
}
