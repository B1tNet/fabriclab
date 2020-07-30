package dev.bitnet.fabriclab.client.entity.renderer;

import dev.bitnet.fabriclab.client.entity.model.BasicCubeEntityModel;
import dev.bitnet.fabriclab.entity.BasicCubeEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

import static dev.bitnet.fabriclab.FabricLab.MODID;

public class BasicCubeRenderer extends MobEntityRenderer<BasicCubeEntity, BasicCubeEntityModel> {
    public BasicCubeRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new BasicCubeEntityModel(), 1f);
    }

    @Override
    public Identifier getTexture(BasicCubeEntity entity) {
        return new Identifier(MODID, "textures/entity/basic_cube/basic_cube.png");
    }
}
