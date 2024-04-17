public class P5_Bubble {
    public static void main(String[] args) {
        int arr[] = {4, 5, 2, 1, 3, 0};
        bubbleSort(arr);
        
        System.out.println();

        int arr1[] = {1, 2, 3, 4, 5};
        optimizedBubbleSort(arr1);
    }
    public static void bubbleSort(int arr[]) {
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr.length-1; j++) {
                if (arr[j] > arr[j+1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (int printArr : arr) {
            System.out.print(printArr + " ");
        }

        
// CASE 1 : Worst & Best case TC in BubbleSort :-
// TIME COMPLEXITY OF THIS CODE IS = (n)*(n-1)*constWork
// So, TC = n^2 = O(n^2)
    }
    public static void optimizedBubbleSort(int arr1[]) {
        for (int i=0; i<arr1.length-1; i++) {
            boolean swapped = false;
            for (int j=0; j<arr1.length-1-i; j++) {
                if (arr1[j] > arr1[j+1]) {
                    // swap
                    int temp = arr1[j];
                    arr1[j] = arr1[j+1];
                    arr1[j+1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false) {
                break;
            }
        }

        for (int printArr : arr1) {
            System.out.print(printArr + " ");
        }


        
// CASE 2 : Worst case TC in optimized BubbleSort :-
// TIME COMPLEXITY OF THIS CODE IS = (n)*(n-1)*constWork
// So, TC = n^2 = O(n^2)

// But in the Best case TC is :-
// TIME COMPLEXITY OF THIS CODE IS = n*constWork   (Because they're breaking the loop when condition is false)
// So the final TC = O(n)
    }
}