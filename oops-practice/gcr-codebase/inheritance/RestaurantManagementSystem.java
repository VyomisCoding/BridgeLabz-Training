
// Hybrid Inheritance : Restaurant Management System

class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

interface Worker{   // Interface Worker
    void performDuties();
}

class Chef extends Person implements Worker{   // Chef class extends Person and implements Worker
    Chef(String name, int id){
        super(name, id);
    }
    public void performDuties(){
        System.out.println(name + " is cooking food");
    }
}

class Waiter extends Person implements Worker{  // Waiter class extends Person and implements Worker
    Waiter(String name, int id){
        super(name, id);
    }
    public void performDuties(){
        System.out.println(name + " is serving customers");
    }
}

public class RestaurantManagementSystem{
    public static void main(String[] args){
        Chef chef = new Chef("Ramesh", 1);
        Waiter waiter = new Waiter("Amit", 2);
        chef.performDuties();
        waiter.performDuties();
    }
}
