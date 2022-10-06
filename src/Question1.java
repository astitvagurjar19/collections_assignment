import java.util.ArrayList;
import java.util.Iterator;

public class Question1 {
    public static void main(String[] args) {
        //ArrayList of integer to store 5 floating point numbers
        ArrayList<Float> numbers = new ArrayList<Float>();
        numbers.add(12.5f);
        numbers.add(14.5f);
        numbers.add(2.6f);
        numbers.add(23.7f);
        numbers.add(16.4f);
        float sum = 0; // to store the sum of  numbers
        //Create iterator to iterate through the list
        Iterator<Float> iterator = numbers.iterator();
        //loop to find out the sum of numbers present in the list
        while (iterator.hasNext())
            sum = sum + iterator.next();
        System.out.println("Sum is : " + sum);
    }
}