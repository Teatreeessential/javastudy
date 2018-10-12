package e.io.practice;

import java.nio.channels.ShutdownChannelGroupException;

public class FileListMain {

	public static void main(String[] args) {
		FileList files = new FileList("C:\\Users\\Ahn\\Desktop\\study\\java",".md");
		files.ShowList();
	}

}
