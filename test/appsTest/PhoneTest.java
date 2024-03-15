package appsTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import phoneBook.Phone;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneTest{
    private Phone phone=new Phone( );

    @BeforeEach
    void setUp(){
        phone=new Phone( );
    }

    @Test
    void saveNumber_numberIsSaved(){
        phone.saveContact("Name", "1234567890");
        assertEquals(1, phone.numberOfContacts( ));
    }
}
