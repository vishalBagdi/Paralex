package sort;

 class bubblesort {
    public static void printarr(int arre[]){
        for(int i=1;i<=arre.length;i++){
            System.out.print(arre[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        
        int arr[]={21,14,33,22,55,1,4,56};
        //bubble sort
        for(int i=1;i<=arr.length-1;i++){
            for(int j=1;j<=arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    
                }
            }
             
        }
        printarr(arr);
        
       

    }
    
}
