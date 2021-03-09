public class InnerClassDemo {

    public static void main(String[] args){

        // Outer o=new Outer();
        //  Outer.Inner in=new Outer().new Inner();
        //  in.show();

        // Outer.Inner in=new Outer.Inner();
        // in.show();

        Outer.Inner.show();
        int a=Outer.num;
        System.out.println(a);
    
}
}


 class Outer{
    static int num=3;
    
      static class Inner{
         static void show(){
            System.out.println("Show run");
        }
    }
   
}

    

