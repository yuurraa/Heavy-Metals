package net.yuurraa.metalmod.item;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yuurraa.metalmod.MetalMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MetalMod.MOD_ID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


    // ITEMS START FROM HERE
    // Brass Start
    public static final RegistryObject<Item> BRASS_INGOT = ITEMS.register("brass_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.METAL_TAB)));
    // Brass End

    // Zinc Start
    public static final RegistryObject<Item> RAW_ZINC = ITEMS.register("raw_zinc",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.METAL_TAB)));

    public static final RegistryObject<Item> ZINC_INGOT = ITEMS.register("zinc_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.METAL_TAB)));

    public static final RegistryObject<Item> ZINC_NUGGET = ITEMS.register("zinc_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.METAL_TAB)));

    // Tools
    public static final RegistryObject<Item> ZINC_SWORD = ITEMS.register("zinc_sword",
            () -> new SwordItem(ModItemTier.ZINC, 3, -2.2F, new Item.Properties().tab(ModCreativeModeTab.METAL_TAB)));

    public static final RegistryObject<Item> ZINC_PICKAXE = ITEMS.register("zinc_pickaxe",
            () -> new PickaxeItem(ModItemTier.ZINC, 1, -2.6F, new Item.Properties().tab(ModCreativeModeTab.METAL_TAB)));

    public static final RegistryObject<Item> ZINC_AXE = ITEMS.register("zinc_axe",
            () -> new AxeItem(ModItemTier.ZINC, 5, -2.8F, new Item.Properties().tab(ModCreativeModeTab.METAL_TAB)));

    public static final RegistryObject<Item> ZINC_SHOVEL = ITEMS.register("zinc_shovel",
            () -> new ShovelItem(ModItemTier.ZINC, 1.5F, -2.8F, new Item.Properties().tab(ModCreativeModeTab.METAL_TAB)));

    public static final RegistryObject<Item> ZINC_HOE = ITEMS.register("zinc_hoe",
            () -> new HoeItem(ModItemTier.ZINC, -2, -0.8F, new Item.Properties().tab(ModCreativeModeTab.METAL_TAB)));
    // Zinc End
    // ITEMS END FROM HERE
}
