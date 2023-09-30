public class MergeSort {
    static void merge(int []arr,int l,int m,int r)
    {
        int n1=(m-l+1);
        int n2=(r-m);
        int left[]=new int[n1];
        int right[]=new int[n2];
        for(int i=0;i<n1;i++)
            left[i]=arr[i+l];
        int k=l;
        for(int i=0;i<n2;i++)
            right[i]=arr[i+m+1];
        int i=0,j=0;
        while(i<n1 && j<n2)
        {
            if(left[i]<right[j]){
                arr[k++]=left[i++];
            }
            else {
                arr[k++]=right[j++];
            }
        }
        while(i<n1){
            arr[k++]=left[i++];
        }
        while(j<n2) {
            arr[k++] = right[j++];
        }
    }
    static void mergeSort(int a[],int l,int r){
        if(l<r){
            int m=l+(r-l)/2;
            mergeSort(a,l,m);
            mergeSort(a,m+1,r);
            merge(a,l,m,r);
        }
    }
    public static void main(String []args){
        int a[]={2,3,5,7,2,33,6,3,1,6,28};

        System.out.println("Unsorted Array: ");
        for(int i=0;i<10;i++){
            System.out.print(a[i]+" ");
        }
        mergeSort(a,0,9);
        System.out.println("\nSorted Array: ");
        for(int i=0;i<10;i++){
            System.out.print(a[i]+" ");
        }
    }
}