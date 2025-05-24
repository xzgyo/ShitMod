package xzgyo.shit.entity;

import net.minecraft.core.particles.ItemParticleOption;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.Blaze;
import net.minecraft.world.entity.projectile.Snowball;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraftforge.fml.common.Mod;
import xzgyo.shit.ShitMod;
import xzgyo.shit.item.ModItems;

public class ShitBall extends ThrowableItemProjectile {
    public ShitBall(EntityType<? extends ShitBall> entityType, Level level) {
      super(entityType, level);
   }

   public ShitBall(Level level, LivingEntity thrower) {
      super(ModEntities.SHITBALL.get(), thrower, level);
   }

   public ShitBall(Level level, double x, double y, double z) {
      super(ModEntities.SHITBALL.get(), x, y, z, level);
   }

    protected Item getDefaultItem() {
      return ModItems.SHITBALL.get();
   }

   private ParticleOptions getParticle() {
      ItemStack itemstack = this.getItemRaw();
      return (ParticleOptions)(itemstack.isEmpty() ? ParticleTypes.ITEM_SNOWBALL : new ItemParticleOption(ParticleTypes.ITEM, itemstack));
   }

   @Override
   public void handleEntityEvent(byte p_37402_) {
      if (p_37402_ == 3) {
         ParticleOptions particleoptions = this.getParticle();

         for(int i = 0; i < 8; ++i) {
            this.level().addParticle(particleoptions, this.getX(), this.getY(), this.getZ(), 0.0d, 0.0d, 0.0d);
         }
      }

   }

   @Override
   protected void onHitEntity(EntityHitResult result) {
      super.onHitEntity(result);
      Entity entity = result.getEntity();
      int i = entity instanceof Blaze ? 3 : 0;
      entity.hurt(this.damageSources().thrown(this, this.getOwner()), (float)i);
   }

   @Override
   protected void onHit(HitResult result) {
      super.onHit(result);
      if (!this.level().isClientSide) {
         this.level().broadcastEntityEvent(this, (byte)3);
         this.discard();
      }
   }
}
