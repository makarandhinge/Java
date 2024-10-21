package org.example;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class LinuxCommandSimulator {
    private File currentDirectory;

    public LinuxCommandSimulator() {
        // Set the initial directory to the user's home directory
        currentDirectory = new File(System.getProperty("user.home"));
    }

    public void mkdir(String dirName) {
        File newDir = new File(currentDirectory, dirName);
        if (newDir.mkdir()) {
            System.out.println("Directory " + dirName + " created.");
        } else {
            System.out.println("Failed to create directory " + dirName + ". It may already exist.");
        }
    }

    public void cd(String path) {
        File newDir = new File(currentDirectory, path);
        if (newDir.isDirectory()) {
            currentDirectory = newDir;
            System.out.println("Changed directory to " + currentDirectory.getAbsolutePath());
        } else {
            System.out.println("No such directory: " + path);
        }
    }

    public void pwd() {
        System.out.println("Current directory: " + currentDirectory.getAbsolutePath());
    }

    public void cp(String source, String destination) {
        File sourceFile = new File(currentDirectory, source);
        File destFile = new File(currentDirectory, destination);

        if (sourceFile.exists()) {
            try {
                Files.copy(sourceFile.toPath(), destFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                System.out.println("Copied " + source + " to " + destination);
            } catch (IOException e) {
                System.out.println("Failed to copy: " + e.getMessage());
            }
        } else {
            System.out.println("No such file: " + source);
        }
    }

    public static void main(String[] args) {
        LinuxCommandSimulator simulator = new LinuxCommandSimulator();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print(simulator.currentDirectory.getAbsolutePath() + "> ");
            String command = scanner.nextLine();
            String[] parts = command.split(" ");

            switch (parts[0]) {
                case "mkdir":
                    if (parts.length > 1) {
                        simulator.mkdir(parts[1]);
                    } else {
                        System.out.println("Usage: mkdir <directory_name>");
                    }
                    break;
                case "cd":
                    if (parts.length > 1) {
                        simulator.cd(parts[1]);
                    } else {
                        System.out.println("Usage: cd <directory_name>");
                    }
                    break;
                case "pwd":
                    simulator.pwd();
                    break;
                case "cp":
                    if (parts.length > 2) {
                        simulator.cp(parts[1], parts[2]);
                    } else {
                        System.out.println("Usage: cp <source> <destination>");
                    }
                    break;
                case "exit":
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Unknown command: " + parts[0]);
            }
        }
    }
}

