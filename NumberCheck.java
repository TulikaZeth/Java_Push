class Number {

    private double number;
    public Number(double number) {
        this.number = number;
    }
    public boolean isZero() {
        return number == 0;
    }
    public boolean isPositive() {
        return number > 0;
    }

    public boolean isNegative() {
        return number < 0;
    }

    public boolean isOdd() {

        if (number % 1 != 0) {
            return false;
        }
        return ((int)number % 2) != 0;
    }

    public boolean isEven() {
        if (number % 1 != 0) {
            return false; 
        }
        return ((int)number % 2) == 0;
    }
    public boolean isPrime() {
                if (number <= 1 || number % 1 != 0) {
            return false;
        }

        int num = (int)number;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public boolean isArmstrong() {
        if (number % 1 != 0 || number < 0) {
            return false;
        }

        int num = (int)number;
        int originalNumber = num;
        int sum = 0;
        int digits = String.valueOf(num).length();

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        return sum == originalNumber;
    }
    public void displayNumberInfo() {
        System.out.println("Number = " + number);
        System.out.println("Zero = " + isZero());
        System.out.println("Positive = " + isPositive());
        System.out.println("Negative = " + isNegative());
        System.out.println("Odd = " + isOdd());
        System.out.println("Even = " + isEven());
        System.out.println("Prime = " + isPrime());
        System.out.println("Armstrong = " + isArmstrong());
        System.out.println("------------------------");
    }
}

public class NumberCheck {
    public static void main(String[] args) {
        Number num1 = new Number(0);    
        Number num2 = new Number(7);    
        Number num3 = new Number(-5);   
        Number num4 = new Number(153);  
        Number num5 = new Number(2.5);  
        
        System.out.println("Testing number 0:");
        num1.displayNumberInfo();
        
        System.out.println("Testing number 7:");
        num2.displayNumberInfo();
        
        System.out.println("Testing number -5:");
        num3.displayNumberInfo();
        
        System.out.println("Testing number 153:");
        num4.displayNumberInfo();
        
        System.out.println("Testing number 2.5:");
        num5.displayNumberInfo();
    }
}
