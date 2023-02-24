import java.util.HashMap;
public class removeMagic {
    enum CoffeeType {
        Americano,
        Iced_americano,
        CafeLatte
    };
    static void printCoffeePrice(CoffeeType ctype) {
        HashMap<CoffeeType, Integer> priceMap = new HashMap<>();
        priceMap.put(CoffeeType.Americano, 3000);  // 1: �Ƹ޸�ī��
        priceMap.put(CoffeeType.Iced_americano, 4000);  // 2: ���̽� �Ƹ޸�ī��
        priceMap.put(CoffeeType.CafeLatte, 5000);  // 3: ī���
        int price = priceMap.get(ctype);
        System.out.println(String.format("������ %d�� �Դϴ�.", price));
    }

    public static void main(String[] args) {
        printCoffeePrice(CoffeeType.Americano);  // "������ 3000�� �Դϴ�." ���
        printCoffeePrice(CoffeeType.CafeLatte);  // NullPointerException �߻�


    }
}
