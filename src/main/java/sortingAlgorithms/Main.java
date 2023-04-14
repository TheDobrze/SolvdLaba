package sortingAlgorithms;

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] arr = {10,4,5,64,24,66,2,22,14,0};
        int[] arr1 = {10,4,5,64,24,66,2,22,14,0};
        int[] arr2 = {10,4,5,64,24,66,2,22,14,0};
        int[] arr3 = {10,4,5,64,24,66,2,22,14,0};
        int[] arr4 = {10,4,5,64,24,66,2,22,14,0};
        int[] arr5 = {10,4,5,64,24,66,2,22,14,0};
        System.out.println(Arrays.toString(arr));
        qsort(arr,0, arr.length-1);
        insertionSort(arr1);
        bubble(arr2);
        shaker(arr3);
        selection(arr4);
        margeSort(arr5, arr5.length);
        System.out.println(Arrays.toString(arr5));


    }

    public static void margeSort(int[] arr,int right) {
        if(right<2){
            return;
        }
            int mid = right/2;
            int[] l =new int[mid];
            int[] r =new int[right-mid];
            for(int i =0;i<mid;i++){
                l[i] = arr[i];
            }
            for (int i=mid;i<right;i++){
                r[i-mid] = arr[i];
            }
            margeSort(l,mid);
            margeSort(r,right-mid);
            marge(arr,l,r,mid,right-mid);
    }

    public static void marge(int[] arr,int[] l, int[] r,int left,int right) {
        int i=0, j=0,k=0;
        while (i< left && j<right){
            if(l[i]<=r[j]){
                arr[k++]=l[i++];
            }else {
                arr[k++]=r[j++];
            }

            }
        while (i<left){
                arr[k++]=l[i++];
        }
        while (j<right){
            arr[k++]=r[j++];
        }
    }

    public static void selection(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            int min_index=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min_index]){
                    min_index=j;
                }
            }
            int temp = arr[min_index];
            arr[min_index]=arr[i];
            arr[i] = temp;
        }
    }

    public static void shaker(int[] arr) {
        int left=1, right =arr.length-1, k=arr.length-1;
        int temp;
        do{
            for(int j=right;j>=left;j--) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    k = j;
                }
            }
                left=k+1;
                for(int j=left;j<=right;j++){
                    if (arr[j - 1] > arr[j]) {
                        temp = arr[j - 1];
                        arr[j - 1] = arr[j];
                        arr[j] = temp;
                        k = j;
                    }
            }right = k-1;
        }while (left<=right);
    }

    public static void bubble(int[] arr) {
        for(int i=1;i<arr.length;i++){
            for(int j=arr.length-1;j>=i;j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void insertionSort(int[] arr) {
        for(int i=1;i<arr.length;i++){
            int temp = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j=j-1;
            }
            arr[j+1] = temp;
        }
    }

    public static void qsort(int[] arr, int left, int right) {
        if(left<right){
            int m = partition(arr,left,right);
                qsort(arr,left,m-1);
                qsort(arr,m+1,right);
            }
        }


    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int t = (left-1);

        for(int i=left;i<right;i++){
            if(arr[i]<=pivot){
                t++;
                int temp = arr[t];
                arr[t] = arr[right];
                arr[i] = temp;
            }
        }
        int temp = arr[t+1];
        arr[t+1] = arr[right];
        arr[right] = temp;

        return t+1;
    }
}


