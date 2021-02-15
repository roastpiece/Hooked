package dev.thecodewarrior.hooked.hook

import dev.thecodewarrior.hooked.capability.HookedPlayerData
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.util.SoundEvent
import net.minecraft.util.math.vector.Vector3d
import net.minecraft.world.World

/**
 * Provides the hook controller with access to information or functionality from the hook data or processor
 */
interface HookProcessorContext: HookControllerDelegate {
    val data: HookedPlayerData
    val type: HookType
    val controller: HookPlayerController
    override val player: PlayerEntity
    override val world: World
    override val hooks: MutableList<Hook>

    override fun markDirty(hook: Hook)
    override fun playFeedbackSound(sound: SoundEvent, volume: Float, pitch: Float)
    override fun playWorldSound(sound: SoundEvent, pos: Vector3d, volume: Float, pitch: Float)
}