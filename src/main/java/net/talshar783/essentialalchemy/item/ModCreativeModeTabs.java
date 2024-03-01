package net.talshar783.essentialalchemy.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.talshar783.essentialalchemy.EssentialAlchemy;
import net.talshar783.essentialalchemy.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EssentialAlchemy.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ESSENTIALALCHEMY_TAB = CREATIVE_MODE_TABS.register("essentialalchemy_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ESSENCEJAR.get()))
                    .title(Component.translatable("creativetab.essentialalchemy_tab"))
                    .displayItems(((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.ESSENCEJAR.get());
                        pOutput.accept(ModBlocks.ESSENCE_JAR.get());
                    })).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
