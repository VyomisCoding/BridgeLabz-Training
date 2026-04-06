public class Developer extends Employee{     // developer role with conditional bonus
    private final double bonus;            // cached bonus field
    public Developer(String name, double salary){ // constructor
        super(name,salary);
        this.bonus = salary >= 50000 ? salary * 0.05 : 0.0;
    }

    @Override
    public double getBonus(){
        return bonus;
    }
}
