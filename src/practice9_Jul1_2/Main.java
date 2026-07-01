package practice9_Jul1_2;

@FunctionalInterface
interface MultiplicationInterface {
    Integer multiplication(int a, int b);
}

public class Main {
    public static void main(String[] args) {
//        Integer result = m.multiplication(5, 10);
//        System.out.println("Результат: " + result);
        MultiplicationInterface mul = (a, b) -> {
            System.out.println("Multiplication");
            return a * b;
        };
        MultiplicationInterface div = (a, b) -> {
            System.out.println("Divergetion");
            return a / b;
        };
    }

    public static Integer mpl (MultiplicationInterface m, Integer a, Integer b){
    return multiplication.mp(a,b);
    }

}