public class InnerClassDemo2 {
    public static void main(String[] args){
        Outer2.Inner in=new Outer2().new Inner();
        in.show();

    }
    
}
class Outer2{
    int num=3;
    class Inner{
        int num=5;
        void show(){
            System.out.println(Outer2.this.num);
            System.out.println(Inner.this.num);
            System.out.println(num);

        }
       
    }
}
