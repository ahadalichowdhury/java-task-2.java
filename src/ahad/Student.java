package ahad;

public class Student {
    String name;
    int id;
    static String universityName;

    Student(){
        System.out.println("Default constractor");
    }

    Student (String name){
        this.name = name;
        System.out.println("Name :"+this.name);

    }

    Student (int id){
        this.id = id;
        System.out.println("Id :"+this.id);
    }

    void display(){
        System.out.println("University name:"+universityName);
    }
}

/*Name:S. M. Ahad Ali Chowdhury
Id:2012020156
section:D
Date:6-8-21
*/

