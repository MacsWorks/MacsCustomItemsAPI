package eu.macsworks.premium.macscustomitemsapi;

import org.bukkit.entity.ArmorStand;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import java.util.Optional;

public final class MacsCustomItems extends JavaPlugin {

    public static MacsCustomItems getInstance() {
        return null;
    }

    public static Optional<MacsCustomItem> getMacsCustomItem(String id){
        return null;
    }

    public static Optional<MacsCustomItem> getMacsCustomItem(ItemStack item){
        return null;
    }

    public static boolean isCustomItem(ItemStack item){
        return false;
    }

    public static boolean isFurniture(ArmorStand stand){
        return false;
    }

    public static Optional<MacsCustomItem> getMacsCustomItemFromFurniture(ArmorStand stand){
        return null;
    }
}
