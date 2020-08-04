package dev.bitnet.fabriclab.items;

import dev.bitnet.fabriclab.FabricLab;
import net.minecraft.item.Item;

public class TextureChangingItem extends Item {

    public TextureChangingItem() {
        super(new Item.Settings()
                .group(FabricLab.ITEM_GROUP)
                .maxCount(8)
        );
    }

}
