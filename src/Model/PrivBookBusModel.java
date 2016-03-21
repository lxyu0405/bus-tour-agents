package Model;

import java.sql.*;

public class PrivBookBusModel {

	private String bus_no;
	private int seat_capacity;
	private int driver_no;
	private Date depart_date;
	private Time depart_time;
	private String depart_location;
	private Date return_date;
	private Time return_time;
	private String return_location;
	private String contact_person;
	private int contact_tel;
	
	public PrivBookBusModel(String bus_no, int seat_capacity, int driver_no, Date depart_date, Time depart_time,
			String depart_location, Date return_date, Time return_time, String return_location, String contact_person,
			int contact_tel) {
		super();
		this.bus_no = bus_no;
		this.seat_capacity = seat_capacity;
		this.driver_no = driver_no;
		this.depart_date = depart_date;
		this.depart_time = depart_time;
		this.depart_location = depart_location;
		this.return_date = return_date;
		this.return_time = return_time;
		this.return_location = return_location;
		this.contact_person = contact_person;
		this.contact_tel = contact_tel;
	}
	
	
	public String getBus_no() {
		return bus_no;
	}
	public void setBus_no(String bus_no) {
		this.bus_no = bus_no;
	}
	public int getSeat_capacity() {
		return seat_capacity;
	}
	public void setSeat_capacity(int seat_capacity) {
		this.seat_capacity = seat_capacity;
	}
	public int getDriver_no() {
		return driver_no;
	}
	public void setDriver_no(int driver_no) {
		this.driver_no = driver_no;
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
	public String getDepart_location() {
		return depart_location;
	}
	public void setDepart_location(String depart_location) {
		this.depart_location = depart_location;
	}
	public Date getReturn_date() {
		return return_date;
	}
	public void setReturn_date(Date return_date) {
		this.return_date = return_date;
	}
	public Time getReturn_time() {
		return return_time;
	}
	public void setReturn_time(Time return_time) {
		this.return_time = return_time;
	}
	public String getReturn_location() {
		return return_location;
	}
	public void setReturn_location(String return_location) {
		this.return_location = return_location;
	}
	public String getContact_person() {
		return contact_person;
	}
	public void setContact_person(String contact_person) {
		this.contact_person = contact_person;
	}
	public int getContact_tel() {
		return contact_tel;
	}
	public void setContact_tel(int contact_tel) {
		this.contact_tel = contact_tel;
	}


	@Override
	public String toString() {
		return "PrivBookBusModel [bus_no=" + bus_no + ", seat_capacity=" + seat_capacity + ", driver_no=" + driver_no
				+ ", depart_date=" + depart_date + ", depart_time=" + depart_time + ", depart_location="
				+ depart_location + ", return_date=" + return_date + ", return_time=" + return_time
				+ ", return_location=" + return_location + ", contact_person=" + contact_person + ", contact_tel="
				+ contact_tel + "]";
	}
}
