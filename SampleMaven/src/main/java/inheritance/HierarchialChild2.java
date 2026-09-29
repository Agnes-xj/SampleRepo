package inheritance;

public class HierarchialChild2 extends HierarchialChild1 {
	public void display()
	{
		System.out.println("world");
		
	}

	public static void main(String[] args) {
		
		HierarchialChild2 obj = new HierarchialChild2();
		obj.print();
		obj.display();
	}

}
