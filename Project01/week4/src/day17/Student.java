package day17;
//测试 反射
public class Student {
    //TODO Constructors-右键-generate-constructor-...-ok
    public Student(){}
    public Student(String name) {
        this.name = name;
    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //TODO Fields--要被public修饰才能被反射到
    public String name;
    public int age;
    //TODO Methods
    public void show(){
        System.out.println("show...");
    }
    public void test(int x){
        System.out.println("test..."+x);
    }
//TODO override--toString()--展示对象的属性值而不是地址值
//右键-generate-toString-ok
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
