//        import java.math.*;
//        import java.security.*;
//        import java.text.*;
//        import java.util.*;
//        import java.util.concurrent.*;
//        import java.util.regex.*;
//
//public class Watermelon {
//
//    private static final Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        String weird = "Weird";
//        String not = "Not Weird";
//
//        int N = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        if(N%2==0){
//            if(N>=2 && N<=5){
//                System.out.println(not);
//            }
//            if(N>=6 && N<=20){
//                System.out.println(weird);
//            }
//            if(N>=20){
//                System.out.println(not);
//            }
//            if (N==2){
//                System.out.println(not);
//                System.out.println(weird);
//
//            }
//
//        }else{
//            System.out.println(weird);
//        }
//        scanner.close();
//    }
//}
