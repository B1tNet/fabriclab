package dev.bitnet.fabriclab.client.entity.renderer;

import dev.bitnet.fabriclab.client.entity.model.BasicCubeEntityModel;
import dev.bitnet.fabriclab.entity.BasicCubeEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

import static dev.bitnet.fabriclab.FabricLab.MODID;

public class BasicCubeEntityRenderer extends MobEntityRenderer<BasicCubeEntity, BasicCubeEntityModel> {
    private Identifier texture = new Identifier(MODID, "textures/entity/basic_cube/basic_cube.png");

    public BasicCubeEntityRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new BasicCubeEntityModel(), 1f);
    }

    @Override
    public Identifier getTexture(BasicCubeEntity entity) {
        return texture;
    }

    @Override
    public void render(BasicCubeEntity mobEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
