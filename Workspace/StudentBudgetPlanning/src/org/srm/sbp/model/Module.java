package org.srm.sbp.model;

public class Module extends DomainObject {
	private String name;
	private String description;
	private Questionary questionary;
	
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public Questionary getQuestionary()
	{
		return questionary;
	}
	public void setQuestionary(Questionary questionary)
	{
		this.questionary= questionary;
	}
	
	public String getDescription()
	{
		return description;
	}
	public void setDescription(String description)
	{
		this.description=description;
	}
	
	
}
