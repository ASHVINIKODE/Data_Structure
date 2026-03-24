
public class SortArrays {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 0, 2, 3, 3, 1, 0, 0, 2, 1};
        int c0 = 0, c1 = 0, c2 = 0, c3 = 0;
        for (int x : arr) {
            if (x == 0) {
                c0++; 
            }else if (x == 1) {
                c1++; 
            }else if (x == 2) {
                c2++; 
            }else if (x == 3) {
                c3++;
            }
        }
        int i = 0;
        while (c0-- > 0) {
            arr[i++] = 0;
        }
        while (c1-- > 0) {
            arr[i++] = 1;
        }
        while (c2-- > 0) {
            arr[i++] = 2;
        }
        while (c3-- > 0) {
            arr[i++] = 3;
        }
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
//count