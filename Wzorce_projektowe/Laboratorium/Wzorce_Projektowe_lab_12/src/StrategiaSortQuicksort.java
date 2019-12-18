public class StrategiaSortQuicksort implements StrategiaSort {
    @Override
    public void sortuj(int[] tab) {
        Quick_sort(tab,0,tab.length-1);
    }
    void Quick_sort(int[] tab,int lewy, int prawy) {
        if(prawy <= lewy) return;

        int i = lewy - 1, j = prawy + 1,
                pivot = tab[(lewy+prawy)/2]; //wybieramy punkt odniesienia

        while(true)
        {
            //szukam elementu wiekszego lub rownego piwot stojacego
            //po prawej stronie wartosci pivot
            while(pivot>tab[++i]);

            //szukam elementu mniejszego lub rownego pivot stojacego
            //po lewej stronie wartosci pivot
            while(pivot<tab[--j]);

            //jesli liczniki sie nie minely to zamień elementy ze soba
            //stojace po niewlasciwej stronie elementu pivot
            if( i <= j)
            //funkcja swap zamienia wartosciami tab[i] z tab[j]
            {int temp = tab[i];
                tab[i]=tab[j];
                tab[j]=temp;}
            else
                break;
        }

        if(j > lewy)
            Quick_sort(tab, lewy, j);
        if(i < prawy)
            Quick_sort(tab, i, prawy);
    }
}
