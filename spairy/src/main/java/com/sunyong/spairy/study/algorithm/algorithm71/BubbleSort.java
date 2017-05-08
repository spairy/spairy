package com.sunyong.spairy.study.algorithm.algorithm71;

public class BubbleSort {

	public static void bubbleSort(int[] a)
    {
        int temp = 0;
        for (int i = a.length - 1; i > 0; --i)
        {
            for (int j = 0; j < i; ++j)
            {
                if (a[j + 1] < a[j])
                {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
	
    public static void main(String[] args) {
        int[] a  =  new int[]{4, 3, 6, 1, 2, 5};
        bubbleSort(a);
        for (int i = 0; i < a.length;  ++i) {
            System.out.print(a[i] + " ");
        }
    }
}
