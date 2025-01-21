public class selectionsort {

public static void selctsort(int [] arr)
{
    int n = arr.length;
    for(int i=0; i<n-1; i++)
    {  
        int mx=i;
        for(int j=i;j<n;j++)
        {
            if(arr[mx]>arr[j])
            {
         int temp = arr[i];
         arr[i]=arr[mx];
         arr[mx]=temp;
            }


        }
         int temp = arr[i];
         arr[i]=arr[mx];
         arr[mx]=temp;
    }
}


 public static void main(String[] args) {
    int arr [] = {1,3,2,5,6,4};
System.out.println("Before sorting ");
for(int itr: arr)
    {
        System.out.print(itr + " ");
    }
    System.out.println();
     selctsort(arr);
System.out.println("After sorting ");
    for(int itr: arr)
    {
        System.out.print(itr + " ");
    }
 }

}