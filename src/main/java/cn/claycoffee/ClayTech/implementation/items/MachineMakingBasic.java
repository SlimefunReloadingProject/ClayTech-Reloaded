package cn.claycoffee.ClayTech.implementation.items;

import cn.claycoffee.ClayTech.ClayTech;
import cn.claycoffee.ClayTech.ClayTechItems;
import cn.claycoffee.ClayTech.ClayTechMachineRecipes;
import cn.claycoffee.ClayTech.ClayTechRecipeType;
import cn.claycoffee.ClayTech.utils.Lang;
import cn.claycoffee.ClayTech.utils.SlimefunUtils;
import org.bukkit.NamespacedKey;

public class MachineMakingBasic {
    public MachineMakingBasic() {

        SlimefunUtils.registerItem(ClayTechItems.C_MATERIALS, "BLISTERING_CORE", ClayTechItems.BLISTERING_CORE,
                ClayTechRecipeType.CLAY_CRAFTING_TABLE, ClayTechMachineRecipes.BLISTERING_CORE
        );

        Research before_element = new Research(new NamespacedKey(ClayTech.getInstance(), "CLAYTECH_BEFORE_ELEMENT"),
                9917, Lang.readResearchesText("CLAYTECH_BEFORE_ELEMENTS"), 50);

        before_element.addItems(new SlimefunItem[]{SlimefunItem.getByItem(ClayTechItems.BLISTERING_CORE)});
        before_element.register();

        SlimefunUtils.registerItem(ClayTechItems.C_MATERIALS, "INK_MODULE", ClayTechItems.INK_MODULE,
                ClayTechRecipeType.CLAY_CRAFTING_TABLE, ClayTechMachineRecipes.INK_MODULE
        );
        SlimefunUtils.registerItem(ClayTechItems.C_MATERIALS, "COPYING_MODULE", ClayTechItems.COPYING_MODULE,
                ClayTechRecipeType.CLAY_CRAFTING_TABLE, ClayTechMachineRecipes.COPYING_MODULE
        );
        Research copier = new Research(new NamespacedKey(ClayTech.getInstance(), "CLAYTECH_COPIER"),
                9934, Lang.readResearchesText("CLAYTECH_COPIER"), 50);

        copier.addItems(new SlimefunItem[]{SlimefunItem.getByItem(ClayTechItems.COPYING_MODULE), SlimefunItem.getByItem(ClayTechItems.INK_MODULE), SlimefunItem.getByItem(ClayTechItems.CLAY_ELECTRIC_COPIER)});
        copier.register();


    }

}
