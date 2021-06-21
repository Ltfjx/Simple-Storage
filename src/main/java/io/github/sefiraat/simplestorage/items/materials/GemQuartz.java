package io.github.sefiraat.simplestorage.items.materials;

import io.github.sefiraat.simplestorage.SimpleStorage;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.NamespacedKey;
import org.bukkit.World;
import org.bukkit.block.Biome;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

public final class GemQuartz extends AbstractGem {

    private final NamespacedKey key;

    public GemQuartz(SimpleStorage plugin, Category category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super("透徹石英水晶", category, item, recipeType, recipe, 1);
        this.key = new NamespacedKey(SimpleStorage.inst(), "quartz_crystal");
        register();
        register(plugin);
    }

    @Override
    public int getDefaultSupply(@Nonnull World.Environment environment, @Nonnull Biome biome) {
        if (environment == World.Environment.NORMAL) {
            switch (biome) {
                case FLOWER_FOREST:
                    return 2;
                case MUSHROOM_FIELDS:
                case MUSHROOM_FIELD_SHORE:
                    return 4;
                default:
                    return 0;
            }
        }
        return 0;
    }

    @Nonnull
    @Override
    public NamespacedKey getKey() {
        return key;
    }

}
