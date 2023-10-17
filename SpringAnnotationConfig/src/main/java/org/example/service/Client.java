package org.example.service;




import org.example.configurations.AppConfig;
import org.example.configurations.DatabaseConfig;
import org.example.dao.PersonDAO;
import org.example.dao.StudentDao;
import org.example.models.Person;
import org.example.models.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {


    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(DatabaseConfig.class, AppConfig.class);

        PersonDAO personDAO= context.getBean(PersonDAO.class);
        StudentDao studentDao= context.getBean(StudentDao.class);
       personDAO.create(new Person(3l, 26, "hanni","shaik"));
       studentDao.create(new Student(2l,"mannu"));
//        Person person=personDAO.getPersonById(1l);
//        System.out.println("Person Details");
//        System.out.println(person.getId());
//        System.out.println(person.getFirstName()+" "+ person.getLastName());
//        System.out.println(person.getAge());
//
//        Student student=studentDao.getStudentById(1l);
//
//        System.out.println();
//        System.out.println("Student Details");
//        System.out.println(student.getId());
//        System.out.println(student.getName());
    }
}
