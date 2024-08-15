public class Student {
    private int Id;
    private String name;
    private int age;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(int id, String name, int age) {
        Id = id;
        this.name = name;
        this.age = age;
    }

    public void display(){
        System.out.println("ID: " + Id + "\n" + "Name: " + name + "\n" + "Age: " +age + "\n");
    }
}
