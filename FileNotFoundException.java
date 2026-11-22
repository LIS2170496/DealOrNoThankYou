public class FileNotFoundException extends Exception {

    public FileNotFoundException(String fileName) {
        super("File " + fileName + " no longer exists at the specified location.");
    }

}
