package maharishi.exercise;

public class GetPrimes {
    static void getPrimes(){
        int[] array = { 1, 3,4,5,6,7};
        int sum = 0;
        for(int i=0; i < array.length; i++){
            boolean isPrime = true;

            //check to see if the numbers are prime
            for (int j=2; j< array[i]; j++){

                if(array[i]%j == 0){
                    isPrime = false;
                    break;
                }
            }
            //print the number
            if(isPrime && array[i] % 2 != 0)
                sum +=array[i];
                System.out.println(array[i] + " are the prime numbers in the array ");
        }
        System.out.println(sum);
    }
    static int checkPrimes(int n){
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
              return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        //getPrimes();
        int[] arr = {1,2,3,4,5,6};
        for (int i = 0; i <arr.length; i++) {
            if(checkPrimes(arr[i]) == 1) {

            }
        }
        System.out.println(checkPrimes(7));
    }
}
