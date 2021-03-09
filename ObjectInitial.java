public class ObjectInitial {
    public static void main(String[] args){
        Zi  z=new Zi();
    }
    
    
}

class Fu{
    Fu(){
        System.out.print("Fu cunstructor run");
        show();
    }

    void show(){
        System.out.println("hahha");
    }
}

class Zi extends Fu{
    int num=3;
    Zi(){
        System.out.print("Zi constructor run "+num);
        
    }
    void show(){
        System.out.println("num show "+num);
    }
}
