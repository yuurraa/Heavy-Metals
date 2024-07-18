package net.yuurraa.metalmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab METAL_TAB = new CreativeModeTab("metaltab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.BRASS_INGOT.get());
        }
    };
}
