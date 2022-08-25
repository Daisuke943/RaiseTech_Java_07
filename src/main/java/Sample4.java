import java.util.List;

public class Sample4 {
    public static void main(String[] args) {
        List<String> names = List.of("yamada", "tanaka", "yasuda", "suzuki", "iida");

        // "a"を含む文字列を出力
        names.stream().filter(name -> name.contains("a")).forEach(System.out::println);

        // アルファベット順で並び替えて出力
        names.stream().sorted().forEach(System.out::println);

        // 大文字にして出力
        names.stream().map(String::toUpperCase).forEach(System.out::println);

        // "t"ではじまる文字列を数えて出力
        long count = names.stream().filter(name -> name.startsWith("t")).count();
        System.out.println("\"t\"ではじまる文字列は" + count + "個です。");

        // Listの中に"suzuki"が含まれているか判定
        boolean hasSuzuki = names.stream().anyMatch(name -> name.equals("suzuki"));
        if (hasSuzuki) {
            System.out.println("Listの中にはsuzukiが含まれています。");
        }
    }
}