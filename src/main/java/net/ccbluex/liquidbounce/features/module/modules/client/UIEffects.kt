/*
 * FDPClient Hacked Client
 * A free open source mixin-based injection hacked client for Minecraft using Minecraft Forge by LiquidBounce.
 * https://github.com/SkidderMC/FDPClient/
 */
package net.ccbluex.liquidbounce.features.module.modules.client

import net.ccbluex.liquidbounce.features.module.Module
import net.ccbluex.liquidbounce.features.module.ModuleCategory
import net.ccbluex.liquidbounce.features.value.BoolValue
import net.ccbluex.liquidbounce.features.value.ListValue

object UIEffects : Module(name = "UIEffects", category = ModuleCategory.CLIENT, canEnable = false, defaultOn = false) {

    val buttonShadowValue = BoolValue("ButtonShadow", true)
    val UiShadowValue = ListValue("Mode", arrayOf("Shadow", "Glow", "None"), "Shadow")

}
