package practice09;

public class Klass {
    public Student getLeader() {
        return leader;
    }

//    public void setLeader(String leader) {
//        this.leader = leader;
//    }

    public Student leader;
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int number;
    public String getDisplayName(){
        return "Class "+this.getNumber();
    }

    public void assignLeader(Student student){
        if(student.getKlass().getNumber() == this.getNumber()){
            leader = student;
        }
        System.out.print("It is not one of us.\n");
    }

    public void appendMember(Student student){
         student.setKlass(this);
    }

    public Klass(int number){
        setNumber(number);
    }
}


