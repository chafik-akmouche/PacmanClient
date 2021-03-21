package Client;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	private static String adrIP="localhost";
	private static int port=5000;
	private static Socket clientSocket;

	public static void main(String[] args) {
			
			try {
				clientSocket = new Socket(adrIP,port);
				// lancer le thread reception et envoi
				new ClientReception(clientSocket).start();
				new ClientEnvoi(clientSocket).start();
				
			} catch (UnknownHostException e) {
				System.out.println(e);
			} catch (IOException e) {
				System.out.println(e);
			}
	}
}