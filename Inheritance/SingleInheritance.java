class Employee{
    void salary(){
        System.out.println("Salary = 20000");
        
    }

}

class Programmer extends Employee{
    void Bonus(){
        System.out.println("Bonus = 5000");
    }
}

class SingleInheritance{
    public static void main(String[] args) {
        
    
    Programmer p = new Programmer();
    p.salary();
    p.Bonus();
    
}

}
