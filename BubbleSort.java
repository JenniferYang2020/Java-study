public class BubbleSort {
    public static void main(String[] args){
        int[] arr=new int[]{10,23,3,45,7,30};

        bubbleSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int y=0;y<arr.length-1-i;y++){
                if(arr[y]>arr[y+1]){
                    int temp=arr[y];
                    arr[y]=arr[y+1];
                    arr[y+1]=temp;
                }

            }
        }
    }
    
}
