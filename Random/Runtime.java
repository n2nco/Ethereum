class Runtime {
  
  public static void main(String args[]) {
    
    
    int[] array = {1,2,3,4,5,6,7,8,9};
    
    long startTime = System.currentTimeMillis();
    
    for (int x : array) {
        
      for (int y:array) {
            System.out.println(x + y);
        }
    }
    
    for (int z: array) {
      System.out.println(z*2);
    }
    
long endTime   = System.currentTimeMillis();
long totalTime = endTime - startTime;
System.out.println("total time   " + totalTime);



System.out.println(fib(7));
//System.out.println(recur(6));
}
    

static int recur(int x) {
  int y = 1;
  
  if (x > 1) {
  y = x * recur(x-1);
  
  }
  return y; 
  //else { return y ;
 // }
}

static int fib(int n) {
  
  if (n > 1) {
    n = n + fib(n-1);
    
  }
  return n;
}
}
  
    
    