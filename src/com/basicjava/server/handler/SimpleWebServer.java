package com.basicjava.server.handler;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleWebServer {
	private static final int PORT = 9000;
	public static void main(String[] args) {
		SimpleWebServer server = new SimpleWebServer();
		server.run(PORT);
	}
	public void run(int PORT) {
		ServerSocket server = null;
		Socket socket =null;
			try {
				server = new ServerSocket(PORT);
				while(true) {
					System.out.println("waiting for client");
					socket = server.accept();
					ReuqestHandler req = new ReuqestHandler(socket);
					req.start();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		
	}
}
