public class Main {

   public static void main(String []args) {
      String[] cows = {"cow1", "cow2", "cow3"};
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

      double[] prices = new double[5];
      String[] dogNames = new String[5];

      System.out.println(prices.length);
      System.out.println(dogNames.length);

      prices = {5000.0, 3000.0, 8000.0, 6000.0, 12000.0};
      dogNames = {"Elodie", "Elliot", "Elijah", "Mark", "Elena"};

      System.out.println(dogNames[0] + "the dog can be purchased for $" + prices[0]);
   }
}
