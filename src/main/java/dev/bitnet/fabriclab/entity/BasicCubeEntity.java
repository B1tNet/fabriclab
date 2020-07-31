package dev.bitnet.fabriclab.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.world.World;

public class BasicCubeEntity extends MobEntity {
    public BasicCubeEntity(EntityType<? extends MobEntity> entityType, World world) {
        super(entityType, world);
    }
}
