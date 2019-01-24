import java.math.BigDecimal;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Non - Recursive Method");
        nonRecursive();

        System.out.println("Recursive Method");
        int i = 0;
        while(true){
            System.out.println(Recursive(i));
            i++;
        }

    }

    public static int nonRecursive(){
        int sum = 0;
        int a = 0;
        int b = 1;
        int i = 10;
        while(i >= 0){
            i--;
            sum = a + b;
            a = b;
            b = sum;
            System.out.print(sum + "  ");
        }
        System.out.println();
        return 0;
    }

    public static int Recursive(int i){
        if( i == 0){
            return 0;
        }
        if( i <= 2){
            return 1;
        }
        int sum = Recursive(i-1) + Recursive(i-2);
        return sum;
    }
}
