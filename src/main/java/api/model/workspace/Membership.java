package api.model.workspace;

public class Membership {
    private String userId;
    //private String hourlyRate;
    private CostRate costRate;
    private String targetId;
    private String membershipType;
    private String membershipStatus;
    private HourlyRate hourlyRate;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public HourlyRate getHourlyRate() { return hourlyRate; }

    public void setHourlyRate(HourlyRate hourlyRate) { this.hourlyRate = hourlyRate; }

//    public String getHourlyRate() {
//        return hourlyRate;
//    }

//    public void setHourlyRate(String hourlyRate) {
//        this.hourlyRate = hourlyRate;
//    }

//    public String getCostRate() {
//        return costRate;
//    }
//
//    public void setCostRate(String costRate) {
//        this.costRate = costRate;
//    }

    public String getTargetId() {
        return targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    public String getMembershipStatus() {
        return membershipStatus;
    }

    public void setMembershipStatus(String membershipStatus) {
        this.membershipStatus = membershipStatus;
    }

    public CostRate getCostRate() { return costRate; }

    public void setCostRate(CostRate costRate) { this.costRate = costRate; }
}
