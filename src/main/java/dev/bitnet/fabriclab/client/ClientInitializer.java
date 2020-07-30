package dev.bitnet.fabriclab.client;

import dev.bitnet.fabriclab.client.entity.renderer.BasicCubeRenderer;
import dev.bitnet.fabriclab.entity.ModEntities;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;

@Environment(EnvType.CLIENT)
public class ClientInitializer implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.INSTANCE.register(ModEntities.BASIC_CUBE, (entityRenderDispatcher, context) -> new BasicCubeRenderer(entityRenderDispatcher));
    }
}
