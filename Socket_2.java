package getIP;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Socket_2 {

	public Socket_2() {
		// TODO Auto-generated constructor stub
	}
 public static void main(String[] args) throws Exception, IOException {
	Socket s=new Socket("192.168.253.1", 10004);
	OutputStream os=s.getOutputStream();
	os.write("hello world".getBytes());
	os.close();
	s.close();
	
}
}
