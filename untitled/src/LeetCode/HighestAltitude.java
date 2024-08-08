package LeetCode;

public class HighestAltitude {

    public static void main(String[] args) {
        HighestAltitude h = new HighestAltitude();
        int[] gain = {44,32,-9,52,23,-50,50,33,-84,47,-14,84,36,-62,37,81,-36,-85,-39,67,-63,64,-47,95,91,-40,65,67,92,-28,97,100,81};
        System.out.println(h.largestAltitude(gain));
    } public int largestAltitude(int[] gain) {
        int[] prisum = new int[gain.length + 1];
        prisum[0] = 0;
        int temp = prisum[0];
        for(int i = 0;i< gain.length;i++){

            prisum[i + 1] = prisum[i] + gain[i];
            if(temp < prisum[i + 1]){
                temp = prisum[i + 1];
            }
        }

        for(int i :prisum) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(prisum[33]);
        return temp;

    }
}
