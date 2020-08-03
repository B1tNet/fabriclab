package dev.bitnet.fabriclab.client.entity.model;

import dev.bitnet.fabriclab.entity.ColorChangingCubeEntity;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;

public class ColorChangingCubeEntityModel extends EntityModel<ColorChangingCubeEntity> {
    private final ModelPart base_north;
    private final ModelPart base_east;
    private final ModelPart base_south;
    private final ModelPart base_west;

    private final ModelPart pillar_northeast;
    private final ModelPart pillar_southeast;
    private final ModelPart pillar_southwest;
    private final ModelPart pillar_northwest;

    private final ModelPart upper_north;
    private final ModelPart upper_east;
    private final ModelPart upper_south;
    private final ModelPart upper_west;

    public ColorChangingCubeEntityModel() {
        textureHeight = 64;
        textureWidth = 64;

        base_north = new ModelPart(this, 0, 15);
        base_north.addCuboid(-8.0F, -1.0F, -8.0F, 16.0F, 1.0F, 1.0F, 0.0F, false);
        base_east = new ModelPart(this, 0, 0);
        base_east.addCuboid(-8.0F, -1.0F, -7.0F, 1.0F, 1.0F, 14.0F, 0.0F, false);
        base_south = new ModelPart(this, 0, 15);
        base_south.addCuboid(-8.0F, -1.0F, 7.0F, 16.0F, 1.0F, 1.0F, 0.0F, false);
        base_west = new ModelPart(this, 0, 0);
        base_west.addCuboid(7.0F, -1.0F, -7.0F, 1.0F, 1.0F, 14.0F, 0.0F, false);

        pillar_northeast = new ModelPart(this, 0, 17);
        pillar_northeast.addCuboid(-8.0F, -15.0F, -8.0F, 1.0F, 14.0F, 1.0F, 0.0F, false);
        pillar_southeast = new ModelPart(this, 0, 17);
        pillar_southeast.addCuboid(-8.0F, -15.0F, 7.0F, 1.0F, 14.0F, 1.0F, 0.0F, false);
        pillar_southwest = new ModelPart(this, 0, 17);
        pillar_southwest.addCuboid(7.0F, -15.0F, 7.0F, 1.0F, 14.0F, 1.0F, 0.0F, false);
        pillar_northwest = new ModelPart(this, 0, 17);
        pillar_northwest.addCuboid(7.0F, -15.0F, -8.0F, 1.0F, 14.0F, 1.0F, 0.0F, false);

        upper_north = new ModelPart(this,  0, 15);
        upper_north.addCuboid(-8.0F, -16.0F, -8.0F, 16.0F, 1.0F, 1.0F, 0.0F, false);
        upper_east = new ModelPart(this, 0, 0);
        upper_east.addCuboid(-8.0F, -16.0F, -7.0F, 1.0F, 1.0F, 14.0F, 0.0F, false);
        upper_south = new ModelPart(this, 0, 15);
        upper_south.addCuboid(-8.0F, -16.0F, 7.0F, 16.0F, 1.0F, 1.0F, 0.0F, false);
        upper_west = new ModelPart(this, 0, 0);
        upper_west.addCuboid(7.0F, -16.0F, -7.0F, 1.0F, 1.0F, 14.0F, 0.0F, false);
    }

    @Override
    public void setAngles(ColorChangingCubeEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {

    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
        matrices.translate(0, 1.5, 0);

        base_north.render(matrices, vertices, light, overlay, red, green, blue, alpha);
        base_east.render(matrices, vertices, light, overlay, red, green, blue, alpha);
        base_south.render(matrices, vertices, light, overlay, red, green, blue, alpha);
        base_west.render(matrices, vertices, light, overlay, red, green, blue, alpha);

        pillar_northeast.render(matrices, vertices, light, overlay, red, green, blue, alpha);
        pillar_southeast.render(matrices, vertices, light, overlay, red, green, blue, alpha);
        pillar_southwest.render(matrices, vertices, light, overlay, red, green, blue, alpha);
        pillar_northwest.render(matrices, vertices, light, overlay, red, green, blue, alpha);

        upper_north.render(matrices, vertices, light, overlay, red, green, blue, alpha);
        upper_east.render(matrices, vertices, light, overlay, red, green, blue, alpha);
        upper_south.render(matrices, vertices, light, overlay, red, green, blue, alpha);
        upper_west.render(matrices, vertices, light, overlay, red, green, blue, alpha);
    }
}
