public class No1 {

    int arr[];
    No1(int arr[]){
        this.arr = arr;
    }
   


    int min(){
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){  
            if( arr[i] < min){
                min = arr[i];
            }  
        }
        return min;
    }

    int max(){
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if( arr[i] > max){
                max = arr[i];
            }
        }
   
        return max;
    }   

     public void tampil(){   
        System.out.println("nilai minimum : " + min());
        System.out.println("nilai maximum : " + max());
     }
}