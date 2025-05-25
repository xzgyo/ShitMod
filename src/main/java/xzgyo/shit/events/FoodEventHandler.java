package xzgyo.shit.events;

import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import xzgyo.shit.ShitMod;
import xzgyo.shit.item.ModItems;

@Mod.EventBusSubscriber(modid = ShitMod.MOD_ID)
public class FoodEventHandler {

    @SubscribeEvent
    public static void onFoodEaten(LivingEntityUseItemEvent.Finish event) {
        if (event.getEntity() instanceof Player player) {
            ItemStack itemStack = event.getItem();
            Item item = itemStack.getItem();

            // 下面是魔法！魔法！
            if (item == ModItems.EGG_TART.get()) {
                player.displayClientMessage(Component.literal("他们朝我扔粑粑，我拿粑粑作蛋挞"),true);
            } else if (item == ModItems.PIZZA.get()) {
                player.displayClientMessage(Component.literal("他们朝我扔粑粑，我拿粑粑作比萨"),true);
            } else if (item == ModItems.PLATE.get()) {
                player.displayClientMessage(Component.literal("他们朝我扔白菜，我拿白菜炒盘菜"), true);
            } else if (item == ModItems.EGG_FRIED_RICE.get()) {
                player.displayClientMessage(Component.literal("他们朝我扔鸡蛋，我拿鸡蛋作蛋炒饭"),true);
            }
        }
    }
}
