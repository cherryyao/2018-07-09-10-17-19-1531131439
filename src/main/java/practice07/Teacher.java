package practice07;


public class Teacher extends Person{

    public Teacher(String name, int age) {
        super(name, age);
    }
    Klass klass;

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }


    public String introduce() {
        if(klass.number != 0){
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
