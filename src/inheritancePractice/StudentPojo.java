package inheritancePractice;

public class StudentPojo {

    private int StudentId;
    private String StudentName, StudentSubject;


    public StudentPojo(int studentId, String studentName, String studentSubject) {
        StudentId = studentId;
        StudentName = studentName;
        StudentSubject = studentSubject;
    }

    @Override
    public String toString() {
        return "StudentPojo{" +
                "StudentId=" + StudentId +
                ", StudentName='" + StudentName + '\'' +
                ", StudentSubject='" + StudentSubject + '\'' +
                '}';
    }
}
