package action;

import com.opensymphony.xwork2.ActionSupport;
import entity.StudentInformation;
import service.LoginService;
import service.RegisterService;

/**
 * Created by 28223 on 2017/7/31.
 */
public class RegisterAction extends ActionSupport {
    private String regusername;
    private String regpassword;
    private StudentInformation studentInformation;

    public String getRegpassword() {
        return regpassword;
    }

    public void setRegpassword(String regpassword) {
        this.regpassword = regpassword;
    }



    public String getRegusername() {
        return regusername;
    }

    public void setRegusername(String regusername) {
        this.regusername = regusername;
    }

    public StudentInformation getStudentInformation() {
        return studentInformation;
    }

    public void setStudentInformation(StudentInformation studentInformation) {
        this.studentInformation = studentInformation;
    }
    public String Register(){
        RegisterService registerService=new RegisterService();
        studentInformation=registerService.studentInformation(regusername);
       // System.out.print(studentInformation.getStudentName());

            return "success";
    }

    public String addNewUser(){
        RegisterService registerService=new RegisterService();
        StudentInformation studentInformation=new StudentInformation();
        studentInformation.setStudentId(regusername);
        studentInformation.setStudentPassword(regpassword);
        studentInformation.setStudentFlower(0);
       if( registerService.addNewUser(studentInformation))
        return "success";
       return "error";
    }
}
