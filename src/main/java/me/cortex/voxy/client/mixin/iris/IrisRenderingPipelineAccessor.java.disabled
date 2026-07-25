package me.cortex.voxy.client.mixin.iris;

import net.coderbot.iris.pipeline.IrisRenderingPipeline;
import net.coderbot.iris.targets.RenderTargets;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value = IrisRenderingPipeline.class, remap = false)
public interface IrisRenderingPipelineAccessor {
    @Accessor
    RenderTargets getRenderTargets();
}
