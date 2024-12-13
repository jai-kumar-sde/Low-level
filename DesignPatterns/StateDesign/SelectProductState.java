package DesignPatterns.StateDesign;

public class SelectProductState extends State {
    public SelectProductState() {
        System.out.println("Please select the product");
    }

    @Override
    public void selectProduct(int option) {
        System.out.println("Selected product : " + option);
    }
}
