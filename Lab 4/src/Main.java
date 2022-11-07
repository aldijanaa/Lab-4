import java.util.*;


public class Main {
    public static void main(String[] args) {

//task 1
        /*ArrayList<Integer> list1 = new ArrayList<Integer>();  //defining two arrays
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list1.add(4);  //adding elements to each array
        list1.add(3);

        list2.add(5);
        list2.add(10);
        list2.add(7);

        combine(list1, list2);  //calling combine method
        System.out.println(list1);
        System.out.println(list2);
        //task 2
        Dice dice = new Dice(6);
        int i = 0;
        while (i<10){
            System.out.println(dice.roll());
            i++;
        }
        System.out.println(dice); */

        //always call classes from main method, thorugh creating a new object
        //to string method will always executed

        //task 3
        LyyraCard card = new LyyraCard(10);  //creating object of class lyyracard
        System.out.println(card.toString());

        //task 3 2nd part
        /*card.payEconomical();
        System.out.println(card);

        card.payGourmet();

        card.payEconomical();
        System.out.println(card); */

        //task 3 3rd part
        /*System.out.println(card);

        card.payGourmet();
        System.out.println(card);

        card.payGourmet();
        System.out.println(card);

        //task 3 4th part
        card.loadMoney(15);
        System.out.println(card);

        card.loadMoney(10);
        System.out.println(card);

        card.loadMoney(200);
        System.out.println(card); */

        //task 3 5th part
        /*System.out.println("Pekka: " + card);
        card.loadMoney(-15);
        System.out.println("Pekka: " + card); */

        //task 3 6th part
        LyyraCard cardPekka = new LyyraCard(20);
        LyyraCard cardBrian = new LyyraCard(30);

    }
    

}
