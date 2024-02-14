package MyPackage;

public class Student {
    
    int rollNo;
    String firstName;
    String lastName;
    String middleName;
    String address;
    int age;

    public int getRollNo() {
        return rollNo;
    }

    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
