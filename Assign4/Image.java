class Image {
  
  private String metadata;
  private int maxRange;
  private Pixel[][] data; //Image data. Stores double array of pixels (pixel objects). Array length = image height. Subarray length = image width.
  
  Image(String metadata, int maxRange, Pixel[][] data) { // constructor. 
    if (maxRange < 0) {
      throw new IllegalArgumentException();
    }
    this.metadata = metadata;
    this.maxRange = maxRange;
    this.data = data;  
  }
  String getMetadata() { //getter
    return metadata; // 
  } 
  int getMaxRange() { //getter
    return maxRange;
  }
  int getWidth() { //getter
    return this.data[0].length; 
  }
  int getHeight() { //getter
    return this.data.length; //reutrns Q5
  }
  Pixel getPixel(int i, int j) { //getter. Get's image pixel at certain coordinate. Returns a Pixel object type
    return this.data[i][j];
  }
  
  void flip(boolean horizontal) { //Flip image method
    int width = getWidth();
    int height = getHeight();
    Pixel[][] temp2DArray = new Pixel[height][width];
    if (horizontal == true) { //Flip image horizontally (swap columns). 
      for(int h = 0; h < height; h++) {
        for(int i = 0, j = (width - 1); j >= 0; i++, j--) { //stop when j is less than 0.
          temp2DArray[h][i] = this.data[h][j];
        }
      }
    }
    if (horizontal == false) { //Flip Vertically (swap rows).
      for(int h = 0, j = (height - 1); j >= 0; h++, j--) {
        temp2DArray[h] = this.data[j]; //1st row of vertically flipped image = last row of origional image. 
      }
    }
    this.data = temp2DArray;
  }
  //convert image to grey method (each pixel has 3 identical rgb values.) 
  void toGrey() { //convert image to grey (meaning each pixel has 3 identical rgb values.) 
    Pixel[][] image = this.data;
    for (int i = 0; i < (image.length); i++) {
      for (int h = 0; h < (image[i].length); h++) {
        Pixel p = image[i][h]; //Isolate/store existing pixel.
        int avgInt = p.grey(); //Obtain the pixel's grey value
        this.data[i][h] = new Pixel(avgInt); //Store new pixel in image data. 
        }
      }
    }
  //crop image method
  void crop(int startX, int startY, int endX, int endY) throws IllegalArgumentException { //NOTE start = inclusive, end = exclusive 
    if(((startX|startY|endX|endY) < 0) || (startY > endY) || (endY > this.data.length) || (startX > endX) || ((endX) > this.data[0].length)) {//ensure coordinates do not exceed image height or width.
      throw new IllegalArgumentException("Please ensure crop dimension arguments are valid. They must cannot be less than zero, start dimension must be less than the respective end dimension & ensure they do not exceed the input image dimensions.");         
    }
    int croppedRowNum = endY - startY;
    int croppedColumnNum = endX - startX;
    if((croppedRowNum < 1) || (croppedColumnNum < 1)) {
      throw new IllegalArgumentException("Cropping dimension arguments are invalid. Note: Please retry.");
    }
    Pixel[][] croppedData = new Pixel[croppedRowNum][croppedColumnNum]; //Create new 2D Pixel array, which will ultimately replace previous. 
    for (int i = 0; i < croppedRowNum; i++) { //cropping loop
      for (int h = 0; h < croppedColumnNum; h++) { 
        croppedData[i][h] = this.data[(startY + i)][(startX + h)];
      }
    }
    this.data = croppedData; //replace previous image data. 
  }
}   
    