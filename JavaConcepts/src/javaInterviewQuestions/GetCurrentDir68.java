package javaInterviewQuestions;

import java.nio.file.Paths;

public class GetCurrentDir68 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(System.getProperty("user.dir"));
		
		String path = Paths.get("").toAbsolutePath().toString();
		System.out.println("Working directory :: "+path);
	}

}
