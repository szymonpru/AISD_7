/**
 * Created by Szymon - Laptop on 18/04/2017.
 */
public abstract class Algorithm {
    int list[];
    int size;
    long startTime;
    long stopTime;

    public Algorithm(int size,int tab[]){
        this.size=size;
        list=new int[size];
        for(int i=0;i<size;i++){
            list[i]=tab[i];
        }
    }

    public abstract void sort();

    public void showList(){
        for(int i=0;i<size;i++){
            System.out.println(list[i]);
        }

    }

    public void showTime(){
        System.out.println("Czas wykonania (w milisekundach) "+this.getClass().getSimpleName() + " : "+(stopTime-startTime));
    }
}
