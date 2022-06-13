package maharishi;
// https://leetcode.com/problems/richest-customer-wealth/
class MaximumWealth {
    public static int wealthier(int[][] accounts) {
        int answ = 0;
        for(int person = 0; person < accounts.length; person++) {
            int rowSum = 0;
            for(int account= 0; account < accounts[person].length; account++) {
                rowSum += accounts[person][account];
            }
            if(answ < rowSum) {
                answ = rowSum;
            }
        }
        return answ;
    }

    public static void main(String[] args) {
        int[][] accounts = { {1,2,3}, {3,2,1} };
        System.out.println( wealthier(accounts));

    }
}