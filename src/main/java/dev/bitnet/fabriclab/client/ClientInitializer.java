package dev.bitnet.fabriclab.client;

import dev.bitnet.fabriclab.entity.ModEntities;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class ClientInitializer implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModEntities.registerEntityRenderers();
    }
}
