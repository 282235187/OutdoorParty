package action;

import com.opensymphony.xwork2.ActionSupport;
import entity.StudentInformation;
import service.LoginService;


/**
 * Created by 28223 on 2017/7/30.
 */
public class LoginAction extends ActionSupport{
    private String  username;
    private  String password;
    private StudentInformation studentInformation;

    public StudentInformation getStudentInformation() {
        return studentInformation;
    }

    public void setStudentInformation(StudentInformation studentInformation) {
        this.studentInformation = studentInformation;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public  String Login(){
        LoginService loginService=new LoginService();
        studentInformation=loginService.findStudentInformation(username);
        if(studentInformation!=null){
            if(studentInformation.getStudentPassword().equals(password))
                return  "success";
        }
        return "error";
    }
}
