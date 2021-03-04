public class Single {
    private static Single s=new Single();

    private Single(){}
    public static Single getInstance(){
        return s;
    }  
}

class Single2{
    private static Single2 s=null;
    
    private Single2(){}

    public static Single2 getInstance(){
        if(s==null){
            s=new Single2();
        }
        return s;
    }
}
