public class SumOfNumbers {
    public static void main(String args[]) {
        int sum = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
        System.out.println("The sum of two numbers x and y: " + sum);
    }

}

//Execute Windows batchfile commands
// javac SumOfNumbers.java
// java SumOfNumbers %x% %y%