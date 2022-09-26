package ru.mirea.lab3.formatting;

public class Main {
    public static void main(String[] args) {
        Employee [] AllEmpArr=new Employee[4];
        AllEmpArr[0]=new Employee("Jack",54.26472);
        AllEmpArr[1]=new Employee("Bob",1050000624.9434);
        AllEmpArr[2]=new Employee("Jane",73600.2932);
        AllEmpArr[3]=new Employee("Karl",89300.93229);
        Report.generateReport(AllEmpArr);
    }
}
