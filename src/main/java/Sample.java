public class Sample {
    public static void main(String[] args) {
        System.out.println("HelloWorld!");

        for (int i = 1; i <= 10; i++) {
            System.out.println("HelloWorld");
        }

        System.out.println("-------------");

        for (int i = 1; i <= 20; i++) {
            if (i <= 10) {
                System.out.println("HelloWorld");
            } else if (i >= 11) {
                System.out.println("Hello");
            }
        }
    }
}
