package e.io.practice;

import java.io.File;
import java.nio.file.Files;

public class FileList {
	private String file_path;
	private String end_name;
	private File file;
	
	public FileList(String file_path,String end_name) {
		super();
		this.file_path = file_path;
		this.end_name = end_name;
	}
	
	public void ShowList() {
		file = new File(file_path);
		File [] files = file.listFiles((f) -> {
			if(f.isFile()) {
				String fileName = f.getName();
				if(fileName.endsWith(end_name)) return true;
			}
			return false;
		});
		ShowFile(files);
	}
	
	private void ShowFile(File[] files) {
		for(File f : files) {
			System.out.println(f.getName());
		}
	}
	
	
}
