package Guest;

public class Guest {
    private String name;
    private double money;

    public Guest(String name, double money){
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
//    public int getGuestArraySize(){
//        return guests.size();
} // end
