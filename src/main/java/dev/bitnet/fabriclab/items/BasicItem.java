package dev.bitnet.fabriclab.items;

import dev.bitnet.fabriclab.FabricLab;
import net.minecraft.item.Item;

public class BasicItem extends Item {
    public BasicItem() {
        super(new Item.Settings()
                .group(FabricLab.ITEM_GROUP)
        );
    }
}
