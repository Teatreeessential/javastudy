package com.basicjava.server.handler;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Date;

public class ResponseManager {
	private Socket socket;
	private RequestDTO requestDTO;
	
	public ResponseManager(Socket socket, RequestDTO requestDTO) {
		super();
		this.socket = socket;
		this.requestDTO = requestDTO;
	}
	
	public void writeResponse() {
		    try {
				PrintStream response = new PrintStream(socket.getOutputStream());
				switch(requestDTO.getUri()) {
					case "/":
						response.println("HTTP/1.1 200 OK");
						response.println("Content-type: text/html");
						response.println();
						response.print("it's working");
						break;
					case "/date":
						response.println("HTTP/1.1 200 OK");
						response.println("Content-type: text/html");
						response.println();
						response.print("today is:"+new Date());
						break;
				}
				response.flush();
				response.close();
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}if(socket!=null) {
				try {
					socket.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		
	}
	
}
