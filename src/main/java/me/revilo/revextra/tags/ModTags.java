package me.revilo.revextra.tags;

import me.revilo.revextra.RevilosExtras;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static final TagKey<Block> STICK = TagKey.of(RegistryKeys.BLOCK, new Identifier(RevilosExtras.MODID, "stick"));
}
