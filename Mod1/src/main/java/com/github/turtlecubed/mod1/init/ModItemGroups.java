package com.github.turtlecubed.mod1.init;

import com.github.turtlecubed.mod1.Mod1;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

import java.util.function.Supplier;

public class ModItemGroups {

    public static final ItemGroup ITEM_GROUP
            = new ModItemGroup(Mod1.MODID, () -> new ItemStack(ModItems.ORANGE_INGOT));

    public static class ModItemGroup extends ItemGroup {
        private final Supplier<ItemStack> iconSupplier;

        public ModItemGroup(String name, Supplier<ItemStack> iconSupplier) {
            super(name);
            this.iconSupplier = iconSupplier;
        }

        @Override
        public ItemStack createIcon() {
            return iconSupplier.get();
        }
    }
}
