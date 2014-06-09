import java.io.*;

public class FileLister {
	public static void main(String args[]) {
		System.out.print("Please enter the absolute path of a directory: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String path = "";

		// get path
		try {
			path = br.readLine();
		} catch (IOException e) {
			System.out.println("Something bad happened... exiting.");
			System.exit(0);
		}

		// get files and put them in array
		File folder = new File(path);
		File[] listOfFiles = folder.listFiles();
		
		// loop through array printing files
		for(int i = 0; i < listOfFiles.length; i++) {
			// check if is directory
			if (listOfFiles[i].isDirectory()) {
				System.out.println("directory: " + listOfFiles[i].getName());
			} else {
				System.out.println("file: " + listOfFiles[i].getName());
			}
		}
	}
}