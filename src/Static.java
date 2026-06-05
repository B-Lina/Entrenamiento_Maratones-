import java.util.Scanner;

public class Static {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int b = leer.nextInt();
        int h = leer.nextInt();

        if (b<= 0 ^ h <=0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }else{
            System.out.println(b*h);
        }
    }
}
