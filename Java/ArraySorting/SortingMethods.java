package arraysorting;

public class SortingMethods {
    
    public void selectionSort(double[] arr){
        // Move boundary of unsorted subarray, element by element
        for(int i = 0; i < arr.length - 1; i++){
            // Find min element in unsorted array
            int min = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            // Swap min element with first element
            double temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    
    public void bubbleSort(double[] arr){
        for(int i = 0; i < arr.length -1; i++)
            for(int j = 0; j < (arr.length - i - 1); j++)
                if(arr[j] > arr[j + 1]){
                    // Swap temp and arr[i]
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }
    
    public void insertionSort(double[] arr){
        for(int i = 1; i < arr.length; i++){
            double insert = arr[i];
            int j = i - 1;
            
            /* Move elements of arr[] that are > insert to one position
                ahead of their current position */
            while(j >= 0 && arr[j] > insert){
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = insert;
        }
    }
}