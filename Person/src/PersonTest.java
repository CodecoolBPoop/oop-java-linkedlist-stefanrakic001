import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    public void testIsNameIsNotNull() {
        Person person = new Person("John", 30);
        assertNotNull(person.getName());
    }

    @Test
    public void testIsAgeBelow0ThrowsException() {
        Person person = new Person();
        assertThrows(IllegalArgumentException.class,()-> {
            person.setAge(-10);
        });
    }
}