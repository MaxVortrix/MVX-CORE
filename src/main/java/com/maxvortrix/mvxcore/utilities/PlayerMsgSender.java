package com.maxvortrix.mvxcore.utilities;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class PlayerMsgSender {


    private Player player;

    private ConsoleMsgSender consoleMsgSender;

    private String getPluginAnnouncer;

    public PlayerMsgSender(Player player){

        this.player = player;
        this.getPluginAnnouncer = consoleMsgSender.getPluginAnnouncer();

    }

    public void sendPrivateMsg(String message){

        player.sendMessage(ChatColor.LIGHT_PURPLE + getPluginAnnouncer + ": " + ChatColor.GREEN + message);


    }


}
