
public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> Resultlist = new ArrayList<>();
        sol(Resultlist, new ArrayList<>(), nums);
        return Resultlist;
    }

    private void sol(List<List<Integer>> Resultlist, List<Integer> tempList, int[] nums) {
        if (tempList.size() == nums.length) {

            Resultlist.add(new ArrayList<>(tempList)); //to add in result 
        } 
        
        else {
            for (int i = 0; i < nums.length; i++) {
            if (tempList.contains(nums[i])) continue; //duplicates remove
                tempList.add(nums[i]); // to add values 
                sol(Resultlist, tempList, nums); //backtrack
                tempList.remove(tempList.size() - 1); //remove last element 
            }
        }
        
    }
}
