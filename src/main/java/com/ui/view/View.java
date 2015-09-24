package main.java.com.ui.view;

import main.java.com.service.quicksort.QuickSort;
import main.java.com.service.quicksort.impl.QuickSortServiceImpl;

public class View
{
    public static void main(String[] args)
    {
        QuickSort quickSort = new QuickSortServiceImpl();
        int[] tableau = quickSort.createTab(6);

        System.out.println("Before sorting : ");
        quickSort.showTab(tableau);

        System.out.println("Sorting tab : ");
        quickSort.sort(tableau);

        System.out.println("After sorting tab : ");
        quickSort.showTab(tableau);
    }
}
