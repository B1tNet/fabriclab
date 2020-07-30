package dev.bitnet.fabriclab.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static dev.bitnet.fabriclab.FabricLab.MODID;

public class ModEntities {
    public static final EntityType<BasicCubeEntity> BASIC_CUBE = Registry.register(Registry.ENTITY_TYPE, new Identifier(MODID, "basic_cube"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, BasicCubeEntity::new)
                    .dimensions(EntityDimensions.fixed(1, 1))
                    .build()
    );

    public static void registerEntityAttributes() {
        FabricDefaultAttributeRegistry.register(BASIC_CUBE, BasicCubeEntity.createMobAttributes());
    }
}
