//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Scanner;
//
////public class Solution {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//        String nombre = scanner.nextLine();
//        nombre = nombre.toLowerCase();
//        int tamano = nombre.length();
//
//        List<Character> vocales = Arrays.asList('a', 'e', 'i', 'o', 'u');
//
//        char primeraLetra = nombre.charAt(0);
//        char ultimaLetra = nombre.charAt(nombre.length()-1);
//
//        if (primeraLetra == ultimaLetra){
//            System.out.println("Friend");
//        } else {
//            if (vocales.contains(primeraLetra) && vocales.contains(ultimaLetra)) {
//                System.out.println("Enemy!");
//            } else {
//                System.out.println("Friend");
//            }
//        }
//    }
//}
