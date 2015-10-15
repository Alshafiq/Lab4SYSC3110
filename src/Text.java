
public class Text extends Element{
	
	private String text;
	
	public Text(String name)
	{
		super(name);
	}

	public void addText(String t)
	{
		text = t;
	}
	
	public String getText()
	{
		return text;
	}
}
