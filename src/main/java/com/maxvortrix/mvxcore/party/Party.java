package com.maxvortrix.mvxcore.party;

import com.maxvortrix.mvxcore.MvxCore;
import com.maxvortrix.mvxcore.states.PartyState;


import java.util.List;
import java.util.UUID;

public class Party {
    private int memberAmount;
    private final int maxPartiedAmount = 4;
    MvxCore mvxCore;
    List<UUID> players;
    PartyState partyState;


    public Party(MvxCore mvxCore){
        //assign party leader
        memberAmount = 1;
        partyState = PartyState.TAKEN;
    }



    public void addMemberAmount(){
        if (memberAmount < maxPartiedAmount){
            memberAmount++;
        }else{

        }
    }

}
