package DesignPatterns.StateDesign;

public class VendigMachine {
    private State machineState;

    public void setState(State state){
        this.machineState = state;
    }

    public void insertCash(int amount){
        this.machineState.insertCash(amount);
        setState(new SelectProductState());
    }
    public void selectProduct(int option){
        this.machineState.selectProduct(option);
        setState(new DispenseProductState());
    }
    public void dispenseProduct(){
        this.machineState.dispenseProduct();
        setState(new InsertCashState());
    }
}
