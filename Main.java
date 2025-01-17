public class Main {

   public static void main(String []args) {
      String[] cows = {"cow1", "cow2", "cow3", "cow4", "cow5"};
      System.out.println(cows[0]);

      int[] luckyNums = {37, 7, 77, 777};
      int rand = (int) (Math.random() * (4 - 1 + 1)) + 1;
      System.out.println(luckyNums[(rand - 1)]);

      String[] mim = {"Yellow", "Ball", "Past", "Present"};
      System.out.println(mim[(rand - 1)]);

      boolean[] tftf = {true, false, true, false};
      if (rand == 4) {
         System.out.println(tftf[0]);
      }
      else if (rand == 1) {
         System.out.println(tftf[3]);
      }

      double[] prices = {5000.0, 3000.0, 8000.0, 6000.0, 12000.0};
      String[] dogNames = {"Elodie", "Elliot", "Elijah", "Mark", "Elena"};

      System.out.println(prices.length);
      System.out.println(dogNames.length);

      System.out.println(dogNames[0] + "the dog can be purchased for $" + prices[0]);

      System.out.println("\n\n___________________________________________________________________");
      
      for (int i = 0; i < 4; i++) {
         for (int o = 0; o < 4; o++) {
            System.out.print(cows[i] + "|");
            System.out.print(luckyNums[i] + "|");
            System.out.print(mim[i] + "|");
         }
         System.out.println("\n___________________________________________________________________");
      }
   }
}
