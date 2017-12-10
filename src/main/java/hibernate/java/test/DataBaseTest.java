
package hibernate.java.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataBaseTest {
    private DataBase dataBase;
    private User user;

    @BeforeEach
    public void init() {
        dataBase = new DataBase();
        user = new User();
    }

    @Test
    public void returnNameTest() {
        user = dataBase.returnFromDatabase();
        assertEquals("Slava", user.getName());
    }

    @Test
    public void returnIdTest() {
        user = dataBase.returnFromDatabase();
        Integer expected = 1;
        assertEquals(expected, user.getId());
    }
}
