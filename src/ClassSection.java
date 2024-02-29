import java.util.ArrayList;

public class ClassSection {
    private String subject;
    private int capacity;
    int yearLevel;
    ArrayList<Student> students = new ArrayList<>();

    public ClassSection(String subject,int capacity,int yearLevel) {
        this.subject = subject;
        this.capacity = capacity;
        this.yearLevel = yearLevel;
        this.students = new ArrayList<Student>();
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public int getYearLevel() {
        return yearLevel;
    }
    public void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
    }
    public ArrayList<Student> getStudents() {
        return students;
    }

    public void removeStudent(Student student){
        this.students.remove(student);
    }
    public void addStudent(Student student){
        if (!isStudentEnrolled(student) && student.getYearLevel() == getYearLevel()) {
            this.students.add(student);
        }
    }
    public boolean isStudentEnrolled(Student student){
        for(int i=0;i<students.size();i++){
            if(student.equals(students.get(i))) {
                return true;
            }
        }
        return false;
    }
    public String toString() {
        return "ClassSection{subject=" + "'"+subject +"'"+ ", capacity="
                + capacity + ", yearLevel=" + yearLevel + ", students=" + students+"}";
        //"Student{id=, firstName='Adrian', lastName='Wong', age=17, yearLevel=12}", idRemoved, "Make sure toString is correct!"
    }
    public String toString (ArrayList Students){
        return(getSubject()+getCapacity()+getYearLevel()+getStudents());
    }

}
