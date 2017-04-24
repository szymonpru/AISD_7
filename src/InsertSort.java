/**
 * Created by Szymon - Laptop on 18/04/2017.
 */
public class InsertSort extends Algorithm{

    public InsertSort(int size, int[] tab) {
        super(size, tab);
    }

    public void sort(){
        startTime=System.currentTimeMillis();
        int helper;
        for(int i=1;i<size;i++){
            int key=list[i];
            int j=i-1;
            while(j>=0 && list[j]>key){
                helper=list[j];
                list[j]=list[j+1];
                list[j+1]=helper;
            j--;
            }
        }
        stopTime=System.currentTimeMillis();
    }

}
