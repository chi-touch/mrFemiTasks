package africa.semicolon.Chapter15.JsonSerialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;


import java.time.LocalDate;

import static africa.semicolon.Chapter15.JsonSerialization.Sex.FEMALE;
import static africa.semicolon.Chapter15.JsonSerialization.Sex.SHIM;
import static org.junit.jupiter.api.Assertions.*;

class JsonSerializierTest {


    @Test
    public void testSerialize() {
        Person person = new Person();
        person.setName("Aramide");
        person.setDateOfBirth(LocalDate.of(2024, 3, 3));
        person.setGender(SHIM);
        person.setPhoneNumber("08103722570");

        String json = JsonSerializier.serialize(person);
        String expected = "{\"name\":\"Aramide\",\"phoneNumber\":\"08103722570\",\"gender\":\"SHIM\",\"dob\":[2024,3,3]}";
        assertEquals(expected, json);
    }


    @Test
    public void testDeserialize() throws JsonProcessingException {
        Person person = new Person("John", LocalDate.now(),"081023456789",FEMALE);
        String json = JsonSerializier.serialize(person);
        System.out.println("json: " + json);
        Person personFromJson = JsonSerializier.deserialize(json);
        System.out.println("person from json: " + personFromJson);


        assertNotNull(personFromJson);
        assertEquals(person.getDateOfBirth(), personFromJson.getDateOfBirth());
        assertEquals(FEMALE, personFromJson.getGender());
        assertEquals("081023456789",personFromJson.getPhoneNumber());

        assertEquals("John", personFromJson.getName());
    }
}