package practice07;


public class Teacher extends Person{
    Boolean klassStaus;
    public Teacher(String name, int age) {
        super(name, age);
        this.klassStaus=false;
    }
    Klass klass;
    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
        this.klassStaus = true;
    }
    public Klass getKlass() {
        return klass;
    }
    public void setKlass(Klass klass) {
        this.klass = klass;
    }
    public String introduce() {
        if(klassStaus){
            return String.format("%s I am a Teacher. I teach Class %s.",super.introduce(), klass.getNumber());
        }else{
            return (super.introduce()+" I am a Teacher. I teach No Class.");
        }
    }
    public String introduceWith(Student student){
        if( klass.number == student.getKlassName()){
            return (super.introduce()+" I am a Teacher. I teach "+student.name+".");
        }else{
            return (super.introduce()+" I am a Teacher. I don't teach Jerry.");
        }
    }
}
