package com.godofjava.chapter28;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServerSample2 {
	
	public static void main(String[] args) {
		SocketServerSample2 sample = new SocketServerSample2();
		sample.startRelpyServer();
	}
	
	public void startRelpyServer() {
		ServerSocket server = null;
		Socket client = null;
		try {
			server = new ServerSocket(9999);
			while(true) {
				System.out.println("Server:Waiting for request.");
				client = server.accept();
				System.out.println("Server:Accepted.");
				OutputStream stream = client.getOutputStream();
				
				BufferedOutputStream out = new BufferedOutputStream(stream);
				out.write("OK".getBytes());
				out.close();
				stream.close();
				System.out.println("------------------");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(server != null) {
				try {
					server.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			} 
		}
	}

}
