package com.github.turtlecubed.mod1;

import com.github.turtlecubed.mod1.init.ModItemGroups;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistryEntry;

@EventBusSubscriber(modid = Mod1.MODID, bus = EventBusSubscriber.Bus.MOD)
public final class ModEventSubscriber {
    @SubscribeEvent
    public static void onRegisterItems(RegistryEvent.Register<Item> event) {
        Item newIngot = setup(new Item(
                new Item.Properties().group(ModItemGroups.ITEM_GROUP)), "orange_ingot");
        event.getRegistry().registerAll(newIngot);
        //event.getRegistry().registerAll(
        //        setup(new Item(new Item.Properties()), "orange_ingot")
        //);

    }

    public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final String name) {
        return setup(entry, new ResourceLocation(Mod1.MODID, name));
    }

    public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final ResourceLocation registryName) {
        entry.setRegistryName(registryName);
        return entry;
    }

}
