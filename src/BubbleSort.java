/**
 * Created by Szymon - Laptop on 18/04/2017.
 */
public class BubbleSort extends  Algorithm{
    public BubbleSort(int size, int[] tab) {
        super(size, tab);
    }

    public void sort() {
        startTime=System.currentTimeMillis();
        int helper;
        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-1-i;j++){
                if(list[j]>list[j+1]){
                    helper=list[j];
                    list[j]=list[j+1];
                    list[j+1]=helper;
                }
            }
        }
        stopTime=System.currentTimeMillis();
    }
}
