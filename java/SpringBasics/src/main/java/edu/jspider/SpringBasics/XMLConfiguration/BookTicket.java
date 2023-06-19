package edu.jspider.SpringBasics.XMLConfiguration;

public class BookTicket {

	private int ticketId;
	private String source;
	private String destination;

	public BookTicket() {
		System.out.println("Ticket Booked");
	}

	public void bookingConfirmation() {
		System.out.println("Ticket Confirmed Successfully");
	}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	@Override
	public String toString() {
		return "BookTicket [ticketId=" + ticketId + ", source=" + source + ", destination=" + destination + "]";
	}

}
