package Student;

import Student.Student;

public class StudentTest {
    public static int arithmeticMeanScore(int mAverGrade1, int eAverGrade1, int forLangAverGrade1) {
        int a = mAverGrade1;
        int b = eAverGrade1;
        int c = forLangAverGrade1;
        int arithmetic = (a + b + c) / 3;
        return arithmetic;
    }

    public static void main(String[] args) {
        Student stud1 = new Student("Alan", 4, 3, 5);
        Student stud2 = new Student("Daniel", 5, 4, 2);
        Student stud3 = new Student("Regina", 3, 5, 5);

        System.out.println("Average grade for " + stud1.name + ": " + arithmeticMeanScore(stud1.mAverGrade, stud1.eAverGrade, stud1.forLangAverGrade));
        System.out.println("Average grade for " + stud2.name + ": " + arithmeticMeanScore(stud2.mAverGrade, stud2.eAverGrade, stud2.forLangAverGrade));
        System.out.println("Average grade for " + stud3.name + ": " + arithmeticMeanScore(stud3.mAverGrade, stud3.eAverGrade, stud3.forLangAverGrade));
    }
}
