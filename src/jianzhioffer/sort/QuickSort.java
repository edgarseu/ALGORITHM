package jianzhioffer.sort;

/**
 * Created by Administrator on 2016/8/21.
 */
public class QuickSort {
    public static void main(String[] args){
        int[] arr={1,4,6,2,5,8,7,6,9,12};
        quickSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
    }
    public static void quickSort(int[] arr,int start,int end){
        if(start<end){
            int index= partion(arr,start,end);
            quickSort(arr,start,index-1);
            quickSort(arr,index+1,end);
        }
    }

    private static int partion(int[] arr, int start, int end) {

            int index=start;
            int pivot=arr[index];
            int j=start;
            int temp;
            for(int i=start+1;i<end;i++) {
                if (arr[i] < arr[index]) {
                    j = j + 1;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
                temp=arr[j];
                arr[j]=pivot;
                arr[index]=temp;

            return j;
    }
}
