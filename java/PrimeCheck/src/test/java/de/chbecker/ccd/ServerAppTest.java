package de.chbecker.ccd;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ServerAppTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Systemtest for Client and Server together
	 * @throws IOException
	 * @throws InterruptedException
	 */
	@Test
	public void testRun() throws IOException, InterruptedException {
		
		final ServerApp server = new ServerApp();
		final Thread serverThread = new Thread(new Runnable() {
			public void run() {
				// start server
				try {
					server.run();
				} catch (IOException e) {
					throw new RuntimeException(e);
				} catch (InterruptedException e) {
					throw new RuntimeException(e);
				}
			}
		});
		
		serverThread.start();
		assertTrue(serverThread.isAlive());
		
		ClientApp client = new ClientApp();
		client.run();
		assertTrue(true); // we reach this point... yea
	}

}
