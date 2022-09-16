public class Person {
   private String fullName;

    private int age;
    private SexType sex;

    public Person(String fullName, int age, SexType sex) {
        this.fullName = fullName;

        this.age = age;
        this.sex = sex;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + fullName + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
