/**
 * Created by Szymon - Laptop on 18/04/2017.
 */
public class QuickSort extends Algorithm {

    public QuickSort(int size, int[] tab) {
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
        int v=list[(x+y)/2]; //piwot na środku
        int helper;

        do{
            while(list[i]<v)
                i++;
            while(list[j]>v)
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
