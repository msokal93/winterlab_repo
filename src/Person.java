
public abstract class Person implements Worker{
String Name;

public Person(String name) {
	super();
	Name = name;
}
 public final void Sallary(){}
@Override
public String toString() {
	return "Person [Name=" + Name + "]";
}
}
