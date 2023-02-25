class Calculator3{
    boolean oddOrNot(int num){
        return num % 2 == 1;
    }
}
public class evenOdd{
    public static void main(String[] args) {
        Calculator3 cal = new Calculator3();
        System.out.println(cal.oddOrNot(3));
        System.out.println(cal.oddOrNot(4));
    }
}
