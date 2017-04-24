/**
 * Created by Szymon - Laptop on 20/04/2017.
 */
public class QuickSortDecreasing extends Algorithm{

    public QuickSortDecreasing(int size, int[] tab) {
        super(size, tab);
    }
    @Override
    public void sort() {
        startTime=System.currentTimeMillis();
        quickSort(0,size-1);

    }

    public void quickSort(int x,int y){
        int i=x;
        int j=y;
        int v=list[(x+y)/2];
        int helper;

        do{
            while(list[i]>v)
                i++;
            while(list[j]<v)
                j--;
            if(i<=j){
                helper=list[i];
                list[i]=list[j];
                list[j]=helper;
                i++;
                j--;
            }
        }while(i<=j);

        if(x<j)
            quickSort(x,j);
        if(i<y)
            quickSort(i,y);

        stopTime=System.currentTimeMillis();
    }
}
