import java.lang.Math; //precautionary. Understood that the Math class is already mported by default. 

class Pixel {
  
  private int red;
  private int green;
  private int blue;
  
  Pixel(int red, int green, int blue) { //Constructor #1
    if ((red < 0 || red > 255) || (green < 0 || green > 255) || (blue < 0 || blue > 255)) {
      throw new IllegalArgumentException();
    }
    this.red = red;
    this.green = green;
    this.blue = blue;
  }
  
  Pixel(int intensity) { //Constructor #2 - Greyscale 
    if (intensity < 0 || intensity > 255) {
      throw new IllegalArgumentException();
    }
    this.red = intensity;
    this.green = intensity;
    this.blue = intensity;
  }
  
  int getRed() { //should this be a private getter? sidenote: getters do not need object as parameter.
    return this.red;
  }
  int getGreen() { //should this be a private getter?
    return this.green;
  }
  int getBlue() { //should this be a private getter?
    return this.blue;
  }
  
  int grey() {  // instructions say truncate the decimal point. can do 
    double avg = (((double)this.red + (double)this.green + (double)this.blue) / 3); //average as an accurate double
    int avgInt = ((int) Math.round(avg)); //round double to nearest integer (instead of less accurate truncation). // int avgInt = (int)avg; if truncating. 
    return avgInt;
  }
  
}

  