package javaInterviewQuestions;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class RenameFile84 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "C:\\Users\\Nivedita\\Test";

		File f = new File(path);
		if (f.exists() && f.isDirectory()) {
			f = new File(path + "\\test.txt");
			try {
				if (f.createNewFile()) {
					System.out.println("File created");
					f.renameTo(new File(path + "\\testNew.txt"));
					System.out.println("File renamed :: " + f.getName());

				} else
					System.out.println("File not created");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			copyFile();
			deleteFiles(path);
		}
	}

	public static void deleteFiles(String pathDirectory) {
		File f = new File(pathDirectory);
		if (f.isDirectory()) {
			File[] files = f.listFiles();
			for (File file : files) {
				file.delete();
				System.out.println("Deleted file name :: " + file.getName());
			}
		}
	}

	public static void copyFile() {
		String path = "C:\\Users\\Nivedita\\Test";
		File f = new File(path + "\\testCopy.txt");
		try {
			f.createNewFile();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Path source = Paths.get(f.getPath());
		Path target = Paths.get(path + "\\Dir4\\testCopy.txt");
		try {
			Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
			System.out.println(target.toFile().getAbsolutePath()+" File copied ");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
