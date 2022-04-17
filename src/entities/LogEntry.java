package entities;

import java.util.Date;
import java.util.Objects;

public class LogEntry {
	private String name;
	private Date moment;
	public LogEntry(String name, Date moment) {
		this.name = name;
		this.moment = moment;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the moment
	 */
	public Date getMoment() {
		return moment;
	}
	/**
	 * @param moment the moment to set
	 */
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LogEntry other = (LogEntry) obj;
		return Objects.equals(name, other.name);
	}
	
	
}
