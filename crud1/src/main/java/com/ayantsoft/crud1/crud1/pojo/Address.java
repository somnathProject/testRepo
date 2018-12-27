package com.ayantsoft.crud1.crud1.pojo;
// Generated 26 Dec, 2018 7:38:49 AM by Hibernate Tools 4.3.5.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Address generated by hbm2java
 */
@Entity
@Table(name = "address", catalog = "employee1")
public class Address implements java.io.Serializable {

	private Integer id;
	private String state;
	private String city;
	private Integer pincode;
	private Set<Emp> emps = new HashSet<Emp>(0);

	public Address() {
	}

	public Address(String state, String city, Integer pincode, Set<Emp> emps) {
		this.state = state;
		this.city = city;
		this.pincode = pincode;
		this.emps = emps;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "state", length = 45)
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "city", length = 45)
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "pincode")
	public Integer getPincode() {
		return this.pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "address")
	public Set<Emp> getEmps() {
		return this.emps;
	}

	public void setEmps(Set<Emp> emps) {
		this.emps = emps;
	}

}