java.util.*
//2. Design and implement a TwoSum class. It should support the following operations: add and find.
    // add - Add the number to an internal data structure.
    // find - Find if there exists any pair of numbers //which sum is equal to the value.
class TwoSum{
  Map<Integer, Integer> nums = new HashMap<Integer, 
  Integer>();


  public TwoSum(Map<Integer, Integer> nums){
    nums = nums;
  }

  public void add(int num){
    // if(nums.containsKey(num)){
    //   nums.
    // }
    // nums.put(num, 1);
    nums.compute(num, (key,value)->{
      if(value ==null){
        return 1;
      } else{
        return value+1;
      }
    });
  }

  public boolean find(int sum){
    for(int key:nums.keySet()){
      int numComplements = nums.get(sum - key);
      if(numComplements==null){
        continue;
      }
      if(numComplements > 1){
        return true;
      }
      if(key != sum - key){
        return true;
      }
    }
    return false;
  }


}