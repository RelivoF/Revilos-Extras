package me.revilo.revextra.items;

import me.revilo.revextra.RevilosExtras;
import me.revilo.revextra.items.custom.material.SleepyMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item TEST_ITEM = registerItem("tester", new Item(new Item.Settings()));
    public static final Item TEST = registerItem("test", new Item(new Item.Settings()));
    public static ToolItem SLEEPY_STICK = new SwordItem(SleepyMaterial.INSTANCE, new Item.Settings().maxDamage(999999999).maxCount(1));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(RevilosExtras.MODID, name), item);
    }

    private static void registerModItem(String name, Item item) {
        Registry.register(Registries.ITEM, new Identifier(RevilosExtras.MODID, name), item);
    }



    public static void registerModItems() {
        registerModItem("sleepystick", SLEEPY_STICK);
        RevilosExtras.logger.info("Registering items for" + RevilosExtras.MODID);
    }

}
