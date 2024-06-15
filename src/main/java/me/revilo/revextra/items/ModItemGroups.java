package me.revilo.revextra.items;

import me.revilo.revextra.RevilosExtras;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    private static final ItemGroup REV_BETTERS = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.TEST))
            .displayName(Text.translatable("itemGroup.rev-extra.revbetters"))
            .entries((context, entries) -> {
                entries.add(ModItems.TEST_ITEM);
                entries.add(ModItems.TEST);
                entries.add(ModItems.SLEEPY_HOE);
            })
            .build();

    private static final ItemGroup REV_BETTERER = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.TEST))
            .displayName(Text.translatable("itemGroup.rev-extra.revbetterer"))
            .entries((context, entries) -> {
                entries.add(ModItems.TEST_ITEM);
                entries.add(ModItems.TEST);
            })
            .build();


    private static void registerModGroup(String name, ItemGroup itemGroup) {
        Registry.register(Registries.ITEM_GROUP, new Identifier(RevilosExtras.MODID, name), itemGroup);
    }
    public static void registerModGroups() {
        registerModGroup("revbetters", REV_BETTERS);
        registerModGroup("revbetterer", REV_BETTERER);
        RevilosExtras.logger.info("registering Groups for " + RevilosExtras.MODID);
    }
}