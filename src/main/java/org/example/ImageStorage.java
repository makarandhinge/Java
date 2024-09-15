package org.example;
import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageStorage {

    public static void main(String[] args) {
        try {
            // Create a file chooser
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Select an Image");

            // Set file filter to only accept image files
            fileChooser.setFileFilter(new javax.swing.filechooser.FileFilter() {
                @Override
                public boolean accept(File f) {
                    if (f.isDirectory()) {
                        return true;
                    }
                    String name = f.getName().toLowerCase();
                    return name.endsWith(".jpg") || name.endsWith(".jpeg") || name.endsWith(".png") || name.endsWith(".bmp") || name.endsWith(".gif");
                }

                @Override
                public String getDescription() {
                    return "Image Files (*.jpg, *.jpeg, *.png, *.bmp, *.gif)";
                }
            });

            // Show the file chooser dialog
            int result = fileChooser.showOpenDialog(null);

            // If the user selects an image
            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();

                // Convert the image to a byte array
                byte[] imageBytes = convertImageToBytes(selectedFile);

                // Specify the path where the byte array will be stored
                File byteFile = new File("image_bytes.dat");

                // Save the byte array to a file
                try (FileOutputStream fos = new FileOutputStream(byteFile)) {
                    fos.write(imageBytes);
                }

                System.out.println("Image bytes saved successfully at: " + byteFile.getAbsolutePath());
            } else {
                System.out.println("No image selected.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Method to convert image file to byte array
    private static byte[] convertImageToBytes(File imageFile) throws IOException {
        byte[] imageBytes;
        try (FileInputStream fis = new FileInputStream(imageFile)) {
            imageBytes = fis.readAllBytes();
        }
        return imageBytes;
    }
}
