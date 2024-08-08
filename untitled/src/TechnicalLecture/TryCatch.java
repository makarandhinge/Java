package TechnicalLecture;

public class TryCatch {
    public static void main(String[] args) {
//        System.out.println(m1());

    int age = 21;
    if(age >= 21){
        throw new CustomException("Eligble for vote");

    }else{
        throw new CustomException("you are not eligble as of now");
    }
    }
}

//    static private int m1() {
//        try {
//            System.out.println("Helllo");
//            return 111;
//            System.exit(0);
//        } catch (NullPointerException e) {
//            return 123;
//        } finally {
//            return 432;
//
//        }
//
//    static private void m2(){
//        try{
//            PrintWriter p = new PrintWriter("abcd.txct");
//        }catch(FileNotFoundException e){
//            e.printStackTrace();
//        }
//    }return 0;
//    }}
