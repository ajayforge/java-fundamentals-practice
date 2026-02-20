package com.practice.oops;

// PascalCase: Demo, not demo
class ArrayUtility {
    public void printArray(int[] a) {
        for (int x : a) {
            System.out.print(x + " "); // Orey line-la space-oda print panna nalla irukkum
        }
        System.out.println(); // Next line-kku poga
    }
}

public class MethodPassing {
    public static void main(String[] args) {
        ArrayUtility util = new ArrayUtility();
        int[] numbers = {10, 20, 40, 45}; 
        
        System.out.println("Printing Array Elements:");
        util.printArray(numbers);
    }
}