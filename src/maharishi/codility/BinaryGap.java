package maharishi.codility;
// https://app.codility.com/programmers/trainings/9/binary_gap/
public class BinaryGap {
    static int binaryGap(String n){
        char [] nums = n.toCharArray();
        if(nums[0] == '0' && nums[nums.length -1] == '0'){
           return 0;
        }
        System.out.println(nums);
        //
        int zeroes = 0;
        int tempCounter = 0;
        int lastIndex = nums.length -1;
        for(int i =1; i <lastIndex ; i++){
                if(nums[i] == '0'){
                    tempCounter++;
                    //System.out.println("detected"+tempCounter);
                }else if(nums[i] =='1' && nums[i-1] == '0') {
                    zeroes = tempCounter ;
                    tempCounter = 0;
                }
            }
        return zeroes;

    }

    public static void main(String[] args) {
        String  binary = Integer.toBinaryString(529);

        System.out.print(BinaryGap.binaryGap(binary));
//        10001000010
//        1000010001
    }
}
