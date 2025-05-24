package xzgyo.shit.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import xzgyo.shit.ShitMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ShitMod.MOD_ID);

    public static final RegistryObject<Item> SHIT_INGOT = ITEMS.register("shit_ingot", () -> new Item(new Item.Properties())); //定义物品：粑粑锭

    public static final RegistryObject<Item> SHIT = ITEMS.register("shit", () -> new Item(new Item.Properties().food(ModFoods.SHIT))); //定义食物：粑粑
    public static final RegistryObject<Item> EGG_TART = ITEMS.register("egg_tart", () -> new Item(new Item.Properties().food(ModFoods.EGG_TART))); //定义食物：蛋挞
}
