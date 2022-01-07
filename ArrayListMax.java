import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMax {
    public static void main(String[] args) {
        // create an arrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("The max number is the list is : " + max(numbers));
        System.out.println(numbers.toString());
    }

    public static Integer max(ArrayList<Integer> numbers) {
        // create a scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number (type 0 to quit) : ");
        
        int num;
        do {
            num = input.nextInt();
            if (num != 0)
                numbers.add(num);
        }while(num != 0);
              
        if (numbers.size() == 0)
            return null;
        
        int max = java.util.Collections.max(numbers);
        return max;
    }
}

