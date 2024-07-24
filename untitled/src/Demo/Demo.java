package Demo;

import TechnicalLecture.Vec;

import javax.swing.tree.TreeNode;
import java.util.*;

public class Demo{

    public static void main(String[] args) {

        int nums[] = {992,324,54};
        int number = 992;
        int rev = 0;
        while (number > 0) {
            int digit = number % 10;
            rev = (rev * 10) + digit;
            number = number / 10;
        }
        number = 0;
        while (rev > 0) {
            int digit = rev % 10;
            number = (number * 10) + digit;
            rev = rev / 10;
        }






            }
        }


