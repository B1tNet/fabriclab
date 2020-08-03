package dev.bitnet.fabriclab.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.LookAroundGoal;
import net.minecraft.entity.ai.goal.LookAtEntityGoal;
import net.minecraft.entity.ai.goal.WanderAroundFarGoal;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public class BasicCubeEntity extends PathAwareEntity {

    protected BasicCubeEntity(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    public void tick() {
        super.tick();
    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(0, new WanderAroundFarGoal(this, 1.0D));
        this.goalSelector.add(1, new LookAtEntityGoal(this, PlayerEntity.class, 6.0F));
        this.goalSelector.add(2, new LookAroundGoal(this));
    }
}
