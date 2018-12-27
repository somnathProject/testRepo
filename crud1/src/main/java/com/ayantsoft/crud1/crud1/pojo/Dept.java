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
 * Dept generated by hbm2java
 */
@Entity
@Table(name = "dept", catalog = "employee1")
public class Dept implements java.io.Serializable {

	private Integer deptId;
	private String deptName;
	private String deptcol;
	private Set<Emp> emps = new HashSet<Emp>(0);

	public Dept() {
	}

	public Dept(String deptName, String deptcol, Set<Emp> emps) {
		this.deptName = deptName;
		this.deptcol = deptcol;
		this.emps = emps;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "dept_id", unique = true, nullable = false)
	public Integer getDeptId() {
		return this.deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	@Column(name = "dept_name", length = 45)
	public String getDeptName() {
		return this.deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Column(name = "deptcol", length = 45)
	public String getDeptcol() {
		return this.deptcol;
	}

	public void setDeptcol(String deptcol) {
		this.deptcol = deptcol;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "dept")
	public Set<Emp> getEmps() {
		return this.emps;
	}

	public void setEmps(Set<Emp> emps) {
		this.emps = emps;
	}

}