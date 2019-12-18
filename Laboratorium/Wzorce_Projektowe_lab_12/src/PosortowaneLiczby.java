import java.sql.Array;
import java.util.ArrayList;

public class PosortowaneLiczby {
    StrategiaSort SS;
    private ArrayList<Integer> liczby;

    PosortowaneLiczby(StrategiaSort SS, int[] liczb) {
        this.SS = SS;
        liczby = new ArrayList<>();
        for (int i = 0; i < liczb.length; i++) {
            liczby.add(liczb[i]);
        }
        doSort();

    }

    private void doSort() {
        int[] posortowana_tab = getArray();
        SS.sortuj(posortowana_tab);
        liczby.clear();
        addArray(posortowana_tab);
    }

    public void addNumber(int i) {
        boolean isSorted = true;
        if (liczby.size() > 0) {
            int last = liczby.size() - 1;
            if (i < liczby.get(last)) isSorted = false;
        }
        liczby.add(i);
        if (isSorted == false) doSort();
    }

    public void addArray(int[] tab) {
        boolean isSorted = true;
        int last = Integer.MAX_VALUE;
        if (liczby.size() != 0) {
            last = liczby.size() - 1;
        }
        for (int i = 0; i < tab.length; i++) {
            liczby.add(tab[i]);
            if (last != Integer.MAX_VALUE) {
                if (tab[i] < last) isSorted = false;
            }
        }
        if (isSorted == false) doSort();
    }

    public int[] getArray() {
        int[] newArray = new int[liczby.size()];
        for (int i = 0; i < liczby.size(); i++) {
            newArray[i] = liczby.get(i);
        }
        return newArray;
    }

    public String toString() {
        StringBuilder SB = new StringBuilder();
        for (int i = 0; i < liczby.size(); i++) {
            SB.append(liczby.get(i)).append(" ");
        }
        return SB.toString();
    }

    public static void main(String[] args) {
        StrategiaSort ss = new StrategiaSortBabelkowe();
        int[] liczby = {5, 2, 4};
//first
        PosortowaneLiczby PL = new PosortowaneLiczby(ss, liczby);
        System.out.println(PL);
        PL.addNumber(3);
        PL.addArray(new int[]{7, 2, 5, 7});
        System.out.println(PL);
//second
        StrategiaSort ss1 = new StrategiaSortQuicksort();
        PosortowaneLiczby PL1 = new PosortowaneLiczby(ss1, liczby);
        System.out.println(PL1);
        PL1.addNumber(2);
        PL1.addArray(new int[]{0, 2, 9, 7});
        System.out.println(PL1);
    }
}
