public class FileNotFoundException extends Exception {

    //REQUIREMENT 5 - CUSTOM EXCEPTION
    public FileNotFoundException(String fileName) {
        super("File " + fileName + " no longer exists at the specified location.");
    }

}
