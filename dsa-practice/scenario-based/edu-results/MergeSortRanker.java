
// Merge Sort for Student objects based on marks (Descending)

public class MergeSortRanker{
    public void mergeSort(Student[] arr, int left, int right){
        if(left < right){
            int mid = (left + right)/2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }
    
    private void merge(Student[] arr, int left, int mid, int right){       // Merge two sorted halves (stable)
        Student[] temp = new Student[right - left + 1];
        int i = left, j = mid + 1, k = 0;
        while(i <= mid && j <= right){                     // Sorting in descending order of marks
            if(arr[i].marks >= arr[j].marks){
                temp[k++] = arr[i++];
            }else{
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid) temp[k++] = arr[i++];
        while (j <= right) temp[k++] = arr[j++];
        
        for(int x=0;x<temp.length;x++){           // Copy back
            arr[left + x] = temp[x];
        }
    }
}
