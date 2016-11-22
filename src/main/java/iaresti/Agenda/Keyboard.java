package iaresti.Agenda;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Keyboard {
	
	private static InputStreamReader isr = new InputStreamReader(System.in);
	private static BufferedReader br = new BufferedReader (isr);

	
	public static int readInt(){
		int num=0;
		try {
			num = Integer.parseInt(br.readLine());
		} catch (IOException e) {
			// TODO: handle exception
		}
		return num;
	}
	
	public static char readChar(){
		char c = ' ';
		try {
			c = (char) br.read();
		} catch (IOException e) {
			// TODO: handle exception
		}
		return c;
	}
	
	public static String readString(){
		String text="";
		try {
			text = br.readLine();
		} catch (IOException e) {
			// TODO: handle exception
		}
		return text;
	}
	

}
