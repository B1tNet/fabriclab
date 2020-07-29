package dev.bitnet.fabriclab.items;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static dev.bitnet.fabriclab.FabricLab.MODID;

public class ModItems {
    public static final Item BASIC_ITEM = new BasicItem();
    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(MODID, "basic_item"), BASIC_ITEM);
    }
}
