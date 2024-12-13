package DesignPatterns.Mediator;

import java.util.List;

public class IplMediator implements IMediator{
    List<String> bidders;

    public IplMediator(List<String> bidders) {
        this.bidders = bidders;
    }

    public void notifyBidder(String bidder,int amout){
        for(String str:bidders){
            if(!str.equals(bidder)){
                System.out.printf("Team %s is notified with bid amount : %s\n",str,amout );
            }
        }
    }
}
