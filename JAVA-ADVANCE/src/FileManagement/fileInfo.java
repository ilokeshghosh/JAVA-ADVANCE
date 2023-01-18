package FileManagement;

import java.io.*;

public class fileInfo {
    public static void main(String[] args) {
        File f0 = new File("C:\\Users\\acer\\Desktop\\GIT REPO\\JAVA-ADVANCE\\JAVA-ADVANCE\\src\\FileManagement\\files\\test.txt");
        if (f0.exists()) {
            String fileName = f0.getName(); // to get filename
            String filePath = f0.getAbsolutePath(); //to get file path

        }
    }
}
