package carpettisaddition.mixins.logger;

import carpettisaddition.logging.logHelpers.ItemLogHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Slice;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;


@Mixin(ItemEntity.class)
public abstract class ItemEntity_itemLoggerMixin extends Entity
{
	private boolean flagDied = false;
	private boolean flagDespawned = false;

	public ItemEntity_itemLoggerMixin(EntityType<?> entityType_1, World world_1)
	{
		super(entityType_1, world_1);
	}

	@Inject(
			method = "tick",
			slice = @Slice(
					from = @At(
							value = "CONSTANT",
							args = "intValue=6000"
					)
			),
			at = @At(
					value = "INVOKE",
					target = "Lnet/minecraft/entity/ItemEntity;remove()V"
			)
	)
	void onDespawned(CallbackInfo ci)
	{
		if (!this.world.isClient && !this.flagDespawned)
		{
			ItemLogHelper.onItemDespawn((ItemEntity)(Object)this);
			this.flagDespawned = true;
		}
	}

	@Inject(
			method = "damage",
			at = @At(
					value = "INVOKE",
					target = "Lnet/minecraft/entity/ItemEntity;remove()V"
			)
	)
	void onDied(DamageSource source, float amount, CallbackInfoReturnable<Boolean> cir)
	{
		if (!this.world.isClient && !this.flagDied)
		{
			ItemLogHelper.onItemDie((ItemEntity)(Object)this, source, amount);
			this.flagDied = true;
		}
	}
}
