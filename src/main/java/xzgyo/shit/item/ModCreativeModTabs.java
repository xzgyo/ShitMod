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
            .icon(() -> ModItems.SHIT.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                // item
                output.accept(ModItems.SHIT.get()); //粑粑
                output.accept(ModItems.SHIT_INGOT.get()); //粑粑锭
                // block
                output.accept((ModBlocks.SHIT_BLOCK.get()));
            }).build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
