class Next_Greater {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
     
    int ans [] = new int [nums1.length];
    
    for(int i =0 ;i<nums1.length;i++)
     {
        boolean add = false;
        int temp = nums1[i];
        ans[i] = -1;
        
    for(int j =0;j<nums2.length;j++)
        {
            if(temp == nums2[j])
            {
                add = true;
            }
                if(add && temp<nums2[j])
                {
                    ans[i] = nums2[j];
                    break ;
                }     
        }
     }       
      
     return ans;




    }
}