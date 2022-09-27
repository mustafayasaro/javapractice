package day07;

public class Q02_ForEach {

    // String[] list = {"fruits", "vegetables", "meat", "milk"};
    // print array with for each loop
    // print length of each element

    // Part 2:
    // Print all the elements from array using for eachLoop
    // If an element starts with 'v' then quit the loop

    public static void main(String[] args) {

        String[] list = {"fruits", "vegetables", "meat", "milk"};

        for (String each: list
             ) {
            System.out.print(each + " ");
            System.out.print(each.length() + " ");
            //fruits 6 vegetables 10 meat 4 milk 4
        }

        for (String each: list
             ) {
            if (each.startsWith("v")){
                break;
            }
            else {
                System.out.print(each); // fruits
            }
        }




    }
}
