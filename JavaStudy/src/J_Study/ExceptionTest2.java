package J_Study;

import java.io.IOException;

class TEXception{
	public void read() {
		try {
			throw new IOException();
		}catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Running read method");
	}
}

class Excep{
	public void read() throws IOException {
		throw new IOException();
	}
}

public class ExceptionTest2 {
	public static void main(String[] args) throws IOException {
		Excep exc = new Excep();
		
		try {
			exc.read();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		//TEXception te = new TEXception();
		//te.read();
		System.out.println("Running main method");
	}
}
