package client;

import org.springframework.context.ApplicationContext;

import context.ContextProvider;
import dao.StudentDao;
import entity.Student;

public class Update {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ApplicationContext ctx= ContextProvider.provideContext();
        StudentDao sd=ctx.getBean("stDao",StudentDao.class);
        Student s=sd.getStudent(2);
        s.setName("krish");
        sd.update(s);
    }

}