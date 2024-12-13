package DesignPatterns.Mediator;

public class IplAuction implements IAucation{
    private IMediator mediator;

    public IplAuction(IMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void addBid(String bidder, int bidAmount) {
        System.out.printf("Team %s placed a bid of amount: %s\n", bidder,bidAmount);
        this.mediator.notifyBidder(bidder, bidAmount);
    }
}
