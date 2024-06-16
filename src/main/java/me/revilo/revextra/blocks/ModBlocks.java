package me.revilo.revextra.blocks;

import me.revilo.revextra.RevilosExtras;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block TEST_BLOCK = registerBlock("testblock",
            new Block(AbstractBlock.Settings.copy(Blocks.NETHERITE_BLOCK)));

    public static final Block TESST = registerBlock("test",
            new Block(AbstractBlock.Settings.copy(Blocks.NETHERITE_BLOCK)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(RevilosExtras.MODID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(RevilosExtras.MODID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        RevilosExtras.logger.info("Registering ModBlocks for " + RevilosExtras.MODID);
    }
}
