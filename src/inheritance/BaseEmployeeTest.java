package inheritance;

import org.junit.jupiter.api.Test;

public class BaseEmployeeTest{
    public static void main(String[] args){
        BasePlusCommissionEmployee base = new BasePlusCommissionEmployee("name","lasi","832109",
                210,0.9,5000);
        System.out.println(base.toString( ));
        System.out.println("Earnings : "+ base.earnings( ));
    }
}
