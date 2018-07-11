package practice10;
import java.util.LinkedList;

public class Teacher extends Person{

    public LinkedList<Klass> classes;
    public void setClasses(LinkedList<Klass> classes) {
        this.classes = classes;
    }
    public LinkedList<Klass> getClasses() {
        return classes;
    }

    public Teacher(int id,String name,int age,LinkedList<Klass> classes){
        super(id,name,age);
        setClasses(classes);
    }
    public Teacher(int id,String name,int age){
        super(id,name,age);
    }

    public boolean isTeaching(Student student){
        if(classes.element().isIn(student))
            return true;
        else return false;
    }

    private String str ="" ;
    public String introduce(){
        if(classes != null && classes.size() != 0) {
            for (Klass klass : classes) {
                str += klass.getNumber() + ", ";
            }
            return super.introduce().concat(" I am a Teacher. I teach Class " + str.substring(0,str.lastIndexOf(",")) + ".");
        }
        else
            return super.introduce().concat(" I am a Teacher. I teach No Class.");
    }
    public String introduceWith(Student student){
        if(isTeaching(student))
            return super.introduce().concat(" I am a Teacher. I teach "+student.getName() + ".");
        else
            return super.introduce().concat(" I am a Teacher. I don't teach "+student.getName() + ".");
    }
}


