class Solution {

  public int removeElement(int[] nums, int val) {
    int i = nums.length - 1;

    for (int j = i; j >= 0; j--) {
      if (nums[j] == val) {
        nums[j] = nums[i];
        nums[i--] = '_';
      }
    }
    return ++i;
  }
}
