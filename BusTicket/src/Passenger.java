public class Passenger {
	void traivel() {
		String dest = "BTM";
		Conductor c = new Conductor();
		Money mn = new Money();
		System.out.println("Passenger ask For ticket");
		Ticket t = c.issueTicket(dest, mn);
		t.genrated();
		System.out.println("Passenger Got the ticket");
	}
}
