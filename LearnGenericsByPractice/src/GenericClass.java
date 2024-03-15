import java.lang.reflect.Array;
import java.util.Arrays;

public class GenericClass <T> {

    private T[] elements;

    public GenericClass(T[] elements) {
        this.elements = elements;
    }

    public void printLastElement() {
        System.out.println(elements[elements.length - 1]);
    }

    public T[] reverseArray() {
        T[] reversedArray = (T[]) new Object[elements.length];
        for (int i = elements.length - 1; i >= 0; i--) {
            reversedArray[i] = elements[i];
        }
      
        return reversedArray;
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
        String[] stringArray = {"one", "two", "three", "four", "five"};

        GenericClass<Integer> intGeneric = new GenericClass<>(intArray);
        GenericClass<Double> doubleGeneric = new GenericClass<>(doubleArray);
        GenericClass<Character> charGeneric = new GenericClass<>(charArray);
        GenericClass<String> stringGeneric = new GenericClass<>(stringArray);

        intGeneric.printLastElement();
        doubleGeneric.printLastElement();
        charGeneric.printLastElement();
        stringGeneric.printLastElement();

        System.out.println(Arrays.toString(intGeneric.reverseArray()));
        System.out.println(Arrays.toString(doubleGeneric.reverseArray()));
        System.out.println(Arrays.toString(charGeneric.reverseArray()));
        System.out.println(Arrays.toString(stringGeneric.reverseArray()));


    }
}
