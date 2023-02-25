package com.maxvortrix.mvxcore.party;

import com.maxvortrix.mvxcore.states.PartyState;
import com.maxvortrix.mvxcore.utilities.PlayerMsgSender;
import org.bukkit.entity.Player;

public class PartyPlayer {

    Party party;

    public void playerJoinParty(Player player){

        PlayerMsgSender playerMsgSender = new PlayerMsgSender(player);
        playerMsgSender.sendPrivateMsg("You have joined " + "[]'s" + " Party." );

        party.addMemberAmount();


    }

    public void playerLeaveParty(){

    }




}
