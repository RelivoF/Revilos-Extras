package me.revilo.revextra.items.custom.material;

import com.mojang.datafixers.types.templates.Tag;
import me.revilo.revextra.tags.ModTags;
import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.TagKey;

public class SleepyMaterial implements ToolMaterial {

    public static final SleepyMaterial INSTANCE = new SleepyMaterial();

    @Override
    public int getDurability() {
        return 6900;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 0;
    }

    @Override
    public float getAttackDamage() {
        return 999999999;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return ModTags.STICK;
    }

    @Override
    public int getEnchantability() {
        return 15;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.STICK);
    }

}
