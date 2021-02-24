public class ArrayTest2 {

    public static void main(String[] args){
        toHex(60);
    }

 //   0,1,2,3,4,5,6,7,8,9, A, B, C, D, E, F
 //   0,1,2,3,4,5,6,7,8,9, 10,11,12,13,14,15


    public static void toHex(int num){
        char[] arr={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        char[] res=new char[8];
        int index=0;
        while(num!=0){
            int temp=num&15;

            //定义一个对应关系表
            
            
            res[index++]=arr[temp];
            
            num=num>>>4;
        }
        for(int i=res.length-1;i>=0;i--){
            System.out.print(res[i]);
        }
        // int n1=num&15;
        // System.out.println(n1);

        // num=num>>>4;
        // int n2=num&15;
        // System.out.println(n2);
    }
    
}
