package Students;

public class Students {
    private static String name;
    private static int course;
    private static int grade;


    public String setName(String name) {
        if (name.length() >= 3) {
            this.name = name;
        }
        return name;
    }

    public static String getName() {
        return name;
    }

    public static int getCourse() {
        return course;
    }

    public int setCourse(int course) {
        if (course >= 1 && course <= 4) {
            this.course = course;
        }
        return course;
    }

    public static int getGrade() {
        return grade;
    }

    public int setGrade(int grade) {
        if (grade >= 1 && grade <= 10) {
            this.grade = grade;
        }
        return  grade;
    }

    public static void showInfo() {
        System.out.println("Name: " + getName() + "\nCourse: " + getCourse() + "\nGrade: " + getGrade());
    }
}