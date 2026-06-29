public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Jane Green", 92.5);
        Student student2 = new Student("John Blue", 76.3);

        
        System.out.printf("%s's letter grade: %s%n", student1.getName(), student1.getLetterGrade());
        System.out.printf("%s's letter grade: %s%n", student2.getName(), student2.getLetterGrade());
    }
}
