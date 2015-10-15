
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		XMLDocument xml = new XMLDocument("XML Format");
		
		Composite e1 = new Composite("Course");
		Text e2 = new Text("Code");
		Text e3 = new Text("Prof");
		Composite e4 = new Composite("Class");
		Text e5 = new Text("Student");
		Text e6 = new Text("Student");
		
		e2.addText("SYSC3110");
		e3.addText("Babak");
		e5.addText("Micheal");
		e6.addText("Alan");
		
		e4.addElement(e5);
		e4.addElement(e6);
		
		xml.addElement(e1);
		xml.addElement(e2);
		xml.addElement(e3);
		xml.addElement(e4);
		
		xml.showAllElement();
		
	}

}
