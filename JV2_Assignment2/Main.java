package JV2_Assignment2;

public class Main {
    public static void main(String[] args){
        Student student1=new Student("TH101","A",20);
        Student student2=new Student("TH102","B",20);

        PersonModel<Student> list1=new PersonModel<>();
        list1.addInfo(student1);
        list1.addInfo(student2);
        list1.showInfo();

        Employee employee1=new Employee("TH103","C",20000);
        Employee employee2=new Employee("TH104","D",30000);

        PersonModel<Employee> list2=new PersonModel<>();
        list2.addInfo(employee1);
        list2.addInfo(employee2);
        list2.showInfo();
    }
}
