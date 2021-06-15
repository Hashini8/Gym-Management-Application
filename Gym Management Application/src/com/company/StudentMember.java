package com.company;

public class StudentMember extends DefaultMember {

    private String schoolName;
    private String studentIndex;
    private String contactNumber;

    public StudentMember(String membershipNo, String membername, String memberNicNo, String memberBirthday, String membershipPrice, String membershipStartDate) {
        super(membershipNo, membername, memberNicNo, memberBirthday, membershipPrice, membershipStartDate);
    }
    public StudentMember(){
        super();
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getStudentIndex() {
        return studentIndex;
    }

    public void setStudentIndex(String studentIndex) {
        this.studentIndex = studentIndex;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
}
