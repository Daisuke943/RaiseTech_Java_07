public class Human {
    private String name;
    private String sex;
    private int age;
    private String birthplace;

    public Human(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public String getSex() {
        return this.sex;
    }

    public int getAge() {
        return this.age;
    }

    public void setBirthplace(String place) {
        this.birthplace = place;
    }

    public String getBirthplace() {
        return this.birthplace;
    }

    public void jikoShokai() {
        System.out.println("名前:" + name);
        System.out.println("性別:" + sex);
        System.out.println("年齢:" + age);

        if (birthplace != null){
            System.out.println("出身地:" + birthplace);
        }
    }
}
