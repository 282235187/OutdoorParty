package entity;

import javax.persistence.*;

/**
 * Created by 28223 on 2017/7/30.
 */
@Entity
@Table(name = "activityjointable", schema = "outdoorparty", catalog = "")
public class ActivityjoinInformation {
    private int activityJoinId;
    private String acyivityId;
    private String studentId;
    private String activityJoinState;

    @Id
    @Column(name = "activityJoinId")
    public int getActivityJoinId() {
        return activityJoinId;
    }

    public void setActivityJoinId(int activityJoinId) {
        this.activityJoinId = activityJoinId;
    }

    @Basic
    @Column(name = "acyivityId")
    public String getAcyivityId() {
        return acyivityId;
    }

    public void setAcyivityId(String acyivityId) {
        this.acyivityId = acyivityId;
    }

    @Basic
    @Column(name = "studentId")
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Basic
    @Column(name = "activityJoinState")
    public String getActivityJoinState() {
        return activityJoinState;
    }

    public void setActivityJoinState(String activityJoinState) {
        this.activityJoinState = activityJoinState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ActivityjoinInformation that = (ActivityjoinInformation) o;

        if (activityJoinId != that.activityJoinId) return false;
        if (acyivityId != null ? !acyivityId.equals(that.acyivityId) : that.acyivityId != null) return false;
        if (studentId != null ? !studentId.equals(that.studentId) : that.studentId != null) return false;
        if (activityJoinState != null ? !activityJoinState.equals(that.activityJoinState) : that.activityJoinState != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = activityJoinId;
        result = 31 * result + (acyivityId != null ? acyivityId.hashCode() : 0);
        result = 31 * result + (studentId != null ? studentId.hashCode() : 0);
        result = 31 * result + (activityJoinState != null ? activityJoinState.hashCode() : 0);
        return result;
    }
}
