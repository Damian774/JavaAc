

public class TravelOffice {

    public static void main(String[] args) {
        int tab[][] = {{1,2},{3,4},{5,6}};

        for (int[] ints : tab)
            for (int anInt : ints) System.out.println(anInt);


        for(int i=0;i<tab.length;i++)
            for(int j=0;j<tab[i].length;j++)
                System.out.println(tab[i][j]);


    }
}





