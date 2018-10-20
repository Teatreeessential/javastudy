package e.network.practice;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServerSample {
	public static void main(String[] args) {
		SocketServerSample server = new SocketServerSample();
		server.startServer();
	}
	public void startServer() {
		ServerSocket server = null;
		Socket client = null;
		
		try {
			server = new ServerSocket(9999);
			while(true) {
				System.out.println("server:waiting for request");
				client = server.accept();
				System.out.println("Server:accepted");
				InputStream stream = client.getInputStream();
				BufferedReader in = new BufferedReader(new InputStreamReader(stream));
				String data = null;
				StringBuilder receivedData = new StringBuilder();
				while((data = in.readLine())!=null) {
					receivedData.append(data);
				}
				System.out.println("received data:"+receivedData);
				in.close();
				stream.close();
				client.close();
				if(receivedData!=null&&"EXIT".equals(receivedData.toString())) {
					System.out.println("stop socketserver");
					break;
				}
				System.out.println("-------------");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(server!=null) {
				try {
					server.close();
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		}
	}
}
