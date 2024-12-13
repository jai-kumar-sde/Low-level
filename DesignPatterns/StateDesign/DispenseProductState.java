package DesignPatterns.StateDesign;

public class DispenseProductState extends State {
    public DispenseProductState() {
        System.out.println("Dispense State ");
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Please collect the product");
    }
}
