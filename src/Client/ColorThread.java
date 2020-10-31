package Client;

import Client.Client;
import Server.ListenerClient;
import java.io.PrintWriter;

public class ColorThread extends Thread{
	private ListenerClient listener;
	private Client client;
	
	public ColorThread(ListenerClient listen, Client cli){
		this.listener = listen;
		this.client = cli;
	}
	
	public void run(){
		this.client.chooseColor();
	}
}
