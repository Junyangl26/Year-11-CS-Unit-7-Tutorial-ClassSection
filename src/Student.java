public class Student {
    int id = 0;
    String firstName;
    String lastName;
    int age =0;
    int yearLevel;
    static int studentCount;

    public Student(String firstName, String lastName, int age, int yearLevel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.yearLevel = yearLevel;
    }
    public int getId(){
        return id;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public int getYearLevel(){
        return yearLevel;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName= lastName;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setYearLevel(int yearLevel){
        this.yearLevel = yearLevel;
    }
    public boolean equals (Object x){
        if(super.equals(x)) {
            return true;
        }
        return false;
    }
    public String toString(){
        return "Student{id=" + id + ", firstName=" + "'"+firstName+"'" + ", lastName="
                + "'"+lastName +"'"+ ", age=" + age + ", yearLevel=" + yearLevel+"}";
    }
    //"Student{id=, firstName='Adrian', lastName='Wong', age=17, yearLevel=12}", idRemoved, "Make sure toString is correct!"

}
