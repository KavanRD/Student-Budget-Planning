package org.srm.sbp.model;

public class AllowedValues extends DomainObject 
{
	private String text;
	private String description;
	private AllowedValueGroup allowedValueGroup;
	
	public String getText()
	{
		return text;
	}
	
	public void setText(String text)
	{
		this.text=text;
	}
	
	
	public String getDescription()
	{
		return description;
	}
	
	public void setDescription(String description)
	{
		this.description= description;
	}
	
	public AllowedValueGroup getAllowedValueGroup()
	{
		return allowedValueGroup;
	}
	
	public void setAllowedValueGroup(AllowedValueGroup allowedValueGroup)
	{
		this.allowedValueGroup=allowedValueGroup;
	}
}
