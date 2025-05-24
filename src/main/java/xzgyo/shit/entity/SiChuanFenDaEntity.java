package xzgyo.shit.entity;


import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import xzgyo.shit.item.ModItems;

import javax.annotation.Nullable;

public class SiChuanFenDaEntity extends Animal {

    public SiChuanFenDaEntity(EntityType<? extends Animal> type, Level level) {
        super(type, level);
    }

    public  SiChuanFenDaEntity(Level level, double x, double y, double z) {
        this(ModEntities.SI_CHUAN_FEN_DA_ENTITY.get(), level);
        setPos(x, y, z);
    }

    public SiChuanFenDaEntity(Level level, BlockPos position) {
        this(level, position.getX(), position.getY(), position.getZ());
    }

    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel level, AgeableMob otherParent) {
        return new SiChuanFenDaEntity(level, this.blockPosition());
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new FloatGoal(this));
        this.goalSelector.addGoal(1, new PanicGoal(this, 1.25d));
        this.goalSelector.addGoal(3, new BreedGoal(this, 1.0d));
        this.goalSelector.addGoal(5, new FollowParentGoal(this, 1.1d));
        this.goalSelector.addGoal(6, new WaterAvoidingRandomStrollGoal(this, 1.0d));
        this.goalSelector.addGoal(7, new LookAtPlayerGoal(this, Player.class, 6.0f));
        this.goalSelector.addGoal(8, new RandomLookAroundGoal((this)));
        this.goalSelector.addGoal(9, new TemptGoal(this, 1.0d, Ingredient.of(ModItems.SHIT.get()), false));
    }
}
