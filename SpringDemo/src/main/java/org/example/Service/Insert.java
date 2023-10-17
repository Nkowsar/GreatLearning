package org.example.Service;

import org.example.Entities.Student;
import org.example.context.ContextProvider;
import org.example.dao.StudentDao;
import org.springframework.context.ApplicationContext;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Insert {
    public static void main(String[] args) {
        ApplicationContext ctx= ContextProvider.provideContext();
        StudentDao studentDao=ctx.getBean("stDao", StudentDao.class);
        Student s=new Student(1,"shaik");
        studentDao.insert(s);
    }
}