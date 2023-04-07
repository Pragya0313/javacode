public class BubbleSort {
    static void bubblesort(int arr[],int n) {
        boolean flag;
        for(int i=0;i<n;i++) {
            flag=false;
        
        for(int j=0;j<n-i-1;j++) {

            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                flag=true;
            }
        }
        if(flag==false) {
        break;
    }
} 
}
    public static void main(String args[]){
        int array[]={5,6,89,100,465};
        int n=array.length;
        bubblesort(array, n);
        for(int i=0;i<n;i++)
        {
            System.out.println(array[i]+" ");
        }
    }
}

