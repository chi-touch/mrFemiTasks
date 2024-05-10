package africa.semicolon.Chapter15.JsonSerialization;




//@JsonInclude(JsonInclude.Include.NON_NULL): it ensures that it won't return a null value'

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

import java.time.LocalDate;

@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class Person {


    @JsonInclude(value = JsonInclude.Include.NON_EMPTY)
    private String name;


    @JsonProperty("dob")
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate dateOfBirth;

    @JsonInclude(value = JsonInclude.Include.NON_EMPTY)
    private String phoneNumber;

    @JsonInclude(value = JsonInclude.Include.NON_EMPTY)
    private Sex gender;

   // @JsonProperty (dob): can be used to tell json the name it want a certain object to be named



    public Person(){}

    public Person(String name, LocalDate dateOfBirth, String phoneNumber, Sex gender) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }




    @Override
    public String toString(){
        return "person -->{name: " + name+" dateOfBirth: " + dateOfBirth+" phoneNumber: "+ phoneNumber+ "+ gender: "+ gender+"}";
    }
}
