package assignmentsAndTasks.src.assignmentsAndTasks.assignmentsAndTasks;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

import java.time.LocalDate;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Person {
    private String name;
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize (using = LocalDateDeserializer.class)
    private LocalDate dateOfBirth;
    private String phoneNumber;
    private Gender gender;
    public Person(){}
    public Person(String name, LocalDate dateOfBirth,String phoneNumber,Gender gender ){
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
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
