package LabSession.Aug01;

import java.io.File;

public class FilesList {
    public static void main(String[] args) {
        
    	//Change the path to your desired directory
        String directoryPath = "C:\\Users\\avina\\Documents";

        File directory = new File(directoryPath);

        //Check if the path exists and is a directory
        if (directory.exists() && directory.isDirectory()) {
            String[] fileList = directory.list();

            System.out.println("Files and Directories in: " + directoryPath);
            for (String name : fileList) {
                System.out.println(name);
            }
        } else {
            System.out.println("Invalid directory path!");
        }
    }
}
