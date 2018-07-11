package practice10;

public class Klass {
//    public void setLeader(String leader) {
//        this.leader = leader;
//    }
    public int number;
    public Student leader;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Student getLeader() {
        return leader;
    }

    public String getDisplayName(){
        return "Class "+this.getNumber();
    }

    public void assignLeader(Student student){
        if(student.getKlass().getNumber() == this.getNumber()){
            leader = student;
        }
        else System.out.print("It is not one of us.\n");
    }

    public void appendMember(Student student){
        student.setKlass(this);
    }

    public boolean isIn(Student student){
        if(student.getKlass() == this)
            return true;
        else return false;
    }

    public Klass(int number){
        setNumber(number);
    }
}



