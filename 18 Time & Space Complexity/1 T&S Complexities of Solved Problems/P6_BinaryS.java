public class P6_BinaryS {
    public static int binarySearch(int arr[], int target) {
        int si=0, ei=arr.length-1;

        while (si <= ei) {
            int mid = (si+ei) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] < target) {
                si = mid+1;
            }
            else {
                ei = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10, 12};

        int found = binarySearch(arr, 10);
        if (found != -1) {
            System.out.println("Target is Found at index: " + found);
        } else {
            System.out.println("Target is Not Found");
        }
    }
}


// TIME COMPLEXITY OF THIS CODE IS :-
// Dividing everyTime till the end = (n/2^1), (n/2^2)......(n/2^k)
// At the end they'll be := (n/2^k)=1
// We can take log := log2(n)=k
// 2 is constWork, ignore it := log(n)=k or k=log(n)
// Every time work happening = p
// So, TC = O(k * p)
// p is consWork, ignore it := O(k)
// Now final TC = O(logn)