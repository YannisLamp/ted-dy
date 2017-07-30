package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the calendar database table.
 * 
 */
@Embeddable
public class CalendarPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="listings_id", insertable=false, updatable=false)
	private int listingsId;

	@Temporal(TemporalType.DATE)
	private java.util.Date date;

	public CalendarPK() {
	}
	public int getListingsId() {
		return this.listingsId;
	}
	public void setListingsId(int listingsId) {
		this.listingsId = listingsId;
	}
	public java.util.Date getDate() {
		return this.date;
	}
	public void setDate(java.util.Date date) {
		this.date = date;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CalendarPK)) {
			return false;
		}
		CalendarPK castOther = (CalendarPK)other;
		return 
			(this.listingsId == castOther.listingsId)
			&& this.date.equals(castOther.date);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.listingsId;
		hash = hash * prime + this.date.hashCode();
		
		return hash;
	}
}