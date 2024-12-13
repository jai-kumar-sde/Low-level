package DesignPatterns.StateDesign;

public abstract class State {

    public void insertCash(int amount){
        System.out.println("This operation is not perform on this InsertCash State");
    }
    public void selectProduct(int option){
        System.out.println("This operation is not perform on select Product state");
    }
    public void dispenseProduct(){
        System.out.println("This operation is not perform on dispense product state");
    }
}
