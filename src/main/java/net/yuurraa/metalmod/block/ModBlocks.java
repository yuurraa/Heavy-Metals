package net.yuurraa.metalmod.block;

import net.minecraft.client.resources.sounds.Sound;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yuurraa.metalmod.MetalMod;
import net.yuurraa.metalmod.item.ModCreativeModeTab;
import net.yuurraa.metalmod.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MetalMod.MOD_ID);

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

    private static <T extends Block> RegistryObject<T> registryBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }


    // BLOCKS START FROM HERE
    public static final RegistryObject<Block> BRASS_BLOCK = registryBlock("brass_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f, 6f).requiresCorrectToolForDrops().sound(SoundType.METAL)), ModCreativeModeTab.METAL_TAB);

    public static final RegistryObject<Block> ZINC_ORE = registryBlock("zinc_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops().sound(SoundType.STONE),
                    UniformInt.of(3, 7)), ModCreativeModeTab.METAL_TAB);

    public static final RegistryObject<Block> DEEPSLATE_ZINC_ORE = registryBlock("deepslate_zinc_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(4.5f, 3f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE),
                    UniformInt.of(3, 7)), ModCreativeModeTab.METAL_TAB);

    public static final RegistryObject<Block> ZINC_BLOCK = registryBlock("zinc_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f, 6f).requiresCorrectToolForDrops().sound(SoundType.METAL)), ModCreativeModeTab.METAL_TAB);
    // BLOCKS END FROM HERE
}
