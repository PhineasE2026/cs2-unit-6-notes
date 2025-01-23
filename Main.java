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
      
      String faveAnimals[] = new String[8];

      faveAnimals[0] = "dolphin";
      faveAnimals[1] = "dog";
      System.out.println(faveAnimals[2]);

      // length iw an array atirbute /prboerty

      int numCows = cows.length;
      System.out.println(numCows);

      // final index is always length - 1
      // lawlurz

      int lastCowIndex = cows.length - 1;
      System.out.println(cows[lastCowIndex]);

      // parallel array to hold info associated with another array
      String[] faveFoods = {"Gloop", "Shlimp", "Sharmp", "slivagado", "plingosten", "verstorgak", "ansklogoggan", "Fghorkin"};
      // with parallel ararays order matters!!!!!!!!!! >:( it matters! it does!!!
      System.out.println(cows[0] + "'s favorite food is " + faveFoods[0]);

      //Standardo faro loopo to traverso arrayos
      // example: stort ot forst indox, STOP
      // chonge by 1
      
      int[] countdown = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
      int[] downcount = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
      int[] updown = {5, 4, 3, 2, 1, 6, 7, 8, 9, 10};

      for (int i = countdown.length - 1; i > -1; i--) {
         System.out.print(downcount[i]);
         for (int e = downcount.length - 2; e > -1; e -= 2) {
            System.out.print(updown[i]);
         }
         System.out.println();
      }
      
      for (String boopers : cows) {
         System.out.print(boopers);
         for (int goopers : countdown) {
            System.out.print(goopers);
         }
         System.out.println();
         System.out.println("^-------------------^");
      }
   }
}
