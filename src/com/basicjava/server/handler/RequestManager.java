package com.basicjava.server.handler;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class RequestManager {
	Socket socket =null;
	private final int BUFFER_SIZE=2048;
	public RequestManager(Socket socket) {
		this.socket =socket;
	}
	
	public RequestDTO readRequest() {
		InputStream request = null;
		RequestDTO dto = null;
		try {
			request = new BufferedInputStream(socket.getInputStream());
			byte[] receivedBytes = new byte[BUFFER_SIZE];
			request.read(receivedBytes);
			dto = new RequestDTO();
			String[] requestData = new String(receivedBytes).trim().split("\n");
			requestData = requestData[0].split("\\s+");
			dto.setRequestMethod(requestData[0]);
			dto.setUri(requestData[1]);
			dto.setHttpVersion(requestData[2]);
			//request가 close되면 socket도 자동으로 소멸되나??
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return dto;
		
		
	}
}
