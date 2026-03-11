package me.skeleton5227.vanillaSurvivalExtended.crafts;

import me.skeleton5227.vanillaSurvivalExtended.data.NamespacedKeys;
import me.skeleton5227.vanillaSurvivalExtended.data.items.simple.Fiber;
import me.skeleton5227.vanillaSurvivalExtended.data.items.simple.Rock;
import me.skeleton5227.vanillaSurvivalExtended.data.items.simple.Stick;
import me.skeleton5227.vanillaSurvivalExtended.data.items.tools.PrimitiveAxe;
import org.bukkit.Bukkit;
import org.bukkit.inventory.ShapedRecipe;

public class PrimitiveAxeCraft {

    public static void register() {
        Bukkit.removeRecipe(NamespacedKeys.PRIMITIVE_AXE.getKey());

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKeys.PRIMITIVE_AXE.getKey(), PrimitiveAxe.getInstance().getItem());

        recipe.shape("RF",
                    " S");

        recipe.setIngredient('R', Rock.getInstance().getItem());
        recipe.setIngredient('S', Stick.getInstance().getItem());
        recipe.setIngredient('F', Fiber.getInstance().getItem());

        Bukkit.addRecipe(recipe);
    }
}
