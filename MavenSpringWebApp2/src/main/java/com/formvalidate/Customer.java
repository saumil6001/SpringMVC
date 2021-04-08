package com.formvalidate;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class Customer {

	@NotBlank(message = "is required")
	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private String firstName, lastName;

	@Email(message = "Please Enter Valid Email")
	private String email;

	@NotNull(message = "is reqired")
	@Past(message = "Plese Enter Valid Date")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dateOfBirth;

	
	
	

	public Customer() {	
		genderType= new LinkedList<String>();
		gifts= new String[4];
		gifts[0]="Mobile";
		gifts[1]="Giftcard";
		gifts[2]="Ipad";
		gifts[3]="TV";
		accountTypeOptions= new LinkedList<String>();
		genderType.add("Male");
		genderType.add("Female");
		accountTypeOptions.add("Saving");
		accountTypeOptions.add("CheckIn");
		accountTypeOptions.add("TFSA");	
	}


	
	
	
	
	
	
	@NotNull(message = "is reqired")
	private List<String> accountType;
	
	
	@NotNull(message = "is reqired")
	public List<String> getAccountType() {
		return accountType;
	}




	public void setAccountType(List<String> accountType) {
		this.accountType = accountType;
	}









	@NotNull(message = "is reqired")
	private List<String> accountTypeOptions;

	
	@NotNull(message = "is reqired")
	private String gender;
	
	private List<String> genderType;
	@NotNull(message = "is reqired")
	private String[] gifts;   

	
	@NotNull(message = "is reqired")
	private List<String> giftsSelected;
	
	

	

	public List<String> getAccountTypeOptions() {
		return accountTypeOptions;
	}




	public void setAccountTypeOptions(List<String> accountTypeOptions) {
		this.accountTypeOptions = accountTypeOptions;
	}




	public String getGender() {
		return gender;
	}




	public void setGender(String gender) {
		this.gender = gender;
	}




	public List<String> getGenderType() {
		return genderType;
	}




	public void setGenderType(List<String> genderType) {
		this.genderType = genderType;
	}




	public String[] getGifts() {
		return gifts;
	}




	public void setGifts(String[] gifts) {
		this.gifts = gifts;
	}




	public List<String> getGiftsSelected() {
		return giftsSelected;
	}




	public void setGiftsSelected(List<String> giftsSelected) {
		this.giftsSelected = giftsSelected;
	}


	
	
	
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
