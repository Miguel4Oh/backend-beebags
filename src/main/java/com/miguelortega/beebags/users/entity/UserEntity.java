package com.miguelortega.beebags.users.entity;

import com.miguelortega.beebags.employees.entity.EmployeeEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "users", schema = "maoh")
public class UserEntity {

	@Id
	@Column(name = "user_id", length = 36, updatable = false, nullable = false)
	private String userId;

	@Column(name = "username", length = 50, nullable = false, unique = true)
	private String username;

	@Column(name = "email", length = 100, unique = true)
	private String email;

	@Column(name = "password_hash", length = 255, nullable = false)
	private String password;

	/* Relación con employees: FK employee_id referencia employees.employee_id */
	@ManyToOne(optional = true)
	@JoinColumn(name = "employee_id", referencedColumnName = "employee_id", foreignKey = @ForeignKey(name = "fk_user_employee"))
	private EmployeeEntity employee;

	public UserEntity() {
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String passwordHash) {
		this.password = password;
	}

	public EmployeeEntity getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeeEntity employee) {
		this.employee = employee;
	}
}


