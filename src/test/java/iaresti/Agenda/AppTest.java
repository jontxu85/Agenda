package iaresti.Agenda;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));
	}

	@After
	public void cleanUpStreams() {
	    System.setOut(null);
	    System.setErr(null);
	}
	
	@Test
	public void decToBin15() {
	    App.dec2bin(15);
	    assertEquals("1111", outContent.toString());
	}
	
	@Test
	public void decToBin10() {	    
	    App.dec2bin(10);
	    assertEquals("1010", outContent.toString());
	}
	
	@Test
	public void decToBin0() {
	    App.dec2bin(0);
	    assertEquals("0", outContent.toString());
	}
	
	@Test
	public void decToBin1() {
	    App.dec2bin(1);
	    assertEquals("1", outContent.toString());
	}
	
	@Test
	public void decToBin2() {
	    
	    App.dec2bin(2);
	    assertEquals("10", outContent.toString());
	}
	
}
