package xzgyo.shit.item;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;
import xzgyo.shit.ShitMod;
import xzgyo.shit.entity.Cabbage;
import xzgyo.shit.entity.ModEntities;
import xzgyo.shit.entity.ShitBall;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ShitMod.MOD_ID);

    public static final RegistryObject<Item> SHITBALL = ITEMS.register("shitball", () ->
            new Item(new Item.Properties().stacksTo(32)) {
                @Override
                public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
                    ItemStack stack = player.getItemInHand(hand);
                    level.playSound(null, player.getX(), player.getY(), player.getZ(),
                            SoundEvents.SNOWBALL_THROW, SoundSource.PLAYERS, 0.5F,
                            0.4F / (level.getRandom().nextFloat() * 0.4F + 0.8F));

                    if (!level.isClientSide) {
                        ShitBall snowball = new ShitBall(level, player);
                        snowball.setItem(stack);
                        snowball.shootFromRotation(player, player.getXRot(), player.getYRot(), 0.0F, 1.5F, 1.0F);
                        level.addFreshEntity(snowball);
                    }

                    if (!player.getAbilities().instabuild) {
                        stack.shrink(1);
                    }

                    return InteractionResultHolder.sidedSuccess(stack, level.isClientSide());
                }
            }); //定义物品：粑粑

    public static final RegistryObject<Item> CABBAGE = ITEMS.register("cabbage", () ->
            new Item(new Item.Properties().stacksTo(16)) {
                @Override
                public @NotNull InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
                    ItemStack stack = player.getItemInHand(hand);
                    level.playSound(null, player.getX(), player.getY(), player.getZ(),
                            SoundEvents.SNOWBALL_THROW, SoundSource.PLAYERS, 0.5F,
                            0.4F / (level.getRandom().nextFloat() * 0.4F + 0.8F));

                    if (!level.isClientSide) {
                        Cabbage snowball = new Cabbage(level, player);
                        snowball.setItem(stack);
                        snowball.shootFromRotation(player, player.getXRot(), player.getYRot(), 0.0F, 1.5F, 1.0F);
                        level.addFreshEntity(snowball);
                    }

                    if (!player.getAbilities().instabuild) {
                        stack.shrink(1);
                    }

                    return InteractionResultHolder.sidedSuccess(stack, level.isClientSide());
                }
            }); //定义物品：白菜

    public static final RegistryObject<Item> SHIT_INGOT = ITEMS.register("shit_ingot", () -> new Item(new Item.Properties())); //定义物品：粑粑锭

    public static final RegistryObject<Item> EGG_TART = ITEMS.register("egg_tart", () -> new Item(new Item.Properties().food(ModFoods.EGG_TART))); //定义食物：蛋挞
    public static final RegistryObject<Item> PIZZA = ITEMS.register("pizza", () -> new Item(new Item.Properties().food(ModFoods.PIZZA))); //定义食物：比萨
    public static final RegistryObject<Item> PLATE = ITEMS.register("plate", () -> new Item(new Item.Properties().food(ModFoods.PLATE))); //定义食物：盘菜
    public static final RegistryObject<Item> EGG_FRIED_RICE = ITEMS.register("egg_fried_rice", () -> new Item(new Item.Properties().food(ModFoods.EGG_FRIED_RICE))); //定义食物：蛋炒饭

    public static final RegistryObject<ForgeSpawnEggItem> SI_CHUAN_FEN_DA_EGG = ITEMS.register(
            "si_chuan_fen_da_egg",
            () -> new ForgeSpawnEggItem(
                    ModEntities.SI_CHUAN_FEN_DA,
                    0xFFFFFF, 0x000000,
                    new Item.Properties()
            )
    ); //定义刷怪蛋：四川芬达刷怪蛋

}
