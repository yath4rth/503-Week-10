
public class Animal implements Comparable<Animal>
{
	public Double weight;
	@Override
	public int compareTo(Animal o)
	{
		return this.weight.compareTo(o.weight);
	}
	public static void main(String[] args) {
		Animal a = new Animal();
		a.weight = 100.0;
		Animal b = new Animal();
		b.weight = 4200.0;
		System.out.println(a.compareTo(b));

	}
}
