public class Person {
    String name;
    int age;

    Person(String n, int a){
        name = n;
        age = a;
    }

    Person(Person p){ // Copy constructor
        name = p.name;
        age = p.age;
    }

    void display(){
        System.out.println(name + " - " + age);
    }
}
