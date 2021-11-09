package oppgave4;
public class ToDoElement {

	private int nummer, prioritet;
	private String beskrivelse;
	public void settnum (int num) {this.nummer = num;}
	public int getnummer() {return nummer;}
	public void settpri (int pri) {this.prioritet = pri;}
	public int getprioritet() {return prioritet;}
	public void settdesc(String desc) {this.beskrivelse = desc;}
	public String getbesk() {return beskrivelse;}
	
	public ToDoElement(String Beskrivelse, int Nummer, int Prioritet) {
	beskrivelse = Beskrivelse;
	nummer = Nummer;
	prioritet = Prioritet;
	}
	
	public String toString() {return beskrivelse + "/n" + "nummer : " + nummer + "/n" + "Prioritet : " + prioritet ;}
}
