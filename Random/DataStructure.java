

class DataStructure {
  
  public static void main(String args[]) {
    
    int[] array = generateRandomArray(50);
    double startTime = System.currentTimeMillis();
    binarySearch(array, 254);
    
    double endTime = System.currentTimeMillis();
    System.out.println(endTime - startTime);
  }
    
    public static int binarySearch(int[] array, int actual) {
      
      
    
    int lowIndex = 0;
    int highIndex = array.length - 1;
    int timesthrough = 0;
    int temp =  (int)((array.length - 1) / 2);
    
    while (lowIndex <= highIndex) {
      
    
    
    while (array[temp] != actual) {
      
      timesthrough++;
      
      if (array[temp] > actual) {
        highIndex = temp - 1;
      }
      if (array[temp] < actual) {
        lowIndex = temp + 1;
      }
      
        
      
    }
   
      
    }
     return temp;
    }
    
    static int[] generateRandomArray(int elements) {
      
      int[] array = new int[elements+1];
      
      for (int i = 0; i < elements + 1; i++) {
        array[i] = (int) (Math.random() * 1000 + 10);
      }
      return array;
    }
  }
     
    