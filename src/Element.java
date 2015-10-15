
public class Element{
	
	private Tag openTag;
	private Tag closeTag;
	
	public Element(String e_name)
	{
		openTag = new Tag("<" + e_name + ">");
		closeTag = new Tag("</" + e_name + ">");
	}
	
	public String getOpenTag()
	{
		return openTag.toString();
	}
	
	public String getCloseTag()
	{
		return closeTag.toString();
	}
	
	
}
