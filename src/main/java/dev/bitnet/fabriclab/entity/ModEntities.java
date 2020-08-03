package dev.bitnet.fabriclab.entity;

import dev.bitnet.fabriclab.client.entity.renderer.BasicCubeEntityRenderer;
import dev.bitnet.fabriclab.client.entity.renderer.ColorChangingCubeEntityRenderer;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static dev.bitnet.fabriclab.FabricLab.MODID;

public class ModEntities {

    public static final EntityType<BasicCubeEntity> BASIC_CUBE = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier(MODID, "basic_cube"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, BasicCubeEntity::new)
                    .dimensions(EntityDimensions.fixed(1, 1))
                    .build()
    );

    public static final EntityType<ColorChangingCubeEntity> COLOR_CHANGING_CUBE = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier(MODID, "color_changing_cube"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, ColorChangingCubeEntity::new)
                    .dimensions(EntityDimensions.fixed(1,1))
                    .build()
    );

    public static void registerEntityAttributes() {
        FabricDefaultAttributeRegistry.register(BASIC_CUBE, BasicCubeEntity.createMobAttributes());
        FabricDefaultAttributeRegistry.register(COLOR_CHANGING_CUBE, ColorChangingCubeEntity.createMobAttributes());
    }

    public static void registerEntityRenderers() {
        EntityRendererRegistry.INSTANCE.register(BASIC_CUBE, (entityRenderDispatcher, context) -> new BasicCubeEntityRenderer(entityRenderDispatcher));
        EntityRendererRegistry.INSTANCE.register(COLOR_CHANGING_CUBE, (entityRenderDispatcher, context) -> new ColorChangingCubeEntityRenderer(entityRenderDispatcher));
    }
}
