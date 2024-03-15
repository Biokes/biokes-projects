package appsTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import phoneBook.Phone;

public class PhoneTest{
    private Phone phone=new Phone( );

    @BeforeEach
    void setUp(){
        phone=new Phone( );
    }

    @Test
    void saveNumber_numberIsSaved(){

    }
}
