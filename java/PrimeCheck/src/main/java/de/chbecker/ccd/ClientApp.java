package de.chbecker.ccd;

import org.msgpack.rpc.Client;
import org.msgpack.rpc.loop.EventLoop;

import de.chbecker.ccd.interfaces.RPCInterface;


public class ClientApp {
 
	public static void main(String[] args) throws Exception {
        EventLoop loop = EventLoop.defaultEventLoop();
 
        Client cli = new Client(ServerApp.LISTENHOST, ServerApp.LISTENPORT, loop);
        RPCInterface iface = cli.proxy(RPCInterface.class);
 
        System.out.println(iface.echo("hello"));

        loop.shutdown();
        System.exit(0); // needed to stop detached threads
    }
}

