import java.util.ArrayList;
import java.util.Arrays;
public class listToString {

    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>(Arrays.asList("Life", "is", "too", "short"));
        String lits = String.join(" ", myList);
        System.out.println(lits);
    }

}
