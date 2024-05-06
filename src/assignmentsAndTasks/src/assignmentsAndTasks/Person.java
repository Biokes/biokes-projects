package assignmentsAndTasks.src.assignmentsAndTasks;

public class Person {
    private String name;
    private String dateOfBirth;
    private String phoneNumber;
    private Gender gender;
    public Person(){}
    public Person(String name, String dateOfBirth,String phoneNumber,Gender gender ){
        this.name= name;
        this.gender = gender;
        this.dateOfBirth= dateOfBirth;
        this.phoneNumber = phoneNumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public Gender getGender() {
        return gender;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
