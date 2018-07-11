package practice11;
import java.util.LinkedList;

public class Teacher extends Person implements AssignLeaderListener, JoinClassListener {

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
        for (int i = 0; i < classes.size(); i++) {
            classes.get(i).registerAssignLeaderListener(this);
            classes.get(i).registerJoinListener(this);
        }
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

    @Override
    public void sayAssignLeader(Student student, int number) {
        System.out.print("I am " + getName() + ". I know " + student.getName() + " become Leader of Class " + number + ".\n");
    }

    @Override
    public void saySomeoneJoinClass(Student student, int number) {
        System.out.print("I am " + getName() + ". I know " + student.getName() + " has joined Class " + number + ".\n");
    }
}





