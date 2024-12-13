package Problems.VendingMachine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Inventory {
    public static int counter=0;
    private int slotId;
    private HashMap<Integer, List<Item>> itemList;

    public Inventory() {
        //counter++;
        //this.slotId = counter;
        this.itemList = new HashMap<>();
    }

    public Item removeItem(int id, double totalCash) throws Exception {
        if(id>id) throw new Exception("Wrong input: please select the apporaite itemNumber ");
        List<Item> items = itemList.get(id);
        if(items.size()!=0){
            if(totalCash < items.get(0).getItemPrice())
                throw new Exception(" Insufficient Balance to purchase this item");

           Item item=  items.remove(0);
            return item;
        }
        else{
            throw new Exception("Item is not available");
        }
       // return itemList;
    }
    public  int addSlot(){
       // counter++;
        this.slotId++;
        this.itemList.put(slotId,new ArrayList<>());
        return slotId;
    }
    public void addItem(int id,Item item) {
//        List<Item> items=this.itemList.get(id);
//        if(items!=null){
//            this.itemList.get(id).add(item);
//        }
//        else{
//            List<Item> itemnode= new ArrayList<>();
//            itemnode.add(item);
//            this.itemList.put(id,itemnode);
//        }
        this.itemList.get(id).add(item);
    }

    public String getAllItems(){
        String menu="Inventory Item List\n";
        for(int id:this.itemList.keySet()){
            List<Item> item = this.itemList.get(id);
            menu= menu + "\n" + "SlotId: "+ id + " item: " + ((item.size()==0)? "Empty": item.get(0) ) + " itemCount: " + item.size() + "\n";

        }
        //System.out.println(this.itemList);
        return menu;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "slotId=" + slotId +
                ", itemList=" + itemList +
                '}';
    }
}
