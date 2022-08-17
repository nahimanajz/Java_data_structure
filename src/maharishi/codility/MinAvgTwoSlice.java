package maharishi.codility;
// https://app.codility.com/programmers/lessons/5-prefix_sums/min_avg_two_slice/
public class MinAvgTwoSlice {
   /* A[0] = 4
    A[1] = 9
    A[2] = 2
    A[3] = 5
    A[4] = 1
    A[5] = 5
    A[6] = 8

    */
    public static int minIndex(int[] A){
       int min =0;
       int avg = (A[0]+A[1]) / 2;
        for (int i = 1; i < A.length-1; i++) {
            int tempAvg = (A[i]+A[i+1]) / 2;
            if (tempAvg < avg) {
                min = i;
            }else{
                avg = tempAvg;
            }

        }
        //System.out.println(avg);
       return min;
    }

    public static void main(String[] args) {
        int[] arr = {4, 9,2,5,1,5,8};
        int minIndex = MinAvgTwoSlice.minIndex(arr);
        System.out.println(minIndex);
    }

}
