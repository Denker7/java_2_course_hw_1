package db.model;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: School
 *
 */

@Entity
public class School implements Serializable {

	   
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
	private Address address;
	private int num;
	public static final long serialVersionUID = 1L;

	public School() {
		super();
	}   
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}   
	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}   
	public int getNum() {
		return this.num;
	}

	public void setNum(int num) {
		this.num = num;
	}
   
}
