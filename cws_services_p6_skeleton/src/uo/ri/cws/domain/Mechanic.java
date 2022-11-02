package uo.ri.cws.domain;

import java.util.HashSet;
import java.util.Set;

import uo.ri.util.assertion.ArgumentChecks;

public class Mechanic {
	// natural attributes
	private String dni;
	private String surname;
	private String name;

	// accidental attributes
	private Set<WorkOrder> assigned = new HashSet<>();
	private Set<Intervention> interventions = new HashSet<>();
	
	public Mechanic(String dni, String name, String surname) {
		ArgumentChecks.isNotBlank(dni);
		ArgumentChecks.isNotBlank(name);
		ArgumentChecks.isNotBlank(surname);
		this.dni = dni;
		this.name = name;
		this.surname = surname;
	}

	public String getDni() {
		return dni;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public Set<WorkOrder> getAssigned() {
		return new HashSet<>( assigned );
	}

	Set<WorkOrder> _getAssigned() {
		return assigned;
	}

	public Set<Intervention> getInterventions() {
		return new HashSet<>( interventions );
	}

	Set<Intervention> _getInterventions() {
		return interventions;
	}

}