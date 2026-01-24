
import java.time.LocalDate;

public class Policy{                     // Policy class: holds details of each insurance policy
    private String policyNumber;
    private String policyHolderName;
    private LocalDate expiryDate;
    private String coverageType;
    private double premiumAmount;

    public Policy(String policyNumber, String policyHolderName, LocalDate expiryDate, String coverageType, double premiumAmount){
        this.policyNumber = policyNumber;
        this.policyHolderName = policyHolderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }
    
    public String getPolicyNumber() { return policyNumber; }               // getter methods
    public String getPolicyHolderName() { return policyHolderName; }
    public LocalDate getExpiryDate() { return expiryDate; }

    @Override
    public String toString() { return "[PolicyNo=" + policyNumber + ", Holder=" + policyHolderName + ", Expiry=" + expiryDate + ", Coverage=" + coverageType + ", Premium=" + premiumAmount + "]";}
}
