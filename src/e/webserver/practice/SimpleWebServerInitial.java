package e.webserver.practice;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleWebServerInitial {

	public static void main(String[] args) {
		SimpleWebServerInitial server = new SimpleWebServerInitial();
		int port = 8000;
		server.start(8000);
	}
	
	private final int BUFFER_SIZE=2048;
	
	public void start(int port) {
		ServerSocket server = null;
		try {
			server = new ServerSocket(port);
			while(true) {
				System.out.println("waiting for client");
				Socket socket = server.accept();
				InputStream request = new BufferedInputStream(socket.getInputStream());
				byte[] receivedBytes = new byte[BUFFER_SIZE];
				request.read(receivedBytes);
				String[] requestData = new String(receivedBytes).trim().split("\n");
				for(String s:requestData) {
					System.out.println(s);
				}
				
				System.out.println("--------------------------");
				PrintStream response = new PrintStream(socket.getOutputStream());
				response.println("HTTP/1.1 200 OK");
				response.println("Content-type: text/html");
				response.println();
				response.print("it's working");
				response.flush();
				response.close();
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(server!=null) {
				try {
					server.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
				
			}
			
		}
	}

}
