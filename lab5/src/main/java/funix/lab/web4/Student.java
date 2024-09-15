package funix.lab.web4;

import java.util.LinkedHashMap;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private LinkedHashMap<String, String> countryOption;
	private String anotherCountry;
	private String favoriteLanguage;
	private String[] operatingSystems;
	
	public Student() {
		countryOption = new LinkedHashMap<String, String>();
		countryOption.put("BR", "Brazil");
		countryOption.put("FR", "France");
		countryOption.put("DE", "Germany");
		countryOption.put("IN", "India");
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOption() {
		return countryOption;
	}

	public void setCountryOption(LinkedHashMap<String, String> countryOption) {
		this.countryOption = countryOption;
	}

	public String getAnotherCountry() {
		return anotherCountry;
	}

	public void setAnotherCountry(String anotherCountry) {
		this.anotherCountry = anotherCountry;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	
	
}
