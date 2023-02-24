public class personal {
    public static void main(String[] args) {
        String idNum = "881120-1068234";
        String birthNum = idNum.substring(0,6);
        String secretNum = idNum.substring(7,14);
        System.out.println("yymmdd : " + birthNum);
        System.out.println("leftNum : " + secretNum);
    }
}
