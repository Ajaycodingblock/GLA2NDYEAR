



class Insertion_Sort {

  public static void InsertionSort(int nums[]) {
    int size = nums.length;

    for (int pos = 1; pos < size; pos++) {
      int key = nums[pos];
      int j = pos - 1;

      // Compare key with each element on the left of it until an element smaller than
      // it is found.
      
      while (j >= 0 && key < nums[j]) {
        nums[j + 1] = nums[j];
        --j;
      }

      // Place key at after the element just smaller than it.
      nums[j + 1] = key;
    }
  }

  // Driver code
  public static void main(String args[]) {
    int[] nums = { 1,7,4,3,8,5 };
   InsertionSort(nums);
    System.out.println("Sorted Array in Ascending Order: ");
    
  }
}