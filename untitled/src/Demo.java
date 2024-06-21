import java.sql.SQLOutput;

public class Demo {


    public static void main(String[] args) {

        for(int i = 1; i<11 ; i++){
            if(i == 5){
                System.out.println("before break");
                continue;

            }
            System.out.println(i);
        }
    }

}
