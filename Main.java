class Main {
  public static void main(String[] args) {
  int[] nums= {5, 1, -1, 44, 37, 19};
  int i = 0;
  int[] o = new int[nums.length];   
  for (int count = 0; count < nums.length; count++) {
    if(nums[count] % 2 != 0) {
      o[i] = nums[count];
      i++;
    }
  }
int[] odds= new int[i];
for (int j = 0; j < o.length-1; j++){
  odds[j] = o[j];
  System.out.println(odds[j]);
}
  }
}

