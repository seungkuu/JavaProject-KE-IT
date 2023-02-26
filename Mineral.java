interface Mineralif{
    int getValue();
}
class Gold implements Mineralif {
    @Override
    public int getValue() {
            return 100;
        }
    }


class Silver implements Mineralif {
    @Override
    public int getValue() {
        return 90;
    }
}

class Bronze implements Mineralif{
    @Override
    public int getValue() {
        return 80;
    }
}

class MineralCalculator {
    int value = 0;
    void add(Mineralif mineralif){
        this.value += mineralif.getValue();
    }
    public int getValue() {
        return this.value;
    }
}

public class Mineral {
    public static void main(String[] args) {
        MineralCalculator cal = new MineralCalculator();
        cal.add(new Gold());
        cal.add(new Silver());
        cal.add(new Bronze());
        System.out.println(cal.getValue());  // 270 Ãâ·Â
    }
}
