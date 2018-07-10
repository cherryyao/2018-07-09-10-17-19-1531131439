package practice08;

public class Student extends Person{
    private Klass klass;
    public Student(int id,String name, int age,Klass klass) {
        super(id,name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }
    public int getKlassName(){
        return klass.getNumber();
    }

    @Override
    public String introduce() {
        String introduceStr = super.introduce() + " I am a Student.";
        if (isLeaderInKlass())
            introduceStr += " I am Leader of Class " + this.getKlassName() + ".";
        else
            introduceStr += " I am at Class " + this.getKlassName() + ".";
        return introduceStr;
    }
    public boolean isLeaderInKlass() {
        return this.getId() == this.klass.getLeaderId();
    }



}