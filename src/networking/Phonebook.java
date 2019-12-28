package networking;

import java.util.ArrayList;
import java.util.Iterator;

import main.Client;

public class Phonebook {
	// Contacts table
	private ArrayList<Client> phonebook = new ArrayList<Client>();

	public Client getLeader() {
		Iterator<Client> itrClient = phonebook.iterator();
		Client leader = null;
		while (itrClient.hasNext()) {
			if (itrClient.next().getRights() == 2) {
				System.out.println(itrClient.next());
				leader = itrClient.next();
			} else {
				// TODO: HOW HANDLE IF NO LEADER IS FOUND AT A POINT IN TIME
			}
		}
		return leader;

	}

	public void newLeader(Client clt) {
		Iterator<Client> itrClient = phonebook.iterator();
		while (itrClient.hasNext()) {
			if (itrClient.next() == clt) {
				itrClient.next().setRights(2);
			} else {
				// TODO: HOW HANDLE IF NO LEADER IS FOUND AT A POINT IN TIME
			}
		}
	}

	public void addNewNode() {
		
	}

	public void deleteClient(Client client) {

	}

	public void deactivateClient() {

	}
	public void deactivateLeader() {

	}
	public ArrayList<Client> getFullPhonebook() {

		return this.phonebook;

	}
	public int countPhonebookEntries() {
		return 0;
	}
	//return final merged Phonebook
	public ArrayList<Client> mergeTwoPhonebooks(ArrayList<Client> pb1,ArrayList<Client> pb2) {
		ArrayList<Client> finalPhonebook = new ArrayList<Client>();
		return finalPhonebook;
	}
}
