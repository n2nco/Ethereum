// This class contains 2 utility methods that may aid you in testing.
// 1)generateRandomImage() will generate a "randomly" populated Image. The idea is to call this to make a small Image object and test your methods first.
// 2)printImage() : This method prints the red, green, and blue components of an Image object
// Note that the methods rely on the Image and Pixel class that you write, so they won't work until 
// until you have written them.
import java.util.Random;
public class ImageGenerator {
  // Note: Change the number 1 below to any other number for different results. e.g. new Random(2);
  private static Random r = new Random(2);


  public static void main(String[] args) {
 // Change the below 2 numbers to generate random images of different sizes
 int height = 8;
 int width = 6;
 // Change the below to specify whether you want to generate a black and white or colour picture
 boolean colourImage = true;
 Image random = generateRandomImage(height,width, colourImage);
 //printImage(random);
 random.flip(true);
 
 try{
 ImageFileUtilities.read("landscape.pnm"); ///TEST TO READ FILE AND CREAT IMAGE OBJECT

//ImageFileUtilities.writePnm(random, "writing1.txt"); //TEST TO GENERATE COLOUR IMAGE FILE
 }
 catch (Exception e) {
   System.out.println( "caught " + e);
  }
   
 //printImage(random);
 // add other methods here for testing:
 // e.g.
random.toGrey();
 
 try{
ImageFileUtilities.writePgm(random, "writing.txt"); //TEST TO GENERATE GREY IMAGE FILE (P2)
}
catch(Exception e) {
  System.out.println("caught" + " " + e);
}

//printImage(random);
 // printImage(random);
 // This way you can ensure your code for question 2 is well tested before moving on.
  }
  
  public static void printImage(Image image) {
    System.out.println("Height: " +  image.getHeight());
    System.out.println("Width: " + image.getWidth());
    System.out.println("Red data:");
    for (int i = 0; i < image.getHeight(); i++) {
      for (int j = 0; j < image.getWidth(); j++) {
       System.out.print(image.getPixel(i,j).getRed() + " " ); //prints red value of pixel at i,j
      }
      System.out.println();
    }
    
    System.out.println("\n\nGreen data");
    for (int i = 0; i < image.getHeight(); i++) {
      for (int j = 0; j < image.getWidth(); j++) {
       System.out.print(image.getPixel(i,j).getGreen() + " " ); 
      }
      System.out.println();
    }
    
    System.out.println("\n\nBlue data");
    for (int i = 0; i < image.getHeight(); i++) {
      for (int j = 0; j < image.getWidth(); j++) {
       System.out.print(image.getPixel(i,j).getBlue() + " " ); 
      }
      System.out.println();
    }    
  }
  
  public static Image generateRandomImage(int height, int width, boolean isColour) {
    Pixel[][] numbers = new Pixel[height][width];
    for (int i = 0; i < height; i++) {
      for (int j = 0; j < width; j++) {
        if (isColour) {
         numbers[i][j] = randomColourPixel(); 
        }
        else {
          numbers[i][j] = randomBwPixel();
        }
      }
    }
    
   return new Image("#Sample test image", 255, numbers); 
  }
  
  public static Pixel randomColourPixel() {
    int red = r.nextInt(256);
    int green = r.nextInt(256);
    int blue = r.nextInt(256);
    return new Pixel(red, green, blue);
  }
  
  public static Pixel randomBwPixel() {
   int intensity = r.nextInt(256);
   return new Pixel(intensity, intensity, intensity);
  }
}