package entity;

import javax.persistence.*;

/**
 * Created by 28223 on 2017/7/30.
 */
@Entity
@Table(name = "admintable", schema = "outdoorparty", catalog = "")
public class AdminInformation {
    private String adminId;
    private String adminPassword;

    @Id
    @Column(name = "adminId")
    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    @Basic
    @Column(name = "adminPassword")
    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AdminInformation that = (AdminInformation) o;

        if (adminId != null ? !adminId.equals(that.adminId) : that.adminId != null) return false;
        if (adminPassword != null ? !adminPassword.equals(that.adminPassword) : that.adminPassword != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = adminId != null ? adminId.hashCode() : 0;
        result = 31 * result + (adminPassword != null ? adminPassword.hashCode() : 0);
        return result;
    }
}
