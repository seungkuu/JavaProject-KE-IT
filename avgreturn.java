import java.util.ArrayList;
import java.util.Arrays;

class Calculator4 {
    int avg(ArrayList<Integer> data) {
        int sum = 0;
        for (int num : data) {
            sum += num;
        }
        return (sum / data.size());
    }
}


public class avgreturn {
    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
        Calculator4 cal = new Calculator4();
        int result = cal.avg(data);
        System.out.println(result);
    }
}
