public class P10_Merge {
    public static void main(String[] args) {
        int arr[] = {4, 2, 5, 3, 1};

        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si+(ei-si) / 2;

        mergeSort(arr, si, mid); 
        mergeSort(arr, mid+1, ei);

        merge(arr, si, mid, ei);
    }
    public static void merge(int arr[], int si, int mid, int ei) {
        int tempArr[] = new int[ei-si+1];
        int i=si, j=mid+1, k=0;

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                tempArr[k++] = arr[i++];
            }
            else {
                tempArr[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            tempArr[k++] = arr[i++];
        }
        while (j <= ei) {
            tempArr[k++] = arr[j++];
        }

        for (k=0, i=si; k<tempArr.length; k++, i++) {
            arr[i] = tempArr[k];
        }
    }
    public static void printArr(int arr[]) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


// TIME COMPLEXITY OF THIS CODE :-
// in the merge sort, have two functions, first is "mergeSort" and second is "merge"
// so the TC of "mergeSort" function is = (logn)
// because they dividing everyTime into two half parts, so TC of this type function will be = (logn)
// now, the TC of "merge" function will be = O(n)
// because everyLoop moving till the (n) and (n) is major TC in this function
// so the final TC will be = n*logn = (nlogn)

// SPACE COMPLEXITY OF THIS CODE :-
// in this code we're using only one temporary array whicb is going to the (n)
// So the SC will be = O(n)