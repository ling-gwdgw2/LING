package me.cortex.voxy.client.mixin.iris;

import com.google.common.collect.ImmutableSet;
import me.cortex.voxy.client.iris.VoxySamplers;
import net.coderbot.iris.gl.sampler.SamplerHolder;
import net.coderbot.iris.pipeline.IrisRenderingPipeline;
import net.coderbot.iris.pipeline.WorldRenderingPipeline;
import net.coderbot.iris.samplers.IrisSamplers;
import net.coderbot.iris.targets.RenderTargets;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.function.Supplier;

@Mixin(value = IrisSamplers.class, remap = false)
public class MixinIrisSamplers {
    @Inject(method = "addRenderTargetSamplers", at = @At("TAIL"))
    private static void voxy$injectSamplers(SamplerHolder samplers, Supplier<ImmutableSet<Integer>> flipped, RenderTargets renderTargets, boolean isFullscreenPass, WorldRenderingPipeline pipeline, CallbackInfo ci) {
        if (pipeline instanceof IrisRenderingPipeline ipipe) {
            VoxySamplers.addSamplers(ipipe, samplers);
        }
    }
}
