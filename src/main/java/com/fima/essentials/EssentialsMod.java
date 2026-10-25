package com.fima.essentials;

import com.fima.essentials.block.ModBlocks;
import com.fima.essentials.creative.ModCreativeTabs;
import com.fima.essentials.item.ModItems;
import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(EssentialsMod.MOD_ID)
public class EssentialsMod {
    public static final String MOD_ID = "essentials";
    private static final Logger LOGGER = LogUtils.getLogger();

    public EssentialsMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModCreativeTabs.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);

        LOGGER.info("Essentials Mod loaded!");
    }
}
