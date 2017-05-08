package com.sunyong.spairy.study.algorithm.algorithm71;

public class InsertSort {
	
	/**
	 * 插入排序
	 * 
	 * @param arr
	 * @return
	 */
	private static void insertSort(int[] arr) {
		if (arr == null || arr.length < 2) {
			return;
		}
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					// TODO:
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				} else {
					// 接下来是无用功
					break;
				}
			}
		}
	}
	
    public static void main(String[] args) {
        int[] a  =  new int[]{4, 3, 6, 1, 2, 5};
        insertSort(a);
        for (int i = 0; i < a.length;  ++i) {
            System.out.print(a[i] + " ");
        }
    }
}
