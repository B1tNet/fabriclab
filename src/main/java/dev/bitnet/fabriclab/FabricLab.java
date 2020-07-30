package dev.bitnet.fabriclab;

import dev.bitnet.fabriclab.entity.ModEntities;
import dev.bitnet.fabriclab.items.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class FabricLab implements ModInitializer {
	public static final String MODID = "fabriclab";

	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.create(new Identifier(MODID, "itemgroup"))
			.icon(() -> new ItemStack(ModItems.BASIC_ITEM))
			.build();

	@Override
	public void onInitialize() {
		ModItems.registerItems();
		ModEntities.registerEntityAttributes();
	}
}
