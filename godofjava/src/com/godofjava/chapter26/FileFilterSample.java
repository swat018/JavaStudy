package com.godofjava.chapter26;

import java.io.File;

public class FileFilterSample {

	public static void main(String[] args) {
		FileFilterSample sample = new FileFilterSample();
		String pathName = "D:\\7.Study\\1.Programming\\7.java\\1.GodOfJava\\text";
		sample.checkList(pathName);
	}
	
	public void checkList(String pathName) {
		File file;
		try {
			file = new File(pathName);
			// File []mainFileList = file.listFiles();
			// File []mainFileList = file.listFiles(new JPGFilenameFilter());
			File []mainFileList = file.listFiles(new JPGFileFilter());
			for(File tempFile:mainFileList) {
				System.out.println(tempFile.getName());
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	

}
