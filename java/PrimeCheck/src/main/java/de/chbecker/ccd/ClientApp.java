package de.chbecker.ccd;

import java.net.UnknownHostException;

import org.msgpack.rpc.Client;
import org.msgpack.rpc.loop.EventLoop;

import de.chbecker.ccd.interfaces.Echo;


public class ClientApp {
 
	public static void main(String[] args) throws UnknownHostException {
		ClientApp client = new ClientApp();
		client.run();
		System.exit(0); // needed to stop detached threads
    }
	
	public ClientApp() {
		
	}
	
	public void run() throws UnknownHostException {
		EventLoop loop = EventLoop.defaultEventLoop();
		
		Client cli = new Client(ServerApp.LISTENHOST, ServerApp.LISTENPORT, loop);
		Echo iface = cli.proxy(Echo.class);
		
		System.out.println(iface.echo("hello echo"));
		
		loop.shutdown();
	}
}

