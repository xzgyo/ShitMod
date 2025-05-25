package xzgyo.shit.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import xzgyo.shit.ShitMod;
import xzgyo.shit.block.ModBlocks;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ShitMod.MOD_ID);
    public static final RegistryObject<CreativeModeTab> SHIT_TAB = CREATIVE_MODE_TABS.register("shit_tab", () -> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> ModItems.SHIT_INGOT.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                // item
                output.accept(ModItems.SHITBALL.get()); //粑粑球
                output.accept(ModItems.CABBAGE.get()); //白菜
                output.accept(ModItems.SHIT_INGOT.get()); //粑粑锭
                output.accept(ModItems.SI_CHUAN_FEN_DA_EGG.get()); //四川芬达刷怪蛋
                // food
                output.accept(ModItems.EGG_TART.get()); //蛋挞
                output.accept(ModItems.PIZZA.get()); //批萨
                output.accept(ModItems.PLATE.get()); //盘菜
                output.accept(ModItems.EGG_FRIED_RICE.get()); //蛋炒饭
                // block
                output.accept((ModBlocks.SHIT_BLOCK.get()));
            }).build());
}
