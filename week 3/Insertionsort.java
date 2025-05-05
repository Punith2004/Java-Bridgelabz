import java.util.Arrays;
public class Insertionsort{
    public static void insertionSort(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;

        }
    }

    public static void main(String[] args){
        int[] arr={23,78,64,34,98};
        insertionSort(arr);
        System.out.print(Arrays.toString(arr));
    }
}