package com.basicjava.server.handler;

import java.io.IOException;
import java.net.Socket;

public class ReuqestHandler extends Thread {
	
	private Socket socket;

	public ReuqestHandler(Socket socket) {
		super();
		this.socket = socket;
	}
	
	public void run() {
		RequestManager request = new RequestManager(socket);
		System.out.println(socket);
		RequestDTO requestDTO = request.readRequest();
		System.out.println(socket);
		ResponseManager response = new ResponseManager(socket, requestDTO);
		response.writeResponse();
		
	}
	
	
}
