package javaInterviewQuestions;

import java.io.File;

public class CreateDirectory83 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\Nivedita\\Test");
		if (f.exists() && f.isDirectory()) {
			f = new File("C:\\Users\\Nivedita\\Test\\Dir1");
			f.mkdir();
			f = new File("C:\\Users\\Nivedita\\Test\\Dir4\\Dir5");
			f.mkdirs();
		} 
	}

}
