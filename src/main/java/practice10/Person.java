package practice10;

public class Person {
    public String name;
    public int age;
    public int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person(int id,String name,int age){
        setId(id);
        setName(name);
        setAge(age);
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public  String introduce(){
        return "My name is " + this.getName() + ". I am " + this.getAge() + " years old.";
    }

    @Override
    public boolean equals(Object object) {
        Person person = (Person)object;
        if(person != null && person.getId() == this.getId())
            return true;
        else return false;
    }
}






