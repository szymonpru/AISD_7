/**
 * Created by Szymon - Laptop on 18/04/2017.
 */
public class SelectSort extends Algorithm {
    public SelectSort(int size, int[] tab) {
        super(size, tab);
    }

    public void sort() {
        startTime=System.currentTimeMillis();
        int helper;
        int minValue;
        int minIndex;
        for(int i=0;i<size;i++){
            minValue=list[i];
            minIndex=i;
            for(int j=i;j<size;j++){
                if(list[j]<minValue){
                    minValue=list[j];
                    minIndex=j;
                }
            }
            if(minValue<list[i]){
                helper=list[i];
                list[i]=list[minIndex];
                list[minIndex]=helper;
            }
        }
        stopTime=System.currentTimeMillis();
    }
}
