package service;

import dao.LoginDao;
import entity.StudentInformation;

/**
 * Created by 28223 on 2017/7/30.
 */
public class LoginService {
    public StudentInformation findStudentInformation(String  username){
        LoginDao loginDao=new LoginDao();
        StudentInformation studentInformation=loginDao.findStudentInformation(username);
        return  studentInformation;
    }

}
