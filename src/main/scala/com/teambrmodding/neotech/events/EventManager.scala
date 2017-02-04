package com.teambrmodding.neotech.events
import com.teambrmodding.neotech.utils.TimeUtils
import net.minecraftforge.common.MinecraftForge

object EventManager {

    def init(): Unit = {
        MinecraftForge.EVENT_BUS.register(OnCraftedEvent)
        MinecraftForge.EVENT_BUS.register(TimeUtils)
        MinecraftForge.EVENT_BUS.register(OnPlayerLoginEvent)
        MinecraftForge.EVENT_BUS.register(ConfigChanged)
    }
}
