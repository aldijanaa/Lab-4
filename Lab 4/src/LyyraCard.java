public class LyyraCard {
    private double balance;
    String name;


    public LyyraCard(double b) {    //constructor
        this.balance = b;
        this.name = n;
    }
    public String toString(){
       return "the card has: " + this.balance + "euros";
    }

    public void payEconomical() {
        //this.balance = this.balance - 2.5;  2nd part   or
        /*if(this.balance >= 2.5){
            this.balance = this.balance - 2.5;
        }*/

    }

    public void payGourmet() {
        //this.balance = this.balance - 4; 2nd part   or another way
        /*if(this.balance >= 4){
            this.balance = this.balance - 4;
        }*/


    }
    /*public void loadMoney(double amount) {
        this.balance = this.balance + amount;  //it will increase the balance
        if(this.balance > 150){  //if it's greater than we limiting the value
            this.balance = 150;
        }*/

    //part 4
    public void loadMoney(double amount) {
        this.balance = this.balance + amount;  //it will increase the balance
        if(amount > 0){
            this.balance = this.balance + amount;
            if(this.balance > 150){
                this.balance = 150;

            }
        }

    }
    public String toString(){
        return this.name + "the card has" + this.balance + "euros";
    }






}
