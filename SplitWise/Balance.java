package Problems.SplitWise;

public class Balance {
    private double owe;
    private double lent;

    public Balance(double owe, double lent) {
        this.owe = owe;
        this.lent = lent;
    }

    public double getOwe() {
        return owe;
    }

    public void setOwe(double owe) {
        this.owe = owe;
    }

    public double getLent() {
        return lent;
    }

    public void setLent(double lent) {
        this.lent = lent;
    }
}
