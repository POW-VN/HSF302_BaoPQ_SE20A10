package hsf301.fe.pojos;



public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private int marks;

    public Student(){}
    public Student(String firstName, String lastName, int marks){
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.marks = marks;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getMarks() {
        return marks;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
