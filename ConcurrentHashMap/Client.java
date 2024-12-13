package Problems.ConcurrentHashMap;

import Problems.MovieBookingSystem.Theater;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;


class ReaderThread implements Runnable {

    private ConCurrentHashMap map;

    ReaderThread(ConCurrentHashMap map){
    this.map=map;
    }

    @Override
    public void run() {

        System.out.printf("Thread : reading value %s \n", this.map.getValue(522));

    }
}
class WriterThread extends Thread{
    private ConCurrentHashMap map;
    private static AtomicInteger  counter = new AtomicInteger(1);

    WriterThread(ConCurrentHashMap map){
        this.map=map;
    }

    @Override
    public void run() {
        System.out.println("Thread: Writing to map");
        map.addValue(522,500 + counter.getAndIncrement());

    }
}

public class Client {


    public static void main(String[] args) {
        ConCurrentHashMap map = new ConCurrentHashMap(100);

        map.addValue(522,100);
        map.addValue(455,64);
        map.addValue(99,44);

        System.out.println(map.getValue(455));
        System.out.println(map.getValue(22));
        System.out.println(map.getValue(99));

        map.addValue(22,200);
        map.addValue(522,300);
        System.out.println(map.getValue(22));

        Thread readThread = new Thread(new ReaderThread(map));
        Thread writeThread = new WriterThread(map);

        List<Thread> listRead = new ArrayList<>();
        List<Thread> listWrite = new ArrayList<>();

        for(int i=0;i<10;i++){
            listRead.add(new Thread(new ReaderThread(map)));
        }
        for(int i=0;i<10;i++){
            listWrite.add(new WriterThread(map));
        }
        for(int i=0;i<10;i++){
            listWrite.get(i).start();
        }
        for(int i=0;i<10;i++){
            listRead.get(i).start();
        }


        writeThread.start();
        readThread.start();

        System.out.println(map.getValue(522));

    }
}
