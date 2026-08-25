class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
      
      // first add all elements of nums1 in set
      HashSet<Integer> set = new HashSet<>();
      for(int num :nums1){
        set.add(num);
      }

      //now check of nums2 elemets present in set or not 
      HashSet<Integer> result = new HashSet<>();
      for(int num :nums2){
        if(set.contains(num)){
            result.add(num);
        }
      }
        // converting result set into array for return
      int ans[] = new int[result.size()];
      int i = 0;
      for(int num:result ){
        ans[i]=num;
        i++;
      }
      
      return ans;
    }
}