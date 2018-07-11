package practice09;

public class Student extends Person {
    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public Klass klass;
    public String introduce(){
        if(this.equals(this.getKlass().getLeader()) )
            return super.introduce().concat(" I am a Student. I am Leader of Class " + this.klass.getNumber() +".");
        else
            return super.introduce().concat(" I am a Student. I am at Class " + this.klass.getNumber() +".");
    }

    public Student(int id,String name,int age,Klass klass){
        super(id,name,age);
        setKlass(klass);
    }
}


