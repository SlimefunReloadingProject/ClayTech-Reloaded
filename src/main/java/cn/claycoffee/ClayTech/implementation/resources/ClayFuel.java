package cn.claycoffee.ClayTech.implementation.resources;

import cn.claycoffee.ClayTech.ClayTech;
import cn.claycoffee.ClayTech.ClayTechItems;
import cn.claycoffee.ClayTech.utils.Lang;
import cn.claycoffee.ClayTech.utils.SlimefunUtils;
import io.github.thebusybiscuit.slimefun4.api.geo.GEOResource;
import org.bukkit.NamespacedKey;
import org.bukkit.World.Environment;
import org.bukkit.block.Biome;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class ClayFuel implements GEOResource {
    private final NamespacedKey key = new NamespacedKey(ClayTech.getInstance(), "CLAY_FUEL");

    public ClayFuel() {
        SlimefunUtils.registerResource(this);
    }

    @Override
    public @NotNull NamespacedKey getKey() {
        return key;
    }

    @Override
    public int getDefaultSupply(@NotNull Environment environment, @NotNull Biome biome) {
        if (environment == Environment.NORMAL && biome == Biome.THE_END) {
            return 12;
        } else if (environment == Environment.NORMAL) {
            return 4;
        } else if (environment == Environment.NETHER) {
            return 5;
        } else {
            return 0;
        }
    }

    @Override
    public int getMaxDeviation() {
        return 2;
    }

    @Override
    public @NotNull String getName() {
        return Lang.readResourcesText("CLAY_FUEL");
    }

    @Override
    public @NotNull ItemStack getItem() {
        return ClayTechItems.CLAY_FUEL.clone();
    }

    @Override
    public boolean isObtainableFromGEOMiner() {
        return true;
    }

}
