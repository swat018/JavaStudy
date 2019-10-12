package com.godofjava.chapter31;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.List;

import static java.nio.file.StandardWatchEventKinds.ENTRY_CREATE;
import static java.nio.file.StandardWatchEventKinds.ENTRY_DELETE;
import static java.nio.file.StandardWatchEventKinds.ENTRY_MODIFY;

public class WatcherSample extends Thread {
	String dirName;
	
	public static void main(String args[]) throws Exception {
		String dirName = "D:\\7.Study\\git\\java_study\\godofjava";
		String fileName = "WatcherSample.txt";
		WatcherSample sample = new WatcherSample(dirName);
		sample.setDaemon(true);
		sample.start();
		Thread.sleep(1000);
		for (int i=0; i<10; i++) {
			sample.fileWriteDelete(dirName, fileName + i);
		}
	}
	
	public WatcherSample(String dirName) {
		this.dirName = dirName;
	}
	
	public void run() {
		System.out.println("### Watcher thread is started ###");
		System.out.format("Dir = %s\n", dirName);
		addWatcher();
	}
	
	public void addWatcher() {
		try {
			Path dir = Paths.get(dirName);
			
			WatchService watcher = FileSystems.getDefault().newWatchService();
			WatchKey key = dir.register(watcher, ENTRY_CREATE, ENTRY_DELETE, ENTRY_MODIFY);
			while(true) {
				key = watcher.take();
				List<WatchEvent<?>> eventList =  key.pollEvents();
				for (WatchEvent<?> event : eventList) {
					Path name = (Path) event.context();
					if (event.kind() == ENTRY_CREATE) {
						System.out.format("%s created%n", name);
					} else if (event.kind() == ENTRY_DELETE) {
						System.out.format("%s deleted%n", name);
					} else if (event.kind() == ENTRY_MODIFY) {
						System.out.format("%s modified%n", name);
					}
				}
				key.reset();
			}
		} catch(IOException|InterruptedException e) {
			e.printStackTrace();
		}
	}
	private void fileWriteDelete(String dirName, String fileName) {
		Path path = Paths.get(dirName, fileName);
		String contents = "Watcher sample";
		StandardOpenOption openOption = StandardOpenOption.CREATE;
		try {
			System.out.println("Write " + fileName);
			Files.write(path, contents.getBytes(), openOption);
			Files.delete(path);
			Thread.sleep(100);
			} catch(IOException|InterruptedException e) {
			e.printStackTrace();
		}
	}
}
