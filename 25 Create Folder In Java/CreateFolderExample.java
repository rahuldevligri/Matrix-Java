import java.io.File;

public class CreateFolderExample {
    public static void main(String[] args) {
        // Specify the path of the folder you want to create
        String folderPath = "C:\\Users\\rohit\\3D Objects\\ExapleFolder";

        // Create a File object representing the folder
        File folder = new File(folderPath);

        // Check if the folder already exists
        if (!folder.exists()) {
            // If not, create the folder
            boolean success = folder.mkdir(); // mkdir() creates a single directory

            if (success) {
                System.out.println("Folder created successfully");
            } else {
                System.out.println("Failed to create the folder");
            }
        } else {
            System.out.println("Folder already exists");
        }
    }
}
