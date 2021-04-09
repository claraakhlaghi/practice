class Main {
  public static void main(String[] args) {
    int[] key = {1,1,1,1,1,1,1,1};
    System.out.print(sumArray(key));
  }
  public static int sumArray(int[] key) { 
    int sum = 0; 
    for (int i = 1; i <= key.length; i++) { 
      sum += key[i-1];
    } 
    return sum; 
  }
}

