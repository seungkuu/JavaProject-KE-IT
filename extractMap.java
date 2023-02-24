import java.util.HashMap;
public class extractMap {
    public static void main(String[] args) {
        HashMap<String, Integer> grade = new HashMap<>();
        grade.put("A", 90);
        grade.put("B", 80);
        grade.put("C", 70);

        int afterRemove = grade.remove("B");

        System.out.println(grade);
        System.out.println(afterRemove);


    }
}
