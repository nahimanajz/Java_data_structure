package maharishi.post;

import java.util.HashMap;

public class Divider {
    /**
     * take whole salary
     * calculate 30 percent of whole month
     * @return monthly deduction times 3
     */
    public static int first(){
        int salary = 650;
        int monthlyDeduction = (salary*30)/100;
        return monthlyDeduction * 3;
    }
    public int second(int months, int totalPayment,int baseInterest){
        return (totalPayment * ( (5 - months) * baseInterest)) / 100;
    }
    public HashMap<String, Integer> doublePhasePayment(int phaseOne, int phaseTwo){
        HashMap<String, Integer> total = new HashMap<>();
        total.put("total", phaseOne+phaseTwo);
        return total;

    }

    public static void main(String[] args) {
        Divider div = new Divider();
        int second = div.second(1,2800, 10);
        System.out.println(second);
        System.out.println(Divider.first());
        System.out.println(div.doublePhasePayment(Divider.first(), second).values());
    }
}
