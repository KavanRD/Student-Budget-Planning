package org.srm.sbp.model;

public class Questionary extends DomainObject {

	private String name;
	private String description;
	
	public String getDescription()
	{
		return description;
	}
	public void setDescription(String description)
	{
		this.description=description;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
		

}
