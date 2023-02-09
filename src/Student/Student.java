package Student;

public class Student {
    int studentID;
    String name;
    String surname;
    int course;
    int mAverGrade;
    int eAverGrade;
    int forLangAverGrade;

    Student(String name1, int mAverGrade1, int eAverGrade1, int forLangAverGrade1) {
        name = name1;
        mAverGrade = mAverGrade1;
        eAverGrade = eAverGrade1;
        forLangAverGrade = forLangAverGrade1;
    }
}
