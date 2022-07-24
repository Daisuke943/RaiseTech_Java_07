import java.util.ArrayList;
import java.util.List;

public class Sample2 {
    public static void main(String[] args) {
        Human human1 = new Human("田中", "男", 20);
        human1.setBirthplace("東京");
        Human human2 = new Human("佐藤", "女", 30);
        human2.setBirthplace("埼玉");
        Human human3 = new Human("中村", "男", 40);
        human3.setBirthplace("大阪");



        // if文を使って分岐
        if (human1.getAge() <= 20) {
            System.out.println(human1.getName() + "さんは20歳以下です。");
            System.out.println("--------------");
        }

        List<Human> humanList = new ArrayList<>();
        humanList.add(human1);
        humanList.add(human2);
        humanList.add(human3);

        // 拡張for文を使って繰り返し
        for (Human human : humanList) {
            human.jikoShokai();
            System.out.println("--------------");
        }

        // StreamAPIを使って繰り返し
        // 性別が男のみを出力
        humanList.stream().filter(i -> i.getSex().equals("男")).forEach(i -> i.jikoShokai());
    }
}
