package practice11;
import java.util.ArrayList;

public class Klass{
    //    public void setLeader(String leader) {
//        this.leader = leader;
//    }
    private int number;
    private Student leader;
    private ArrayList memberList = new ArrayList<Student>();
    private ArrayList<AssignLeaderListener> assignLeaderListenerList = new ArrayList<>();
    private ArrayList<JoinClassListener> joinClassListenerList = new ArrayList<>();

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Student getLeader() {
        return leader;
    }

    public void appendMember(Student student) {
        student.setKlass(this);
        memberList.add(student);
        notifyTeacherSomeoneJoinClass(student);
    }

    public String getDisplayName(){
        return "Class "+this.getNumber();
    }

    public void assignLeader(Student student){
        if(student.getKlass().getNumber() == this.getNumber()){
            leader = student;
            notifyTeacherSomeoneAssignLeader(student);
        }
        else System.out.print("It is not one of us.\n");
    }

    public void registerJoinListener(JoinClassListener joinClassListener){
        joinClassListenerList.add(joinClassListener);
    }

    public void registerAssignLeaderListener(AssignLeaderListener assignLeaderListener){
        assignLeaderListenerList.add(assignLeaderListener);
    }

    public void notifyTeacherSomeoneAssignLeader(Student student) {
        for(int i = 0;i<assignLeaderListenerList.size();i++){
            assignLeaderListenerList.get(i).sayAssignLeader(student,this.number);
        }
    }

    public void notifyTeacherSomeoneJoinClass(Student student) {
        for(int i = 0;i<joinClassListenerList.size();i++){
            joinClassListenerList.get(i).saySomeoneJoinClass(student,this.number);
        }
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




