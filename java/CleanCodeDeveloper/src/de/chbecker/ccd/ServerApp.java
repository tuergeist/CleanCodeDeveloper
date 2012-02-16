package de.chbecker.ccd;

import org.msgpack.rpc.Server;
import org.msgpack.rpc.loop.EventLoop;

public class ServerApp {

	private static final int LISTENPORT = 1984;

	public static void main(String[] args) throws Exception {
		EventLoop loop = EventLoop.defaultEventLoop();

		Server svr = new Server();
		svr.serve(new PrimeTester());
		svr.listen(LISTENPORT);

		loop.join();
	}
}
