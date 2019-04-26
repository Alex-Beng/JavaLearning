package MainPackage;

public class SubClass extends ParentClass {
	public SubClass(int t) {
		super.t = t;
		System.out.println("SubClass : " + super.t);
	}
}

