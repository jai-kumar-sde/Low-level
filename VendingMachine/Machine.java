package Problems.VendingMachine;

import java.util.Scanner;

public class Machine {
    private Inventory inventory;

    public Machine(Inventory inventory) {
        this.inventory = inventory;
    }

    public double  getCash(){
        System.out.println("Pres Enter the Amount");
        Scanner obj = new Scanner(System.in);
        double cashInput = obj.nextDouble();
        return cashInput;
    }

    void start(){
        Scanner obj = new Scanner(System.in);
        while(true){
            System.out.println(" Press Enter : 1: Buy New Item \n " +
                    "2. Close Machine to close machine");
            int input = obj.nextInt();

            if(input == 1){
                double inputCash = getCash();
                while(inputCash>0){
                    System.out.println(this.inventory.getAllItems());
                    System.out.println("Current Balance: "+ inputCash + "\n");
                    int itemId= obj.nextInt();
                    if(itemId==-1)break;

                    try {
                        Item item =this.inventory.removeItem(itemId, inputCash);
                        inputCash = inputCash  - item.getItemPrice();
                        System.out.println("item: " + item.getItemName() + " please collect \n");

                    }
                    catch(Exception e){
                        System.out.println(e);
                        System.out.println("Please Enter again value Option \n");
                    }
                    System.out.println("press -1 to exit \n");
                }
            }
            else{
                System.out.println(" wrong input pleae Reenter: \n ");
                if(input ==-1)break;
            }
        }
    }

    public static void main(String[] args) {
        Item item1 = new Item("Chips", 20.0);
        Item item2 = new Item("Chips", 20.0);
        Item item3 = new Item("Biscuits", 30.0);
        Item item4 = new Item("Biscuits", 30.0);
        Item item5 = new Item("Juice", 40.0);
        Item item6 = new Item("Juice", 40.0);

        Inventory inventory = new Inventory();
        int slotId1=inventory.addSlot();
        int slotId2=inventory.addSlot();
        int slotId3=inventory.addSlot();
        inventory.addItem(slotId1,item1);inventory.addItem(slotId1,item2);
        //System.out.println(inventory.getAllItems());
        inventory.addItem(slotId2,item3);inventory.addItem(slotId2,item4);
       // System.out.println(inventory.getAllItems());
        inventory.addItem(slotId3,item5);inventory.addItem(slotId3,item6);

        Machine vendingMachine = new Machine(inventory);

        vendingMachine.start();

    }
}
