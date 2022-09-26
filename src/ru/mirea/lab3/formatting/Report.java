package ru.mirea.lab3.formatting;

public class Report {
    static public void generateReport(Employee[] Emp){
        for (int i=0; i<Emp.length; i++){
            //System.out.println(Emp[i].toString());
            System.out.printf("%-15s","Зарплата "+Emp[i].getFullname()+" =");
            System.out.printf("%20.2f",+Emp[i].getSalary());
            System.out.print("\n");
        }
    }
}
