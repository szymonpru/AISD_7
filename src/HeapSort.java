/**
 * Created by Szymon - Laptop on 18/04/2017.
 */
public class HeapSort extends Algorithm{
    private int N;

    public HeapSort(int size, int[] tab) {
        super(size, tab);
    }

    public void sort()
    {
        startTime=System.currentTimeMillis();
        heapify();
        for (int i = N; i > 0; i--)
        {
            swap(0, i);
            N = N-1;
            maxheap(0);
        }
        stopTime=System.currentTimeMillis();
    }
    /* Budujemy Heap */
    public void heapify()
    {
        N = size-1;
        for (int i = N/2; i >= 0; i--)
            maxheap(i);
    }
    /* Zamieniamy elementy w Heap zeby najwiekszy był na górze */
    public void maxheap(int i)
    {
        int left = 2*i ;
        int right = 2*i + 1;
        int max = i;
        if (left <= N && list[left] > list[i])
            max = left;
        if (right <= N && list[right] > list[max])
            max = right;

        if (max != i)
        {
            swap(i, max);
            maxheap(max);
        }
    }
    /* Zamiana dwóch numerów */
    public void swap(int i, int j)
    {
        int tmp = list[i];
        list[i] = list[j];
        list[j] = tmp;
    }
}
