public class avgForeach {
    public static void main(String[] args) {

        int[] marks = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};

        int total = 0;

        for(int mark : marks){
            total += mark;
        }
        int avgScore = total / marks.length;

        System.out.println(avgScore);




    }
}
