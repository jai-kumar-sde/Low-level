package Problems.ATM;

import static java.lang.Math.min;

public class CashDispenser {
    private int hundereds;
    private int fiveHundereds;
    private int thousands;
    private int totalBalance;

    public CashDispenser(int hundereds, int fiveHundereds, int thousands) {
        this.hundereds = hundereds;
        this.fiveHundereds = fiveHundereds;
        this.thousands = thousands;
        this.totalBalance= hundereds *100 + fiveHundereds* 500 + thousands*1000;
    }

    public int withdrawCash(int amount) throws Exception {
        int temp = amount;
        System.out.println(totalBalance);
        if(this.totalBalance < amount )throw new Exception("Machine not have sufficient balance.");
        int thousandsCounts = min(thousands,(int)(amount/1000));setThousands(thousandsCounts);
        amount = amount - thousandsCounts*1000;
        int fiveHundredsCounts=  min(fiveHundereds,(int)(amount/500));setFiveHundereds(fiveHundredsCounts);
        amount = amount - fiveHundredsCounts*500;
        int hunderedsCounts= min(hundereds,(int)(amount/100));setHundereds(hunderedsCounts);
        amount = amount - hunderedsCounts*100;
        this.setTotalBalance(this.totalBalance-temp);
        //if(amount >=0) throw new Exception("Machine not have Sufficient Currency");
        return totalBalance;
    }
//    public int countCurrency(int amount,int currencyPrice){
//        int currencyCount= amount/currencyPrice;
//        if(currencyCount <= )
//    }

    public void setHundereds(int hundereds) {
        this.hundereds = hundereds;
    }

    public void setFiveHundereds(int fiveHundereds) {
        this.fiveHundereds = fiveHundereds;
    }

    public void setThousands(int thousands) {
        this.thousands = thousands;
    }

    public void setTotalBalance(int totalBalance) {
        this.totalBalance = totalBalance;
    }
}
