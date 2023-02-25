package com.maxvortrix.mvxcore;

import com.maxvortrix.mvxcore.utilities.ConsoleMsgSender;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class MvxCore extends JavaPlugin {

    ConsoleMsgSender consoleMsgSender = new ConsoleMsgSender("MVX CORE");

    @Override
    public void onEnable() {

        consoleMsgSender.ConsoleCoreGreenMsg("MVX CORE plugin is Enabled!");

    }

    @Override
    public void onDisable() {

        consoleMsgSender.ConsoleCoreRedMsg("MVX CORE plugin is Disabled & Closed!");

    }
}
