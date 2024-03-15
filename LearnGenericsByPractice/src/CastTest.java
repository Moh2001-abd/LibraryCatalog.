import java.util.ArrayList;
import java.util.List;
public class CastTest {
    

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        
        String s = list.get(0)+list.get(1);
        System.out.println(s);
    }
}
