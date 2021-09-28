package be.abis.courseadmin.model;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Person  {
	
	private int personNumber;
	private String firstName;
	private String lastName;
	private LocalDate birthDate;
	private Company company;
	
	public Person(int personNumber, String firstName, String lastName, LocalDate birthDay) {
		this.personNumber = personNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDay;
	}

	public Person(int personNumber, String firstName, String lastName, LocalDate birthDate, Company company) {
		this(personNumber,firstName,lastName,birthDate);
		this.company = company;
	}

	public int getPersonNumber() {
		return personNumber;
	}

	public void setPersonNumber(int personNumber) {
		this.personNumber = personNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@Override
	public String toString() {
		String formattedDate= DateTimeFormatter.ofPattern("dd/MM/yyyy").format(this.getBirthDate());
		String text = "Person " + this.personNumber + ": " + this.firstName + " " +this.lastName + " was born on " + formattedDate+ ", and ";
		if (this.company != null) {
			text+= "works for " + this.company.getName() + " in " + this.company.getAddress().getTown() + ".";
		} else {
			text+= "is not employed for the moment.";
		}
		return text;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Person)) return false;
		Person person = (Person) o;
		return firstName.equals(person.firstName) &&
				lastName.equals(person.lastName) &&
				birthDate.equals(person.birthDate);
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName, birthDate);
	}

	public int calculateAge() {
		return Period.between(birthDate, LocalDate.now()).getYears();
	}
	
	
	
	
	
	
	
	

}
