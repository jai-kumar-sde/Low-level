package DesignPatterns.Mediator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> bidders = new ArrayList<>(
                Arrays.asList("BLR", "CSK","RR","KKR","SRH")
        );
        IMediator mediator = new IplMediator(bidders);
        IAucation iplAuction = new IplAuction(mediator);

        iplAuction.addBid("CSK", 100);
        iplAuction.addBid("SRH", 200);

    }
}
