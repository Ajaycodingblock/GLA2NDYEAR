public class selectionSort {

     public static void selctsort(int [] arr)
     {
        int n = arr.length;
for (int i =0; i<n-1;i++)
{
    int mx = i ;
    for (int j =i ;j<n;j++)
    {
        if(arr[mx]>arr[j])
        {
            mx = j;
        }
    }       int temp = arr[i];
            arr[i]=arr[mx];
            arr[mx]=temp;
}    }
    public static void main(String[] args) {
        int [] arr ={2,4,1,5,6,3};
        selctsort(arr);
        for(int itr : arr)
        {System.out.print(itr + " ");
        }
    }
}