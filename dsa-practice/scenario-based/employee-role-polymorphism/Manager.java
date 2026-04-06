public class Manager extends Employee{     // manager role with cached bonus
    private final double bonus;            // cached bonus field
    public Manager(String name, double salary){ // constructor
        super(name,salary);
        this.bonus = salary * 0.10;
    }
    @Override
    public double getBonus(){   // overridden bonus method
        return bonus;
    }
}
