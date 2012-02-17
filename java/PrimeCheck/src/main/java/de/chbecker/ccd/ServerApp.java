package de.chbecker.ccd;

import java.io.IOException;

import org.msgpack.rpc.Server;
import org.msgpack.rpc.loop.EventLoop;

import de.chbecker.ccd.echo.EchoImpl;

public class ServerApp {

	public static final int LISTENPORT = 1984;
    public static final String LISTENHOST = "localhost";

	public static void main(String[] args) throws Exception {
		ServerApp server = new ServerApp();
		server.run(); // not a thread but it forks some
	}
	
	public ServerApp() {
		
	}
	
	public void run() throws IOException, InterruptedException {
		EventLoop loop = EventLoop.defaultEventLoop();
		
		Server svr = new Server();
		svr.serve(new EchoImpl());
		svr.listen(LISTENPORT);
		
		loop.join();
	}
}
