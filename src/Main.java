
import java.util.Scanner;

public class Main
{
		public static void main(String[] args)
		{
			double priceBitcoin;
			double qualityBitcoin;

			System.out.println("What is Bitcoin price today?");
			priceBitcoin = getCorrectInteger();
			System.out.println("How much $ do you have?");
			qualityBitcoin = getCorrectInteger();

			double answer = qualityBitcoin/priceBitcoin;
			String regLine = String.format("%.7f", answer);

			System.out.println("You can buy " + regLine + " BTC");
		}

		private static double getCorrectInteger()
		{
				Scanner console = new Scanner(System.in);
				double value;

				while(true)
				{
						if (console.hasNextDouble())
						{
								value = console.nextDouble();
								return value;
						}
						else
						{
								System.out.println("Incorrect Value. Try again");
								console.next();
						}
				}
		}
}
