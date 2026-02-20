package com.practice.oops;

class StudentData {
    // Member variables (Private-ah vachukkuradhu dhaan Encapsulation)
    String name;
    int age;
    int rollNo;

    // Static method: No object needed
    static void displayInfo(int age, int roll, String name) {
        System.out.println("Name: " + name + "\nAge: " + age + "\nRoll: " + roll);
    }

    // Method with return type
    public int calculateSum(int x, int y, int z) {
        return x + y + z;
    }

    void bark() {
        System.out.println("Bow Bow");
    }
}

public class  Class{ 
    public static void main(String[] args) {
        // Calling static method
    	StudentData.displayInfo(21, 2222, "AJITH"); // --->  Static  no create object Direct to call class name
        
        // Object instantiation
    	StudentData studentObj = new StudentData();
        int sum = studentObj.calculateSum(25, 25, 5);  //--->  Public add return after initialized new variable will print
        
        System.out.println("Total Sum: " + sum);
        studentObj.bark();								//  ---> just call void no return
    }
}