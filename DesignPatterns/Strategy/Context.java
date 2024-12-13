package DesignPatterns.Strategy;

public class Context {
    private SortingAlgoritham sortingAlgoritham;

    public void setSortingAlgoritham(SortingAlgoritham sortingAlgoritham) {
        this.sortingAlgoritham = sortingAlgoritham;
    }

    public void sortData(){
        this.sortingAlgoritham.sort();
    }

    public static void main(String[] args) {
        Context client = new Context();

        client.setSortingAlgoritham(new MergeSort());
        client.sortData();

        client.setSortingAlgoritham(new QuickSort());
        client.sortData();
    }
}
