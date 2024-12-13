package DesignPatterns.StateDesign;

public class InsertCashState extends State{

    public InsertCashState() {
        System.out.println("Please Enter the amount");
    }

    @Override
    public void insertCash(int amount) {
        System.out.println("Money is received : " + amount );
    }
}
