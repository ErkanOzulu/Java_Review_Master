package arraySorting;

public class ArraySorting {
    public static void main(String[] args) {
        ArraySorting as=new ArraySorting();

       QuickSort qs=new QuickSort();  // same thin with polymorphism -->Sorting qs=new QuickSort();
       BubleSort bs=new BubleSort();

       as.sort(bs);
       as.sort(qs);


    }

    private void sort(Sorting sorting) {

        sorting.sort();
    }
}
