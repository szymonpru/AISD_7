/**
 * Created by Szymon - Laptop on 18/04/2017.
 */
public class MergeSort extends Algorithm{
    private int[] tabHelp;
    public MergeSort(int size, int[] tab) {
        super(size, tab);
        tabHelp=new int[size];
    }

    private void merge(int pocz, int sr, int kon)
    {
        int i,j,q;
        for (i=pocz; i<=kon; i++) tabHelp[i]=list[i];  // Skopiowanie danych do tablicy pomocniczej
        i=pocz; j=sr+1; q=pocz;                 // Ustawienie wskaźników tablic
        while (i<=sr && j<=kon) {         // Przenoszenie danych z sortowaniem ze zbiorów pomocniczych do tablicy głównej
            if (tabHelp[i]<tabHelp[j])
                list[q++]=tabHelp[i++];
            else
                list[q++]=tabHelp[j++];
        }
        while (i<=sr) list[q++]=tabHelp[i++]; // Przeniesienie nie skopiowanych danych ze zbioru pierwszego w przypadku, gdy drugi zbiór się skończył
    }

    /* Procedura sortowania tab[pocz...kon] */
    public void mergesort(int pocz, int kon)
    {
        int sr;
        if (pocz<kon) {
            sr=(pocz+kon)/2;
            mergesort(pocz, sr);    // Dzielenie lewej części
            mergesort(sr+1, kon);   // Dzielenie prawej części
            merge(pocz, sr, kon);   // Łączenie części lewej i prawej
        }
        stopTime=System.currentTimeMillis();
    }

    @Override
    public void sort() {
        startTime=System.currentTimeMillis();
    mergesort(0,size-1);
    }
}
