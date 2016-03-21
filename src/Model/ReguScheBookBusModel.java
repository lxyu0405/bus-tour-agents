package Model;

import java.sql.*;

public class ReguScheBookBusModel {

	private String tour_code;
	private String destination;
	private String description;
	private int bus_no;
	private int driver_no;
	private String depart_location;
	private Date depart_date;
	private Time depart_time;
	private int max_participants;
	private int no_of_participants;
	
	public ReguScheBookBusModel(String tour_code, String destination, String description, int bus_no, int driver_no,
			String depart_location, Date depart_date, Time depart_time, int max_participants, int no_of_participants) {
		super();
		this.tour_code = tour_code;
		this.destination = destination;
		this.description = description;
		this.bus_no = bus_no;
		this.driver_no = driver_no;
		this.depart_location = depart_location;
		this.depart_date = depart_date;
		this.depart_time = depart_time;
		this.max_participants = max_participants;
		this.no_of_participants = no_of_participants;
	}
	
	public String getTour_code() {
		return tour_code;
	}
	public void setTour_code(String tour_code) {
		this.tour_code = tour_code;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getBus_no() {
		return bus_no;
	}
	public void setBus_no(int bus_no) {
		this.bus_no = bus_no;
	}
	public int getDriver_no() {
		return driver_no;
	}
	public void setDriver_no(int driver_no) {
		this.driver_no = driver_no;
	}
	public String getDepart_location() {
		return depart_location;
	}
	public void setDepart_location(String depart_location) {
		this.depart_location = depart_location;
	}
	public Date getDepart_date() {
		return depart_date;
	}
	public void setDepart_date(Date depart_date) {
		this.depart_date = depart_date;
	}
	public Time getDepart_time() {
		return depart_time;
	}
	public void setDepart_time(Time depart_time) {
		this.depart_time = depart_time;
	}
	public int getMax_participants() {
		return max_participants;
	}
	public void setMax_participants(int max_participants) {
		this.max_participants = max_participants;
	}
	public int getNo_of_participants() {
		return no_of_participants;
	}
	public void setNo_of_participants(int no_of_participants) {
		this.no_of_participants = no_of_participants;
	}

	@Override
	public String toString() {
		return "ReguScheBookBusModel [tour_code=" + tour_code + ", destination=" + destination + ", description="
				+ description + ", bus_no=" + bus_no + ", driver_no=" + driver_no + ", depart_location="
				+ depart_location + ", depart_date=" + depart_date + ", depart_time=" + depart_time
				+ ", max_participants=" + max_participants + ", no_of_participants=" + no_of_participants + "]";
	}
}
