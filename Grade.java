public class Grade implements Comparable<Grade> //implements Comparable here
{

	public Character letter;

	//compareTo method here
	@Override
	public int compareTo(Grade o)
	{
		return this.letter.compareTo(o.letter);
	}
	public static void main(String [] args)
	{
		Grade g1 = new Grade();
		g1.letter ='D';
		Grade g2 = new Grade();
		g2.letter ='A';
		System.out.println(g1.compareTo(g2));
	}
}
