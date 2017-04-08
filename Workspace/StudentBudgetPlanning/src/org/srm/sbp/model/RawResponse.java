package org.srm.sbp.model;

public class RawResponse extends DomainObject
{
	private Questionary questionary;
	private Question question;
	private Module module;
	private String response;
	
	public String getResponse()
	{
		return response;
	}
	public void setResponse(String response)
	{
		this.response=response;
	}
	
	public Questionary getQuestionary()
	{
		return questionary;
	}
	public void setQuestionary(Questionary questionary)
	{
		this.questionary= questionary;
	}
	
	public Module getModule()
	{
		return module;
	}
	public void setModule(Module module)
	{
		this.module=module;
	}
	
	public Question getQuestion()
	{
		return question;
	}
	public void setQuestion(Question question)
	{
		this.question= question;
	}
}
