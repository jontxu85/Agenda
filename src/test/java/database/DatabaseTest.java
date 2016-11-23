package database;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import modelo.Contacto;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class DatabaseTest 
{
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private Database database = new Database();

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
	public void shouldReturnIgorAresti(){
		Contacto contact = database.getContact(0);
		assertEquals(contact.getNombre()+contact.getApellido(), "Igor" + "Aresti");
	}
	
	@Test
	public void shouldNotReturnContactAndPrintErrorMessage(){
		database.getContact(-5);
		assertEquals("Esa posicion no tiene contacto", outContent.toString());
	}
	
	@Test
	public void shouldAddContact(){
		Contacto contact = new Contacto("Pedro","Garcia");
		database.addContact(contact);
		assertEquals(contact,database.getContact(1));
	}
	
	@Test
	public void shouldDeleteContact(){
		database.deleteContact(0);
		assertEquals(database.getContact(0), null);
	}
	
	@Test
	public void shouldNotDeleteContactAndPrintErrorMessage(){
		database.deleteContact(32);
		assertEquals("Esa posicion no tiene contacto", outContent.toString());
	}
	
	@Test
	public void shouldReturnAllContacts(){
		database.addContact(new Contacto("Pedro","Garcia"));
		List<Contacto> listContacts = database.getAllContacts();
		assertEquals(database.getContact(0), listContacts.get(0));
		assertEquals(database.getContact(1), listContacts.get(1));
	}
}
