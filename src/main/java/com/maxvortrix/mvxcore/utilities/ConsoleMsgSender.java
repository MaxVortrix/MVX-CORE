package com.maxvortrix.mvxcore.utilities;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

public class ConsoleMsgSender {

    private String pluginAnnouncer;

    public ConsoleMsgSender(String pluginAnnouncer){

        this.pluginAnnouncer = pluginAnnouncer;

    }


    public void ConsoleCoreGreenMsg(String console_Message){

        Bukkit.getConsoleSender().sendMessage(ChatColor.LIGHT_PURPLE + this.pluginAnnouncer + ": " + ChatColor.GREEN + console_Message);

    }

    public void ConsoleCoreRedMsg(String console_Message){
        Bukkit.getConsoleSender().sendMessage(ChatColor.LIGHT_PURPLE + this.pluginAnnouncer + ": " + ChatColor.RED + console_Message);
    }

    public void setPluginAnnouncer(String pluginAnnouncer){
        this.pluginAnnouncer = pluginAnnouncer;
    }

    public String getPluginAnnouncer(){
        return this.pluginAnnouncer;
    }



}
