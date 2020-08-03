package dev.bitnet.fabriclab.client.entity.renderer;

import dev.bitnet.fabriclab.client.entity.model.ColorChangingCubeEntityModel;
import dev.bitnet.fabriclab.client.entity.renderer.feature.ColorChangingCubeCentreFeatureRenderer;
import dev.bitnet.fabriclab.entity.ColorChangingCubeEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

import static dev.bitnet.fabriclab.FabricLab.MODID;

public class ColorChangingCubeEntityRenderer extends MobEntityRenderer<ColorChangingCubeEntity, ColorChangingCubeEntityModel> {
    public ColorChangingCubeEntityRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new ColorChangingCubeEntityModel(), 1.0f);
        this.addFeature(new ColorChangingCubeCentreFeatureRenderer(this));
    }

    @Override
    public Identifier getTexture(ColorChangingCubeEntity entity) {
        return new Identifier(MODID, "textures/entity/color_changing_cube/frame.png");
    }
}
