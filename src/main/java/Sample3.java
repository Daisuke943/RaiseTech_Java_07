import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sample3 {
    public static void main(String[] args) {
        // Listを使って出力
        ArrayList<String> names = new ArrayList<>();
        names.add("斎藤");
        names.add("中村");
        names.add("田中");

        names.forEach(i -> System.out.println(i));

        // Mapを使って出力
        Map<String, String> animal = new HashMap<>();
        animal.put("犬", "ワン!");
        animal.put("猫", "にゃー");
        animal.put("にわとり", "コケッコー");

        animal.keySet().forEach(i -> System.out.println(animal.get(i)));

        try {
            System.out.println(names.get(3));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("配列の範囲を超えています。");
            throw e;
        }
    }
}
