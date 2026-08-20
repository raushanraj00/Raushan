package CU_LMS;

import java.util.*;

// Define the interface
interface AdvancedArithmetic {
    int divisor_sum(int n);
}

// Implement the interface
class MyCalculator implements AdvancedArithmetic {
    public int divisor_sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
public class experiment_2_2 {
    public static void main(String[] args) {
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Sum of divisors: " + my_calculator.divisor_sum(n));
        sc.close();
    }

    // Method to print implemented interfaces
    static void ImplementedInterfaceNames(Object o) {
        Class<?>[] theInterfaces = o.getClass().getInterfaces();
        for (Class<?> iface : theInterfaces) {
            System.out.println(iface.getName());
        }
    }
}
