package practice09;

public class Teacher extends Person {
    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public Klass klass;
    public Teacher(int id,String name,int age,Klass klass){
        super(id,name,age);
        setKlass(klass);
    }
    public Teacher(int id,String name,int age){
        super(id,name,age);
    }
    public String introduce(){
        if(getKlass() != null)
            return super.introduce().concat(" I am a Teacher. I teach Class "+this.getKlass().getNumber() + ".");
        else
            return super.introduce().concat(" I am a Teacher. I teach No Class.");
    }
    public String introduceWith(Student student){
        if(student.getKlass().getNumber() == this.getKlass().getNumber())
            return super.introduce().concat(" I am a Teacher. I teach "+student.getName() + ".");
        else
            return super.introduce().concat(" I am a Teacher. I don't teach "+student.getName() + ".");
    }
}

