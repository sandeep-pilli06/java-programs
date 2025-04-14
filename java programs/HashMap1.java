import java.util.HashMap;

public class HashMap1{
    public static void main(String[] args) {
  
        HashMap<Integer, String> people = new HashMap<>();

        people.put(19, "Khagesh");
        people.put(15, "Sandeep");
        people.put(10, "Sundhar");
       
        System.out.println("Printing numbers (keys):");
        for (Integer number : people.keySet()) {
            System.out.println(number);
        }

        System.out.println("\nPrinting number-name pairs:");
        for (Integer number : people.keySet()) {
            System.out.println(number + " -> " + people.get(number));
        }
    }
}
