
public class SortArray {

    public static void main(String[] args) {
        int[] arr = {2, 0, 1, 0, 1, 2, 0, 0, 2, 1};
        int start = 0;
        int curr = 0;
        int end = arr.length - 1;
        while (curr <= end) {
            if (arr[curr] == 0) {
                int temp = arr[start];
                arr[start] = arr[curr];
                arr[curr] = temp;
                start++;
                curr++;
            } else if (arr[curr] == 1) {
                curr++;
            } else {
                int temp = arr[curr];
                arr[curr] = arr[end];
                arr[end] = temp;
                end--;
            }
        }
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
//Dutch Flag algo and three pointer
