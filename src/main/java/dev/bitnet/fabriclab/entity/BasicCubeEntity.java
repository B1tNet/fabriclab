package dev.bitnet.fabriclab.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.world.World;

public class BasicCubeEntity extends AnimalEntity {

    protected BasicCubeEntity(EntityType<? extends AnimalEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    public PassiveEntity createChild(PassiveEntity mate) {
        return null;
    }
}
