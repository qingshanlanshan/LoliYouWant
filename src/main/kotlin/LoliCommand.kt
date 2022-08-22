package top.mrxiaom.loliyouwant

import net.mamoe.mirai.console.command.CommandSender
import net.mamoe.mirai.console.command.SimpleCommand
import net.mamoe.mirai.console.permission.Permission

class LoliCommand(perm: Permission) : SimpleCommand(
    owner = LoliYouWant,
    primaryName = "LoliYouWant",
    secondaryNames = arrayOf("loli", "luw"),
    parentPermission = perm
) {
    @Handler
    suspend fun CommandSender.handle(operation: String) {
        if (operation.equals("reload", true)) {
            LoliYouWant.reloadConfig()
            sendMessage(LoliConfig.msgReload)
        }
    }
}