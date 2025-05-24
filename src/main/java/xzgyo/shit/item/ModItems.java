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
    public static final RegistryObject<Item> PIZZA = ITEMS.register("pizza", () -> new Item(new Item.Properties().food(ModFoods.PIZZA))); //定义食物：比萨
    public static final RegistryObject<Item> CABBAGE = ITEMS.register("cabbage", () -> new Item(new Item.Properties().food(ModFoods.CABBAGE))); //定义食物：白菜
    public static final RegistryObject<Item> PLATE = ITEMS.register("plate", () -> new Item(new Item.Properties().food(ModFoods.PLATE))); //定义食物：盘菜
    public static final RegistryObject<Item> EGG_FRIED_RICE = ITEMS.register("egg_fried_rice", () -> new Item(new Item.Properties().food(ModFoods.EGG_FRIED_RICE))); //定义食物：蛋炒饭

}
