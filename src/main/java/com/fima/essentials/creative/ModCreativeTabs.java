package com.fima.essentials.creative;

import com.fima.essentials.EssentialsMod;
import com.fima.essentials.block.ModBlocks;
import com.fima.essentials.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EssentialsMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ESSENTIALS_TAB = CREATIVE_MODE_TABS.register("essentials_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.COPPER_COIN.get()))
                    .title(Component.translatable("creativetab.essentials.essentials_tab"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.COPPER_COIN.get());
                        output.accept(ModBlocks.COMPACT_COPPER_BLOCK.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
