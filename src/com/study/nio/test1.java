package com.study.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class test1 {

	public static void main(String[] args) {
		Path path = Paths.get("");
		
		if(path.isAbsolute()) {
			System.out.println(path.toString());
		}else {
			System.out.println(path.toAbsolutePath().toString());
		}
	}

}
