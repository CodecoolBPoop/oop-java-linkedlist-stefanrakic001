import org.testng.annotations.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    public void testIsNameIsNotNull() {
        Person john = new Person("John", 30);
        assertNotNull(john.getName());
    }
    @Test
    public void testIsAgeBelowThrosException() {
        final Person john = new Person();
        assertThrows(IllegalArgumentException.class, new Executable() {
            public void execute() throws Throwable {
                john.setAge(-10);
            }
        });

    }
}