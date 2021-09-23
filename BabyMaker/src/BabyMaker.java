
public class BabyMaker
	{
		public static void main(String[] args)
			{
				Baby sarasBaby = new Baby("Juniper", 42.6, true);
				Baby myBaby = new Baby("Malcom", 7.5, false);
				
				System.out.println("Kaitlyn's first baby was " + myBaby.isGirl());
				System.out.println("Sara's first baby was " + sarasBaby.getWeight() + ".");
				
				myBaby.setName("Maive");
				System.out.println("Kaitlyn's first baby's ugly name is " + myBaby.getName());
				
				if (sarasBaby.getWeight() > 10)
					{
						sarasBaby.eat();
						myBaby.eat();
						System.out.println("Thats gonna be a very fat baby.");
					}
				else 
					{
						System.out.println("That's a perfect baby.");
					}
			
			}
	}
