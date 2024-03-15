import java.util.Arrays;
public class GenericMethod {

   public  static <T> void printLastElement(T[] elements) {
       System.out.println(elements[elements.length - 1]);
   }

   public static <T> T[] reverseArray(T[] elements) {
       T[] reversedArray = (T[]) new Object[elements.length];
       for (int i = elements.length - 1; i >= 0; i--) {
           reversedArray[i] = elements[i];
       }

         System.out.println(Arrays.toString(reversedArray));
       return reversedArray;
       
   }

   public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
        String[] stringArray = {"one", "two", "three", "four", "five"};

        // printLastElement(intArray);
        // printLastElement(doubleArray);
        // printLastElement(charArray);
        // printLastElement(stringArray);

        reverseArray(intArray);
        reverseArray(doubleArray);
        reverseArray(charArray);
        reverseArray(stringArray);


   }
}
