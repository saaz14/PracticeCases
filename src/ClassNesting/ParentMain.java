package ClassNesting;

public class ParentMain {
	
	public static void main(String[] args) {
		
		ParentClass Parent = new ParentClass();
		ParentClass.ChildClass Child = Parent.new ChildClass();
		
		System.out.println(Parent.x + " " + Child.y);
	}

}
