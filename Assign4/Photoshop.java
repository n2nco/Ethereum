class Comp202Photoshop {
  
  public static void main(String[] args) {
    
    String[] fileExtensions = new String[2];
    
    try {
      fileExtensions = getFileExtensions(args); //get file extensions
    }
    catch (IllegalArgumentException e) {
      System.out.println(e);
      return;
    }
    if ((args.length < 4) || (args.length > 8)) {
      System.out.println("Please input a minnimum of 4 arguments, and a maximum of 8");
      return;
    }
    else if (!args[2].equals("pgm") && !args[2].equals("pnm")) {
      System.out.println("Invalid output file format. Please enter pgm or pnm." + args[2]);
      return;
    }
    else if (!args[3].equals("-fh") && !args[3].equals("-fv") && !args[3].equals("-gs") && !args[3].equals("-cr")) {
      System.out.println("Invalid image output operation entry. Please enter one of the following: -fh, -fv, -gs, -cr");
      return;
    }  
    else if (!fileExtensions[1].equals(args[2])) { // if output filename format extension does not match output format argument. 
      System.out.println("Please ensure the output filename's extension (.pgm or .pnm) matches output format argument.");
      return;
    }
    else if (((fileExtensions[0]).equals("pnm")) && (fileExtensions[1].equals("pgm")) && (!args[3].equals("-gs"))) {// if input is pnm, and output is pgm, operation argument must be -gs. 
      System.out.println("Please ensure argument operation is -gs if input filename extension is .pnm (colour) and output filename extension is .pgm (grey).");
      return;
    }
    else if (((fileExtensions[1].equals("pnm")) || (args[2].equals("pnm"))) && (args[3].equals("-gs"))) {
      System.out.println("Please ensure your filename extension and output file format is aligns with your intended operation argument. A -gs operation must have a .pgm output file extension/format.");
      return;
    }
     else if (((fileExtensions[0]).equals("pgm")) && ((fileExtensions[1].equals("pnm")) && (!args[3].equals("-gs")))) {
        System.out.println("Please ensure your filename extension and output file format is aligns with your intended operation argument. A .pgm input image cannot be output as a pnm");
        return;
     }
    
    String inputFile = args[0]; 
    String outputFile = args[1];
    String outputFormat = args[2];
    String operation = args[3];
    int startY = 0;
    int startX = 0;
    int endY = 0;
    int endX = 0;
    
    if (args.length > 4) {
      startY = Integer.parseInt(args[4]);
      startX = Integer.parseInt(args[5]);
      endY = Integer.parseInt(args[6]);
      endX = Integer.parseInt(args[7]);
    }
    Image newImage1 = null;
    try {
      newImage1 = ImageFileUtilities.read(inputFile); //turn inputFile into Image object
    }
    catch (Exception e) {
      System.out.println("Exception caught: " + e);
    }
    if(newImage1 != null) { //call image operation method
      if (operation.equals("-fh")) {
        newImage1.flip(true);
      }
      else if (operation.equals("-fv")) {
        newImage1.flip(false);
      }
      else if (operation.equals("-gs")) {
        newImage1.toGrey();
      }
      else if (operation.equals("-cr")) {
        try { 
          newImage1.crop(startX, startY, endX, endY); // these include row/column 'zero'
        }
        catch (Exception e) {
          System.out.println("Exception caught while attempting to crop image: " + e); //better way to display exception?
        }
      }
      try{
        if (outputFormat.equals("pgm")) {
         ImageFileUtilities.writePgm(newImage1, outputFile); //write new image file using image object.
        }
        else if (outputFormat.equals("pnm")) {
         ImageFileUtilities.writePnm(newImage1, outputFile);
        }
      }
      catch (Exception e) {
        System.out.println("Exception caught: " + e);
      }
    }
  }

//Helper method to obtain filename extensions. Isolating/storing these extensions enables comparison to ensure valid program logic based on input arguments.   
  private static String[] getFileExtensions(String args[]) throws IllegalArgumentException{
    String[] fileExtensions = new String[2];
    for(int i = 0; i < 2; i++) {  //loop through args until index[1] because only 1st two arguments have file extensions
      int extensionIndex = (args[i].length() - 3); //obtain the file extension index in the String
      String fileExtension = args[i].substring(extensionIndex);
      if ((!fileExtension.equals("pnm")) && (!fileExtension.equals("pgm"))) { //ensure that file extension is correct.
        throw new IllegalArgumentException("Please ensure filename extensions are either .pnm or .pgm.");
      }
      fileExtensions[i] = fileExtension;
    }
    return fileExtensions;
  }
}