public class Qs3 { // HARD LEVEL QUESTION
    public static void main(String[] args) {
        // Qs 3 : Find the Inversion Count fromm th given array
        int arr[] = { 2, 4, 1, 3, 5 };

        System.out.println("Inversion Count : " + getInversionCount(arr));
        int getIC = mergeSort(arr, 0, arr.length-1);
        System.out.println("Inversion Count : " + getIC);
    }

    // Approach 1 : Brute Force with 0(n^2) TimeComplexity
    static int getInversionCount(int arr[]) {
        int InversionCount = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    InversionCount++;
                }
            }
        }
        return InversionCount;
    }

    // Approach 2 : Modified Merge Sort with 0(n*log n) TimeComplexity
    private static int mergeSort(int arr[], int si, int ei) {
        int inversionCount = 0;
        if (ei > si) {
            int mid = si + (ei - si) / 2;
            inversionCount = mergeSort(arr, si, mid);
            inversionCount += mergeSort(arr, mid + 1, ei);
            inversionCount += merge(arr, si, mid + 1, ei);
        }
        return inversionCount;
    }
    public static int merge(int arr[], int si, int mid, int ei) {
        int tempArr[] = new int[(ei - si + 1)];
        int i = si, j = mid, k = 0;
        int inversionCount = 0;
        
        while ((i < mid) && (j <= ei)) {
            if (arr[i] <= arr[j]) {
                tempArr[k++] = arr[i++];
            } else {
                tempArr[k++] = arr[j++];
                inversionCount += (mid - i);
            }
        }
        while (i < mid) {
            tempArr[k++] = arr[i++];
        }
        while (j <= ei) {
            tempArr[k++] = arr[j++];
        }
        for (k = 0, i = si; k <= tempArr.length - 1; k++, i++) {            arr[i] = tempArr[k];
        }
        return inversionCount;
    }
}