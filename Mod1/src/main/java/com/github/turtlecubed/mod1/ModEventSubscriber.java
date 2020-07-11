package com.github.turtlecubed.mod1;

import com.github.turtlecubed.mod1.init.ModItemGroups;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
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
        Item orangeIngot = setup(new Item(
                new Item.Properties().group(ModItemGroups.ITEM_GROUP)), "orange_ingot");
        event.getRegistry().registerAll(orangeIngot);
        //event.getRegistry().registerAll(
        //        setup(new Item(new Item.Properties()), "orange_ingot")
        //);
    }

    @SubscribeEvent
    public static void onRegisterBlocks(RegistryEvent.Register<Block> event) {
        Block orangeBlock = setup(new Block(
                Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F)),
                "orange_block");
        event.getRegistry().registerAll(orangeBlock);
    }


    public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final String name) {
        return setup(entry, new ResourceLocation(Mod1.MODID, name));
    }

    public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final ResourceLocation registryName) {
        entry.setRegistryName(registryName);
        return entry;
    }

}
