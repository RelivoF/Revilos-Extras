package me.revilo.revextra.items;

import me.revilo.revextra.RevilosExtras;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item TEST_ITEM = registerItem("tester", new Item(new Item.Settings()));
    public static final Item TEST = registerItem("test", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(RevilosExtras.MODID, name), item);
    }



    public static void registerModItems() {
        RevilosExtras.logger.info("Registering items for" + RevilosExtras.MODID);
    }

}
