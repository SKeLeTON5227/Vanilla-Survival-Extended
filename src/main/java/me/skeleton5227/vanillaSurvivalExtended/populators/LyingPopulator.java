package me.skeleton5227.vanillaSurvivalExtended.populators;

import me.skeleton5227.vanillaSurvivalExtended.data.NamespacedKeys;
import me.skeleton5227.vanillaSurvivalExtended.utils.ItemBuilder;
import org.bukkit.*;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.ItemFrame;
import org.bukkit.generator.BlockPopulator;
import org.bukkit.persistence.PersistentDataType;
import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class LyingPopulator extends BlockPopulator {

    @Override
    public void populate(@NotNull World world, @NotNull Random random, @NotNull Chunk chunk) {
        int count = 1;

        for (int i = 0; i < count; i++) {
            int x = random.nextInt(16);
            int z = random.nextInt(16);

            int worldX = chunk.getX() * 16 + x;
            int worldZ = chunk.getZ() * 16 + z;
            int y = world.getHighestBlockYAt(worldX, worldZ);

            Location spawnLoc = new Location(world, worldX, y, worldZ);
            Material blockType = spawnLoc.getBlock().getType();

            if (blockType == Material.GRASS_BLOCK) {
                ItemFrame frame = (ItemFrame) world.spawnEntity(spawnLoc.add(0.5,1,0.5), EntityType.ITEM_FRAME);
                frame.setRotation(Rotation.values()[random.nextInt(Rotation.values().length)]);
                frame.setVisible(false);
                frame.setFacingDirection(BlockFace.UP);
                if (random.nextInt(2) == 0) {
                    frame.setItem(ItemBuilder.of(Material.STICK).build());
                    frame.getPersistentDataContainer().set(NamespacedKeys.CONTAINS_STICK.getKey(), PersistentDataType.BOOLEAN, true);
                } else {
                    frame.setItem(ItemBuilder.of(Material.FLINT).build());
                    frame.getPersistentDataContainer().set(NamespacedKeys.CONTAINS_ROCK.getKey(), PersistentDataType.BOOLEAN, true);
                }
            }
        }
    }
}