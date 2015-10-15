
public class XMLDocument {

	private Composite root;
	
	public XMLDocument(String name)
	{
		root = new Composite(name);
	}
	
	public void addElement(Element e)
	{
		root.addElement(e);
	}
	
	public void removeElement(Element e)
	{
		root.removeElement(e);
	}
	
	public void showAllElement()
	{
		root.printAllContent();
	}
	
	public String toString()
	{
		return root.toString();
	}
	
}
