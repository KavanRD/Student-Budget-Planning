package org.srm.sbp.model;

public class Question extends DomainObject {

	private String text;
	private String range;
	private String type;
	private String description;
	private AllowedValueGroup allowedValueGroup;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getRange() {
		return range;
	}

	public void setRange(String range) {
		this.range = range;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public AllowedValueGroup getAllowedValueGroup() {
		return allowedValueGroup;
	}
	
	public void setAllowedValueGroup(AllowedValueGroup allowedValueGroup) {
		this.allowedValueGroup = allowedValueGroup;
	}
	public String getDescription()
	{
		return description;
	}
	
	public void setDescription(String description)
	{
		this.description = description;
	}
	
}
