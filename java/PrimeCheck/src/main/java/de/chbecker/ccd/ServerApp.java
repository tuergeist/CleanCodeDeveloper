package de.chbecker.ccd;

import org.msgpack.rpc.Server;
import org.msgpack.rpc.loop.EventLoop;

import de.chbecker.ccd.primetester.PrimeTesterImpl;

public class ServerApp {

	public static final int LISTENPORT = 1984;
    public static final String LISTENHOST = "localhost";

	public static void main(String[] args) throws Exception {
		EventLoop loop = EventLoop.defaultEventLoop();

		Server svr = new Server();
		svr.serve(new PrimeTesterImpl());
		svr.listen(LISTENPORT);

		loop.join();
	}
}
