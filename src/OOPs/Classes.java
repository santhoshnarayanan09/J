package OOPs;

public class Classes {

    String Webname;
    int Webage;

    Classes(String name, int age)   // Constructors
    {
        this.Webname = name;
        this.Webage = age;
    }

    public static void main(String args[]){
        Classes obj = new Classes("Santhosh",21); // Creation of object to the class and passing argument to constructor
        System.out.println(obj.Webname + " : " + obj.Webage);
    }
}


