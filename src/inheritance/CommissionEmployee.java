package inheritance;

public class CommissionEmployee {
    private final String firstName;
    private final String lastName;
    private final String sSN;
    private double grossSales;
    private double commissionRate;
    private void validateGrossSales(double grossSales){
        if(grossSales < 0.0)
            throw new IllegalArgumentException ("Gross sales must be >= 0.0.");
        this.grossSales = grossSales;
    }
    private void validateCommissionRate(double commissionRate){
        if(commissionRate <= 0.0 || commissionRate >= 1.0)
            throw new IllegalArgumentException ("Invalid commision rate.");
        this.commissionRate = commissionRate;
    }
    public CommissionEmployee(String firstName, String lastName, String sSN, double grossSales, double commissionRate){
        validateGrossSales(grossSales);
        validateCommissionRate(commissionRate);
        this.firstName = firstName;
        this.lastName = lastName;
        this.sSN = sSN;
    }
    public String getFirstName(){return firstName;}
    public String getLastName(){return lastName;}
    public double getGrossSales() {return grossSales;}
    public String getSocialSecurityNumber(){return sSN;}
    public double getCommissionRate() {return commissionRate;}
    public void setCommissionRate(double commissionRate){ validateCommissionRate (commissionRate);}
    public void setGrossSales(double grossSales){ validateGrossSales (grossSales);}
}
