package day07;

public class Q09_SurviveMonkey {
    /*
		There is a lonely monkey in the island
		He needs to eat 4 bananas every day
		there are just 165 bananas in that island
		Create following variables and find how many days
		monkey can survive.
		Use do while loop, increment and decrement and if statements
		int numberOfBananas =165, survivalDays = 1;
		boolean monkeyAlive = true;
		*/

    public static void main(String[] args) {
        boolean monkeyAlive = true;
        int numberOfBananas = 165, survivalDays = 0 ;

        System.out.println("Maymunlar gunde 4 muz yer");
        do {
            numberOfBananas -= 4; // toplam muzdan 4 muz azalir
            survivalDays++; // yasadigi gun sayisini bir arttir
            if (numberOfBananas < 4) { // 4 den az muz kalirsa
                monkeyAlive = false;
                System.out.println("Bugun " + survivalDays + ". gun muz kalmadi ve maymun sizlere omur.");
            } else {
                System.out.println("Bugun " + survivalDays + ". gun ve maymun hala hayatta");
            }
        } while (monkeyAlive);
    }
}
