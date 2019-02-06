package ${package}.it;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.IOUtils;
import org.junit.Before;
import org.junit.Test;

public class HelloIT{
	
	private static String port, name;
	
	@Before
	public void setup() {
		port = System.getProperty("servlet.port", "${default_port}");
	}

	@Test
	public void hello() throws IOException {
		String testName = "testname";
		HttpURLConnection connection = (HttpURLConnection)new URL("http://localhost:" + port +"/hello?name="+testName).openConnection();
		{
			connection.connect();
			assertEquals(200, connection.getResponseCode());
			
			try (InputStream in = connection.getInputStream()) {
				String output = IOUtils.toString(in, StandardCharsets.UTF_8);
				assertTrue("Sent name not found in page  with source \n" + output, output.contains(testName));
			}
		}
	}

}
