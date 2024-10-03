
public class Person implements Comparable<Person>
{
	public String lastName;
	public String firstName;
	@Override
	public int compareTo(Person o)
	{
		return this.lastName.compareTo(o.lastName);
	}
	public static void main(String[] args) {
		Person p1 = new  Person();
		p1.firstName = "Sal";
		p1.lastName = "Zal";
		Person p2 = new Person();
		p2.firstName = "Pal";
		p2.lastName = "Wal";
		System.out.println(p1.compareTo(p2));

	}
}
