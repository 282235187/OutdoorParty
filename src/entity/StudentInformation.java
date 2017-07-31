package entity;

import javax.persistence.*;

/**
 * Created by 28223 on 2017/7/30.
 */
@Entity
@Table(name = "studenttable", schema = "outdoorparty", catalog = "")
public class StudentInformation {
    private String studentId;
    private String studentPassword;
    private String studentName;
    private String studentClass;
    private String studentQq;
    private Integer studentFlower;
    private String studentSay;
    private String studentFlowerTime;

    @Id
    @Column(name = "StudentId")
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Basic
    @Column(name = "StudentPassword")
    public String getStudentPassword() {
        return studentPassword;
    }

    public void setStudentPassword(String studentPassword) {
        this.studentPassword = studentPassword;
    }

    @Basic
    @Column(name = "StudentName")
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Basic
    @Column(name = "StudentClass")
    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    @Basic
    @Column(name = "StudentQQ")
    public String getStudentQq() {
        return studentQq;
    }

    public void setStudentQq(String studentQq) {
        this.studentQq = studentQq;
    }

    @Basic
    @Column(name = "StudentFlower")
    public Integer getStudentFlower() {
        return studentFlower;
    }

    public void setStudentFlower(Integer studentFlower) {
        this.studentFlower = studentFlower;
    }

    @Basic
    @Column(name = "StudentSay")
    public String getStudentSay() {
        return studentSay;
    }

    public void setStudentSay(String studentSay) {
        this.studentSay = studentSay;
    }

    @Basic
    @Column(name = "StudentFlowerTime")
    public String getStudentFlowerTime() {
        return studentFlowerTime;
    }

    public void setStudentFlowerTime(String studentFlowerTime) {
        this.studentFlowerTime = studentFlowerTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentInformation that = (StudentInformation) o;

        if (studentId != null ? !studentId.equals(that.studentId) : that.studentId != null) return false;
        if (studentPassword != null ? !studentPassword.equals(that.studentPassword) : that.studentPassword != null)
            return false;
        if (studentName != null ? !studentName.equals(that.studentName) : that.studentName != null) return false;
        if (studentClass != null ? !studentClass.equals(that.studentClass) : that.studentClass != null) return false;
        if (studentQq != null ? !studentQq.equals(that.studentQq) : that.studentQq != null) return false;
        if (studentFlower != null ? !studentFlower.equals(that.studentFlower) : that.studentFlower != null)
            return false;
        if (studentSay != null ? !studentSay.equals(that.studentSay) : that.studentSay != null) return false;
        if (studentFlowerTime != null ? !studentFlowerTime.equals(that.studentFlowerTime) : that.studentFlowerTime != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = studentId != null ? studentId.hashCode() : 0;
        result = 31 * result + (studentPassword != null ? studentPassword.hashCode() : 0);
        result = 31 * result + (studentName != null ? studentName.hashCode() : 0);
        result = 31 * result + (studentClass != null ? studentClass.hashCode() : 0);
        result = 31 * result + (studentQq != null ? studentQq.hashCode() : 0);
        result = 31 * result + (studentFlower != null ? studentFlower.hashCode() : 0);
        result = 31 * result + (studentSay != null ? studentSay.hashCode() : 0);
        result = 31 * result + (studentFlowerTime != null ? studentFlowerTime.hashCode() : 0);
        return result;
    }
}
