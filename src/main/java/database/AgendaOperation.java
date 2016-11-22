package database;

import java.util.List;

import modelo.Contacto;

public interface AgendaOperation {
	
	public void addContact(Contacto contact);
	public void deleteContact(int contactPosition);
	public Contacto getContact(int contactPosition);
	public List<Contacto> getAllContacts();

}
