class Generic1<T>{
T name;

//This function takes 
void getName(T name){
    this.name = name;
    //Here this keyword refers to the data member of the class and name refers to 
    // the argument send from the function call.
}
void printName(){
    System.out.println(name);
}
}

public class Generic{
    public static void main(String[] args) {
        Generic1 <String> g1 = new Generic1();
        Generic1 <Integer> g2 = new Generic1();
        g1.getName("Ujjwal");
        g1.printName();
        g2.getName(999);
        g2.printName();


    }
}

//Summary:
/*So the main objective of generic class is to show it can operate with different types
 of data types. 
 */