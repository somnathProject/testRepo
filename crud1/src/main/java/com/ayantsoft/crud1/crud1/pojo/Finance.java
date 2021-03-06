package com.ayantsoft.crud1.crud1.pojo;
// Generated 26 Dec, 2018 7:38:49 AM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Finance generated by hbm2java
 */
@Entity
@Table(name = "finance", catalog = "employee1")
public class Finance implements java.io.Serializable {

	private Integer finId;
	private Emp emp;
	private Integer ta;
	private Integer da;
	private String bonous;

	public Finance() {
	}

	public Finance(Emp emp, Integer ta, Integer da, String bonous) {
		this.emp = emp;
		this.ta = ta;
		this.da = da;
		this.bonous = bonous;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "fin_id", unique = true, nullable = false)
	public Integer getFinId() {
		return this.finId;
	}

	public void setFinId(Integer finId) {
		this.finId = finId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "emp_id")
	public Emp getEmp() {
		return this.emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}

	@Column(name = "ta")
	public Integer getTa() {
		return this.ta;
	}

	public void setTa(Integer ta) {
		this.ta = ta;
	}

	@Column(name = "da")
	public Integer getDa() {
		return this.da;
	}

	public void setDa(Integer da) {
		this.da = da;
	}

	@Column(name = "bonous", length = 45)
	public String getBonous() {
		return this.bonous;
	}

	public void setBonous(String bonous) {
		this.bonous = bonous;
	}

}
