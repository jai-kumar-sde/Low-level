package DesignPatterns.Composite;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        File file1 = new File(30,"subFile");
        Folder folder1 = new Folder("First",new ArrayList<>(
                Arrays.asList(file1)
        ));

        System.out.println(folder1.getSize());

        Folder folder2 = new Folder("Second",new ArrayList<>());

        File file = new File(10,"File.txt");

        Directory client = new Folder("root",new ArrayList<>(
                Arrays.asList(
                        folder1,
                        folder2,
                        file
                )
        ));

        System.out.println(client.getSize());
    }
}
