package practice08;

public class Klass {
    int number;
    private Student leader;
    public Klass(int number) {
        this.number = number;
    }
    public void assignLeader(Student student){
        this.leader = student;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public String getDisplayName(){
        return "Class "+number;
    }


    public Student getLeader() {
        return leader;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }
    public int getLeaderId(){
        if(leader!=null)
            return leader.getId();
        return -1;
    }

}
