import java.io.File;
import java.io.*;
import java.util.Scanner;

class ImageFileUtilities {  //read contents of file and create Image
   
  static Image read(String filename) throws IOException { // block that calls this method must handle the IOException
  
    boolean isPNM;
    StringBuilder metadata = new StringBuilder(); //convert to string at end. 
    int width;
    int height;
    int maxRange;
    Pixel[][] imageData; // stores double array of pixels.
  
    try {
      Scanner scanner = new Scanner(new File(filename));
      String firstElement = scanner.next(); // next instead of lextlie tf dont capture spaces.
      
      if (firstElement.equals("P3")) { //True if image is PNM (normal colour). False = PGM = grey.
        isPNM = true;
      }
      else if (firstElement.equals("P2")) {
        isPNM = false;
      }
      else {
       throw new IOException("File format invalid. Please ensure the file begins with P2 or P3 & no spaces");
      }
      
      while(scanner.hasNext("#")){ 
        String line = scanner.nextLine(); //...based on assignment paragraph.. 'first we have format code...' seems likely to be in order
        metadata.append(line); // append line of metadata & newline to the StringBuilder variable 'metadata'.
        metadata.append("\n"); 
        continue;
      }
     
      width = scanner.nextInt();
      height = scanner.nextInt();
      maxRange = scanner.nextInt();
      
      imageData = new Pixel[height][width];
      
      if (isPNM == true) { //Collect image data if format is PNM
        for(int i = 0; i < height; i++) {
          for(int j = 0; j < width; j++) { //width = subarray length.
            int r = scanner.nextInt();
            int g = scanner.nextInt();
            int b = scanner.nextInt();
            imageData[i][j] = new Pixel(r,g,b);
          }
        }
      }
      if (isPNM == false) { //Collect image data if format is PGM
        for(int i = 0; i < height; i++) {
          for(int j = 0; j < width; j++) {  
            int r = scanner.nextInt(); 
            imageData[i][j] = new Pixel(r); 
            
        }
      }
    } 
  }
    catch(FileNotFoundException e) { //Question: where should i put try/catch & with what exceptions?
      System.out.println(e); //test
      throw new FileNotFoundException("Invalid input file. " + e);
      
    }
    catch(IOException e) {
      System.out.println(e); //test
      throw new IOException ("I/O operation exception caught when reading file. " + e) ;
    }
    
    String metadataString = metadata.toString();   //convert stringbuilder to string          
    Image newImage1 = new Image(metadataString, maxRange, imageData); //Key method. Instantiates Image object with read() obtained arguments. 
    return newImage1;
  }
  
  static void writePnm (Image image, String filename) throws IOException { //Q2 //bufferedwriter auto throws an exception if there's an issue writing to the file
    FileWriter fw = new FileWriter(filename); 
    BufferedWriter bw = new BufferedWriter(fw);
    
    String metadata = image.getMetadata(); //get Image attributes.
    int maxRange = image.getMaxRange();
    int height = image.getHeight();
    int width = image.getWidth();

    bw.write("P3"); //write format
    bw.write(metadata); //write metadata
    bw.write(width +  " " + height + "\n"); //write dimensions
    bw.write(maxRange + "\n"); //write pixel value range
    for(int i=0; i<height; i++){ // loop for writing pixels to file.
      for(int j=0; j<width; j++){
        bw.write(image.getPixel(i,j).getRed() + " " + image.getPixel(i,j).getGreen() + " " + image.getPixel(i,j).getBlue() + "  "); //or image.getPixel
      }
      bw.write("\n");
    }
    bw.close();
    fw.close();
  }
  static void writePgm(Image image, String filename) throws IOException { //Q2 //bufferedwriter auto throws an exception if there's an issue writing to the file
    FileWriter fw = new FileWriter(filename); 
    BufferedWriter bw = new BufferedWriter(fw);
    String metadata = image.getMetadata(); //get Image attributes.
    int maxRange = image.getMaxRange();
    int width = image.getWidth();
    int height = image.getHeight();
    bw.write("P2"); 
    bw.write(metadata); 
    bw.write(width +  " " + height + "\n");
    bw.write(maxRange + "\n"); 
    for(int i=0; i<height; i++){ // loop for writing pixels to file.
      for(int j=0; j<width; j++){
        bw.write(image.getPixel(i,j).grey() + " ");  
      }
      bw.write("\n");
    }
    bw.close();
    fw.close();
  }        
}

      