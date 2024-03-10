package inheritance;

public class BasePlusCommissionEmployee {
    private double baseSalary;
    private final CommissionEmployee employee;
    private void validateBaseSalary(double baseSalary){
        if(baseSalary <= 0.0)
            throw new IllegalArgumentException("Invalid figure for base salary.");
        this.baseSalary = baseSalary;
    }
    public BasePlusCommissionEmployee(String firstName, String lastName, String sSN,
                                      double grossSales, double commissionRate,
                                      double baseSalary){
        employee = new CommissionEmployee (firstName, lastName, sSN, grossSales, commissionRate);
        validateBaseSalary (baseSalary);
    }
    public double getBaseSalary() {

        return baseSalary;
    }
    public double earnings() {

        return baseSalary + (employee.getCommissionRate ( ) * employee.getGrossSales ( ));
    }
    public String toString(){
        return String.format(
                "%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f",
                "base-salaried commission employee", employee.getFirstName(), employee.getLastName(),
                "social security number", employee.getSocialSecurityNumber(),
                "gross sales", employee.getGrossSales(), "commission rate", employee.getCommissionRate(),
                "base salary", baseSalary);
}
}