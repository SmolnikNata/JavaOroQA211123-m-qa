package lessonLambda13_25_05_24;

public class SimpleFuncInterface {
    public static void main(String[] args) {
        System.out.println(sum(5, 10));
        System.out.println(mult(4, 12));

       // int sum = operation(5,10, new Sum());
       // System.out.println("operation " + sum);

    }

    //чтобы убрать дублирование,создаем метод потом вызываем ено
    private static int sum(int a, int b) {
        return a + b;
    }

    private static int mult(int a, int b) {
        return a * b;
    }

    interface Calculate {
        int operator(int x, int y);
    }

    class Sum implements Calculate {

        @Override
        public int operator(int x, int y) {
            return x + y;
        }
    }
}
