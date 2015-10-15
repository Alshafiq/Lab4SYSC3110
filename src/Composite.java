import java.util.ArrayList;
import java.util.List;

public class Composite extends Element{
	
	private List<Element> element_list;
	
	
	public Composite(String name)
	{
		super(name);
		element_list = new ArrayList<Element>();
	}
	
	public void addElement(Element e)
	{
		if(e != null)
		{
			element_list.add(e);
		}
		
	}
	
	public void removeElement(Element e)
	{
		if(e != null)
		{
			element_list.remove(e);
		}
	
	}
	
	public Element getChild(int i)
	{
		if( !(element_list.isEmpty()) )
		{
			return element_list.get(i);
		}
		return null;
	}
	
	public void printAllContent()
	{
		for(Element e : element_list)
		{
			if(e.getClass() == Composite.class)
			{
				Composite en = (Composite) e;
				System.out.print(en.getOpenTag() + "\n\t");
				en.printAllContent();
			}
			
			if(e.getClass() == Text.class)
			{
				Text en = (Text) e;
				System.out.print(en.getOpenTag());
				System.out.print(en.getText());
				System.out.print(en.getCloseTag() + "\n\t");
				
				{
					
				}
			}
			
		}
		
		for(int i = element_list.size()-1; i>=0; i--)
		{
			Element e = element_list.get(i);
			//if(e.getClass() == Text.class)
			//{
			//	Text en = (Text) e;
			//	System.out.println(en.getCloseTag());
			//}
			if(e.getClass() == Composite.class)
			{
				Composite en = (Composite) e;
				System.out.println(en.getCloseTag());
			}
		}
	}

}
