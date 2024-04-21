public class Main {
    private static final Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Борисов Алексей Владимирович", 2, 27550);
        employees[1] = new Employee("Гормаков Александр Михайлович", 1, 33080);
        employees[2] = new Employee("Аношин Дмитрий Васильевич", 5, 40500);
        employees[3] = new Employee("Михалков Глеб МИхайлович", 4, 37455);
        employees[4] = new Employee("Харитонов Сергей Сергеевич", 3, 29800);
        employees[5] = new Employee("Орлов Денис Александрович", 2, 35350);
        employees[6] = new Employee("Гришин Василий Николаевич", 1, 43500);
        employees[7] = new Employee("Жукова Ольга Михайловна", 5, 41250);
        employees[8] = new Employee("Маркина Кристина Олеговна", 4, 38880);
        employees[9] = new Employee("Сергеева Оксана Викторовна", 3, 32900);

        printAll();
        System.out.println(sumSalary() + " рублей");
        System.out.println(minSalaryEmploeers());
        System.out.println(maxSalaryEmploeers());
        System.out.println(averageSalary());
        printFullNames();


    }

    private static void printAll() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private static int sumSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    private static Employee minSalaryEmploeers() {
        Employee minSalary = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary.getSalary()) {
                minSalary = employee;

            }

        }
        return minSalary;
    }

    private static Employee maxSalaryEmploeers() {
        Employee maxSalary = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary.getSalary()) {
                maxSalary = employee;
            }
        }
        return maxSalary;

    }

    private static float averageSalary() {
        return sumSalary() / employees.length;

    }
    private static void printFullNames(){
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());

        }
    }
}
