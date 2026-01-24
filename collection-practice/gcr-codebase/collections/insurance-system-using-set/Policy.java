
// Policy object model

import java.time.LocalDate;

public class Policy implements Comparable<Policy>{
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

    public String getPolicyNumber() { return policyNumber; }                // getters
    public String getPolicyHolderName() { return policyHolderName; }
    public LocalDate getExpiryDate() { return expiryDate; }
    public String getCoverageType() { return coverageType; }

    @Override
    public int hashCode(){                      // For HashSet uniqueness (Policy Number considered unique)
        return policyNumber.hashCode();
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;

        if(obj instanceof Policy){
            Policy p = (Policy) obj;
            return this.policyNumber.equals(p.policyNumber);
        }
        return false;
    }

    @Override
    public int compareTo(Policy p){                        // For TreeSet sorting by expiry date
        return this.expiryDate.compareTo(p.expiryDate);
    }

    @Override
    public String toString(){
        return "[PolicyNo = " + policyNumber + ", Holder = " + policyHolderName + ", Expiry = " + expiryDate + ", Coverage = " + coverageType +", Premium = " + premiumAmount + "]";
    }
}
