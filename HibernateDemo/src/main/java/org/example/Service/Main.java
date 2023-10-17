package org.example.Service;

import org.example.Entities.Course;
import org.example.Entities.Employee;
import org.example.Entities.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        StandardServiceRegistry std=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata mt=new MetadataSources(std).getMetadataBuilder().build();
        SessionFactory sf=mt.getSessionFactoryBuilder().build();
        Session ss=sf.getCurrentSession();
       Transaction t=ss.beginTransaction();


//       Student student=ss.load(Student.class,1);
//       System.out.println(student);

//        Student s1=new Student("nasiha",22,"SDE");
//        Student s2=new Student("kowsar",34,"SDE-GL");
//        ss.save(s1);
//        ss.save(s2);
//        Student stu=ss.find(Student.class,5);
//        if(stu==null){
//            stu=new Student();
//            stu.setName("nasiha");
//            stu.setRollno(211);
//            stu.setCourse("Software");
//        }
//        else{
//            stu.setName("sajju");
//        }
//        ss.delete(stu);

//        ss.saveOrUpdate(stu);
//        System.out.println(stu);

//        Query query=ss.createQuery("select s from Student s where s.rollno>20");
//        List<Student> students=query.getResultList();
//        System.out.println(students);

//        Student stu=new Student("hari",13);
//        Student stu2=new Student("ram",54);
//        Student stu4=new Student("hanni",32);
//        Student stu3=new Student("mannu",15);
//
//        Course c1=new Course("html");
//        Course c2=new Course("uml");
////        if(c1.getStudents()==null) {
////            List<Student> students=new ArrayList<>();
////            students.add(stu);
////            c1.setStudents(students);
////        }
//        c1.getStudents().add(stu);
//        c1.getStudents().add(stu2);
//        c2.getStudents().add(stu3);
//        c2.getStudents().add(stu4);
//        ss.save(stu);
//        ss.save(stu2);
//        ss.save(stu3);
//        ss.save(stu4);
//        ss.save(c1);
//        ss.save(c2);

//        Employee e1=new Employee("ramu",303333);
//        Employee e2=new Employee("seeta",400000);
//        Employee e3=new Employee("krish",50000);
//        Employee e4=new Employee("lucky",60000);
//        ss.save(e1);
//        ss.save(e2);
//        ss.save(e3);
//        ss.save(e4);

            Employee e=ss.find(Employee.class,1);
            System.out.println(e);
            ss.delete(e);


       t.commit();

       ss.close();
        System.out.println("Successfully Saved");

    }
}