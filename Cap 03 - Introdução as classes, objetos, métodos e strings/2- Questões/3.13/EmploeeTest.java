public class EmploeeTest {
public static void main(String[] args) {
    Emploee emploee01 = new Emploee("João", "Silva", 3000.0);
    Emploee emploee02 = new Emploee("Maria", "Santos", 1500.0);

    System.out.println("Emploee 1: " + emploee01.getFirstName() + " " + emploee01.getLastName() + ", Salary: " + emploee01.getSalary());
    System.out.println("Emploee 2: " + emploee02.getFirstName() + " " + emploee02.getLastName() + ", Salary: " + emploee02.getSalary());
    System.out.println();
    
    // Aumentar o salário em 10%
    emploee01.setSalary(emploee01.getSalary() * 1.10);
    emploee02.setSalary(emploee02.getSalary() * 1.10);

    System.out.printf("Emploee 1 after raise: %s %s, Salary: %.2f%n", emploee01.getFirstName(), emploee01.getLastName(), emploee01.getSalary());
    System.out.printf("Emploee 2 after raise: %s %s, Salary: %.2f%n", emploee02.getFirstName(), emploee02.getLastName(), emploee02.getSalary());

    }

}
