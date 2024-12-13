package Problems.ConcurrentHashMap;

import java.util.*;
/*
* we need to use generic here
*
* */
public class ConCurrentHashMap  implements IHashMap{
    private List<Set<Data>> mapData;
    private Integer m;

    public ConCurrentHashMap(Integer m) {
        this.mapData = new ArrayList<>();
        for(int i=0;i<m;i++){
            this.mapData.add(new HashSet<>());
        }
                //Arrays.asList(new Data[100]);
        this.m = m;
    }

    @Override
    public   void addValue(int key, int value) {
        Integer hashCode = key % m;
        boolean flag = true;
//        if(this.mapData.get(hashCode)==null){
//            mapData.set(hashCode,new HashSet<>()) ;
//        }
        for(Data data : mapData.get(hashCode)){
           // System.out.println("asdf");
            if(data.getKey() == key ){
                data.setValue(value);
                flag=false;
                break;
            }
        }
        if(flag){
            mapData.get(hashCode).add(new Data(key,value));
        }
    }

    @Override
    public synchronized Integer getValue(int key) {
        Set<Data> set = this.mapData.get(key%m);
        for(Data data: set){
            if(data.getKey() == key){
                return Integer.valueOf(data.getValue());
            }
        }
        return null;
    }

}
