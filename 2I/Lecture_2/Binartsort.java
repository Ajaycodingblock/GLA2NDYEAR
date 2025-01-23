public class Binartsort {

public static int binarysrch(int [] arr ,int target )
{
    int lo = 0;
    int hi = arr.length-1;

    while(lo<=hi)
    {
        int mid = (lo+hi)/2;
        
        if(arr[mid]==target)
        {
            return mid;

        }
        else if ( arr[mid]<target )
        {
            lo = mid+1;
        }
        else 
        {
            hi = mid -1 ;
        }
    }
    return hi ;

}


    public static void main(String[] args) {
        int [] arr= {1,4,5,6,7,8};
        int target = 9;

       System.out.println(binarysrch(arr,target)); 
    }
}
