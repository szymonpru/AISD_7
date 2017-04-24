import java.util.Random;

/**
 * Created by Szymon - Laptop on 18/04/2017.
 */
public class Main {
    public static void main(String args[]){
        Random rand=new Random();
        int size=100000;
        int[] tab=new int[size];
        for(int i=0;i<size;i++){
            tab[i]=rand.nextInt(100);
        }

        System.out.println("Dane losowe: ");
        InsertSort insertSortRandom=new InsertSort(size,tab);
        insertSortRandom.sort();
        insertSortRandom.showTime();

        BubbleSort bubbleSortRandom =new BubbleSort(size,tab);
        bubbleSortRandom.sort();
        bubbleSortRandom.showTime();

        SelectSort selectSortRandom=new SelectSort(size,tab);
        selectSortRandom.sort();
        selectSortRandom.showTime();

        QuickSort quickSortRandom=new QuickSort(size,tab);
        quickSortRandom.sort();
        quickSortRandom.showTime();

        HeapSort heapSortRandom=new HeapSort(size,tab);
        heapSortRandom.sort();
        heapSortRandom.showTime();

        MergeSort mergeSortRandom=new MergeSort(size,tab);
        mergeSortRandom.sort();
        mergeSortRandom.showTime();

        int[] listGrowing=quickSortRandom.list;

        System.out.println("=========================");
        System.out.println("Dane posortowane rosnaco:");
        InsertSort insertSortGrowing=new InsertSort(size,listGrowing);
        insertSortGrowing.sort();
        insertSortGrowing.showTime();

        BubbleSort bubbleSortGrowing =new BubbleSort(size,listGrowing);
        bubbleSortGrowing.sort();
        bubbleSortGrowing.showTime();

        SelectSort selectSortGrowing=new SelectSort(size,listGrowing);
        selectSortGrowing.sort();
        selectSortGrowing.showTime();

        QuickSort quickSortGrowing=new QuickSort(size,listGrowing);
        quickSortGrowing.sort();
        quickSortGrowing.showTime();

        HeapSort heapSortGrowing=new HeapSort(size,listGrowing);
        heapSortGrowing.sort();
        heapSortGrowing.showTime();

        MergeSort mergeSortGrowing=new MergeSort(size,listGrowing);
        mergeSortGrowing.sort();
        mergeSortGrowing.showTime();

        QuickSortDecreasing quickSortDecreasing=new QuickSortDecreasing(size,tab);
        quickSortDecreasing.sort();

        int[] listDecreasing=quickSortDecreasing.list;

        System.out.println("=========================");
        System.out.println("Dane posortowane malejąco:");
        InsertSort insertSortDecreasing=new InsertSort(size,listDecreasing);
        insertSortDecreasing.sort();
        insertSortDecreasing.showTime();

        BubbleSort bubbleSortDecreasing =new BubbleSort(size,listDecreasing);
        bubbleSortDecreasing.sort();
        bubbleSortDecreasing.showTime();

        SelectSort selectSortDecreasing=new SelectSort(size,listDecreasing);
        selectSortDecreasing.sort();
        selectSortDecreasing.showTime();

        QuickSort quickSortDecreasingg=new QuickSort(size,listDecreasing);
        quickSortDecreasingg.sort();
        quickSortDecreasingg.showTime();

        HeapSort heapSortDecreasing=new HeapSort(size,listDecreasing);
        heapSortDecreasing.sort();
        heapSortDecreasing.showTime();

        MergeSort mergeSortDecreasing=new MergeSort(size,listDecreasing);
        mergeSortDecreasing.sort();
        mergeSortDecreasing.showTime();

    }
}
