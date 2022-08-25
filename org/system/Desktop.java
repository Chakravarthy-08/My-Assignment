package org.system;

public class Desktop extends Computer {
	
public void desktopSize() {
		
		System.out.println("Desktop size is 21 inch");
	}

	public static void main(String[] args) {
		
		Desktop desktop = new Desktop();
		desktop.computerModel();
		desktop.desktopSize();
		
	}

}
