package service;

import dao.RegisterDao;
import entity.StudentInformation;

/**
 * Created by 28223 on 2017/7/31.
 */
public class RegisterService {
    RegisterDao registerDao=new RegisterDao();
    public StudentInformation studentInformation(String username){

        StudentInformation studentInformation=registerDao.findStudentInformation(username);
        return  studentInformation;
    }
    public boolean addNewUser(StudentInformation studentInformation){
        return registerDao.addNewUser(studentInformation);
    }
}
