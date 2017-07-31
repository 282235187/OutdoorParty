package dao;

import entity.StudentInformation;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import tool.Main;

import java.util.List;

/**
 * Created by 28223 on 2017/7/31.
 */
public class RegisterDao {
    public StudentInformation findStudentInformation(String uersename){
        String hql="from StudentInformation where studentId=?1";
        Session session= Main.getSession();
        Query query=session.createQuery(hql);
        query.setParameter(1,uersename);
        List<StudentInformation> list=query.list();
        StudentInformation studentInformation=null;
        for(StudentInformation studentInformation1:list){
            studentInformation=studentInformation1;
        }
        return  studentInformation;
    }
    public boolean addNewUser(StudentInformation studentInformation){
        Session session= Main.getSession();
        Transaction transaction=session.beginTransaction();
        if(session.save(studentInformation).toString()!=null){
            transaction.commit();
            session.close();
            return true;
        }
        return false;
    }
}
