package dev.bitnet.fabriclab.client;

import net.fabricmc.fabric.api.object.builder.v1.client.model.FabricModelPredicateProviderRegistry;
import net.minecraft.util.Identifier;

import static dev.bitnet.fabriclab.FabricLab.MODID;

public class ModModelPredicateProviderRegistry {
    public static void registerModelPredicates() {
        FabricModelPredicateProviderRegistry.register(new Identifier(MODID, "count"), (stack, world, entity) -> stack.getCount());
    }
}
