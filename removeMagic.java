import java.util.HashMap;
public class removeMagic {
    enum CoffeeType {
        Americano,
        Iced_americano,
        CafeLatte
    };
    static void printCoffeePrice(CoffeeType ctype) {
        HashMap<CoffeeType, Integer> priceMap = new HashMap<>();
        priceMap.put(CoffeeType.Americano, 3000);  // 1: 아메리카노
        priceMap.put(CoffeeType.Iced_americano, 4000);  // 2: 아이스 아메리카노
        priceMap.put(CoffeeType.CafeLatte, 5000);  // 3: 카페라떼
        int price = priceMap.get(ctype);
        System.out.println(String.format("가격은 %d원 입니다.", price));
    }

    public static void main(String[] args) {
        printCoffeePrice(CoffeeType.Americano);  // "가격은 3000원 입니다." 출력
        printCoffeePrice(CoffeeType.CafeLatte);  // NullPointerException 발생


    }
}
