package com.godofjava.chapter26;

import java.io.File;
import java.util.Date;

public class FileSample {

	public static void main(String[] args) {
		FileSample sample = new FileSample();
		String pathName = "D:\\7.Study\\1.Programming\\7.java\\1.GodOfJava\\text";
		sample.checkPath(pathName);
		sample.makeDir(pathName);
		sample.checkFileMethods(pathName);
		sample.canFileMethods(pathName);
		sample.lastModified(pathName);
	}
	
	public void checkPath(String pathName) {
		File file = new File(pathName);
		System.out.println(pathName + " is exiest? = " + file.exists());
	}
	public void makeDir(String pathName) {
		File file = new File(pathName);
		System.out.println("Make " + pathName + " result = " + file.mkdir());
	}
	public void checkFileMethods(String pathName) {
		File file = new File(pathName);
		System.out.println(pathName + " is directory? = " + file.isDirectory());
		System.out.println(pathName + " is file? = " + file.isFile());
		System.out.println(pathName + " is hedden? = " + file.isHidden());
	}
	public void canFileMethods(String pathName) {
		File file = new File(pathName);
		System.out.println(pathName + " can read? = " + file.canRead());
		System.out.println(pathName + " can write? = " + file.canWrite());
		System.out.println(pathName + " can execute? = " + file.canExecute());
	}
	public void lastModified(String pathName) {
		File file = new File(pathName);
		System.out.println(pathName + " last modified = " + new Date(file.lastModified()));
	}

 }
