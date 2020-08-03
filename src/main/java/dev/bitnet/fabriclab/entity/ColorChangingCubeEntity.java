package dev.bitnet.fabriclab.entity;

import net.minecraft.entity.EntityData;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.ai.goal.LookAroundGoal;
import net.minecraft.entity.ai.goal.LookAtEntityGoal;
import net.minecraft.entity.ai.goal.WanderAroundFarGoal;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.util.DyeColor;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.LocalDifficulty;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

public class ColorChangingCubeEntity extends PathAwareEntity {
    private static final TrackedData<Byte> COLOR;

    protected ColorChangingCubeEntity(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(0, new WanderAroundFarGoal(this, 1.0D));
        this.goalSelector.add(1, new LookAtEntityGoal(this, PlayerEntity.class, 6.0F));
        this.goalSelector.add(2, new LookAroundGoal(this));
    }

    @Override
    public void tick() {
        super.tick();

        BlockPos posBelow = this.getBlockPos().add(0, -1, 0);

        String blockSelected;
        if (world.getBlockState(getBlockPos()).getBlock().getTranslationKey().contains("banner") || world.getBlockState(getBlockPos()).getBlock().getTranslationKey().contains("carpet")) {
            blockSelected = world.getBlockState(getBlockPos()).getBlock().getTranslationKey();
        } else {
            blockSelected = world.getBlockState(posBelow).getBlock().getTranslationKey();
        }

        if (blockSelected.contains("white")) {
            setColor(DyeColor.WHITE);
        } else if(blockSelected.contains("orange")) {
            setColor(DyeColor.ORANGE);
        } else if(blockSelected.contains("magenta")) {
            setColor(DyeColor.MAGENTA);
        } else if (blockSelected.contains("light_blue")) {
            setColor(DyeColor.LIGHT_BLUE);
        } else if (blockSelected.contains("yellow")) {
            setColor(DyeColor.YELLOW);
        } else if (blockSelected.contains("lime")) {
            setColor(DyeColor.LIME);
        } else if (blockSelected.contains("pink")) {
            setColor(DyeColor.PINK);
        } else if (blockSelected.contains("gray")) {
            setColor(DyeColor.GRAY);
        } else if (blockSelected.contains("light_gray")) {
            setColor(DyeColor.LIGHT_GRAY);
        } else if (blockSelected.contains("cyan")) {
            setColor(DyeColor.CYAN);
        } else if (blockSelected.contains("purple")) {
            setColor(DyeColor.PURPLE);
        } else if (blockSelected.contains("blue")) {
            setColor(DyeColor.BLUE);
        } else if (blockSelected.contains("brown")) {
            setColor(DyeColor.BROWN);
        } else if (blockSelected.contains("green")) {
            setColor(DyeColor.GREEN);
        } else if (blockSelected.contains("red")) {
            setColor(DyeColor.RED);
        } else if (blockSelected.contains("black")) {
            setColor(DyeColor.BLACK);
        }
    }

    @Override
    public void writeCustomDataToTag(CompoundTag tag) {
        super.writeCustomDataToTag(tag);
        tag.putByte("Color", (byte)this.getColor().getId());
    }

    @Override
    public void readCustomDataFromTag(CompoundTag tag) {
        super.readCustomDataFromTag(tag);
        this.setColor(DyeColor.byId(tag.getByte("Color")));
    }

    @Override
    protected void initDataTracker() {
        super.initDataTracker();
        this.dataTracker.startTracking(COLOR, (byte)0);
    }

    public DyeColor getColor() {
        return DyeColor.byId(this.dataTracker.get(COLOR) & 15);
    }

    public void setColor(DyeColor color) {
        byte b = this.dataTracker.get(COLOR);
        this.dataTracker.set(COLOR, (byte)(b & 240 | color.getId() & 15));
    }

    @Override
    public EntityData initialize(WorldAccess world, LocalDifficulty difficulty, SpawnReason spawnReason, EntityData entityData, CompoundTag entityTag) {
        this.setColor(DyeColor.WHITE);
        return super.initialize(world, difficulty, spawnReason, entityData, entityTag);
    }

    static {
        COLOR = DataTracker.registerData(ColorChangingCubeEntity.class, TrackedDataHandlerRegistry.BYTE);
    }
}
