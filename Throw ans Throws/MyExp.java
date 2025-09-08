import java.util.Scanner;

class MyExp extends Exception {
    MyExp() {
        super("Not Allowed");
    }
    public MyExp(String message) {
        super(msg);
    }
}

class Test
{
    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
            int age = sc.nextInt();
            if (x<18) {
                try {
                    throw new MyExp();
                } catch (MyExp e) {
                    System.out.println(e.getMessage());
                }
            } else {
                System.out.println("Allowed");
            }
        }
    }
}