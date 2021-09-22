
public class Baby
	{
private String name;
private double weight;
private boolean isGirl;
		

public String getName()
	{
		return name;
	}

public void setName(String name)
	{
		this.name = name;
	}

public double getWeight()
	{
		return weight;
	}

public void setWeight(double weight)
	{
		this.weight = weight;
	}

public boolean isGirl()
	{
		return isGirl;
	}

public void setGirl(boolean isGirl)
	{
		this.isGirl = isGirl;
	}

public Baby(String n, double w, boolean g)
{
	name = n;
	weight = w;
	isGirl = g;
}

public static void eat()
{
	System.out.println("The baby is eating and gonna get fat.");
}
	}
