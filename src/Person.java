public class Person {
    private String name;
    private int age;
    private String gender;

    public Person(String name,int age,String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void introduce(){
        System.out.println("Hi, i'm" + name + ",a" + age +"year-old" + gender);
    }
    public int haveBirthday(){
        return age++;
    }
    public static void main(String args[]){
        Person personFirst = new Person("Vardan",25,"Male");
        personFirst.introduce();
        personFirst.haveBirthday();
        personFirst.introduce();
    }
}
