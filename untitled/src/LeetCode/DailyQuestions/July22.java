package LeetCode.DailyQuestions;

//Sort the People based on height in descending order

public class July22 {

    public static void main(String[] args) {
        String names[] = {"Mary", "John", "Emma"};
        int heights[] = {180, 165, 170};
        System.out.println("Before Sorted");
        for (String x : names) {
            System.out.println(x);
        }
        Solution1Ms s = new Solution1Ms();
        s.sortPeople(names, heights);
        System.out.println("After Sorted");
        for (String x : names) {
            System.out.println(x);
        }
    }
}
//This solution created by me.
class Solution23Ms {
    public String[] sortPeople(String names[], int[] heights) {
        for (int i = 0; i < heights.length; i++) {
            for (int j = i + 1; j < heights.length; j++) {
                if (heights[i] < heights[j]) {
                    int temp_height = heights[i];
                    String temp_name = names[i];
                    heights[i] = heights[j];
                    names[i] = names[j];
                    heights[j] = temp_height;
                    names[j] = temp_name;
                }
            }
        }
        return names;
    }
}

//Got it from Leetcode
class Solution1Ms {
    private <T> void insertionSortReverseOrder(int[] main, T[] side, int left, int right) {
        for(int i = left+1; i <= right; i++) {
            for(int j = i - 1; j >= 0; j--) {
                if(main[j+1] > main[j]) { // reverse order
                    int t = main[j+1];
                    main[j+1] = main[j];
                    main[j] = t;

                    T tT = side[j+1];
                    side[j+1] = side[j];
                    side[j] = tT;
                }else break;
            }
        }
    }
    private <T> void quickSortReverseOrder(int[] main, T[] side, int left, int right) {
        if(left >= right) return;
        if(right - left <= 11) {
            // Do insertion sort
            insertionSortReverseOrder(main, side, left, right);
            return;
        }
        // Choose pivot of median between left, left+1, left+2
        int pivot;
        {
            int aV = main[left], bV = main[left+1], cV = main[left+2];
            if(aV <= bV && aV <= cV) {
                // a is smallest
                pivot = bV <= cV ? (left+1) : (left+2);
            }else if(bV <= aV && bV <= cV) {
                // b is smallest
                pivot = aV <= cV ? (left) : (left+2);
            }else {
                // c is smallest
                pivot = aV <= bV ? (left) : (left+1);
            }
        }

        int val = main[pivot];
        { // swap pivot with right
            main[pivot] = main[right];
            main[right] = val;
        }
        {
            T x = side[pivot];
            side[pivot] = side[right];
            side[right] = x;
        }
        int L = left, R = right - 1;
        while(true) {
            while(L <= R && main[L] >= val) L++; // Reverse order
            while(L <= R && main[R] <= val) R--;
            if(L < R) {
                { // swap idx L and R
                    int z = main[L];
                    main[L] = main[R];
                    main[R] = z;
                }
                {
                    T z = side[L];
                    side[L] = side[R];
                    side[R] = z;
                }
                L++; R--;
            }else {
                break;
            }
        }
        { // swap idx L and right
            int z = main[L];
            main[L] = main[right];
            main[right] = z;
        }
        {
            T z = side[L];
            side[L] = side[right];
            side[right] = z;
        }
        quickSortReverseOrder(main, side, left, L-1);
        quickSortReverseOrder(main, side, L+1, right);
    }
    public String[] sortPeople(String[] names, int[] heights) {
        quickSortReverseOrder(heights, names, 0, names.length-1);
        return names;
    }
}
