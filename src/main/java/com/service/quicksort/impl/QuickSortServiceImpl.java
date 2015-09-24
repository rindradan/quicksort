package main.java.com.service.quicksort.impl;

import main.java.com.service.quicksort.QuickSort;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class QuickSortServiceImpl implements QuickSort
{
    @Override
    public int[] createTab(int size)
    {
        int[] tab = new int[size];
        Random random = new Random();
        Set setNumber = new HashSet();
        int i = 0;

        while (size > i)
        {
            int tmp = random.nextInt(10);
            if (!setNumber.contains(tmp))
            {
                setNumber.add(tmp);
                tab[i++] = tmp;
            }
        }

        return tab;
    }

    @Override
    public void sort(int[] tab)
    {
        int i = 1;
        int j = tab.length - 1;
        int pivot = 0;

        sort(tab, i, j, pivot);
    }

    private void sort(int[] tab, int lo, int hi, int pivot)
    {
        if (lo < 0 || hi < 0 || hi < lo)
            return;

        int i = lo;
        int j = hi;

        while (i < j)
        {
            if (tab[pivot] < tab[j])
                j--;
            else if (tab[pivot] > tab[i])
                i++;
            else
            {
                swap(tab, i, j);
                i++;
                j--;
            }
        }

        if (tab[pivot] > tab[i])
            swap(tab, pivot, i);

        pivot = i;
        sort(tab, lo, pivot-1, lo-1);
        sort(tab, pivot+1, hi, pivot);
    }

    private void swap(int[] tab, int a, int b)
    {
        int temp = tab[a];
        tab[a] = tab[b];
        tab[b] = temp;
        showTab(tab);
    }

    @Override
    public void showTab(int[] tab)
    {
        for (int t : tab)
            System.out.print(t + "     ");
        System.out.println();
    }
}
