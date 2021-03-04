public class PersonDemo {
    public static void main(String[] args){
        Person.method();
        Person p=new Person("Java",20);
        p.show();
    }
    
}

class Person{   //当两个class在同一个文件时，与文件名不同的class不能public出去
    private String name;
    private int age;
    static String country="CN";
    public Person(String name,int age){
        this.age=age;
        this.name=name;
    }

    public void show(){
        System.out.println(name+' '+age+' ');
    }

    public static void method(){
        System.out.println(country);
    }
}
