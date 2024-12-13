package DesignPatterns.StateDesign;

public class Main {

    public static void main(String[] args) {
        VendigMachine machine = new VendigMachine();
        machine.setState(new InsertCashState());

        machine.insertCash(200);
        machine.selectProduct(2);
        machine.dispenseProduct();
    }
}
