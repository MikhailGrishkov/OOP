package phone;

public class Main {
    public static void main(String[] args) {
       Phone1 phone = new Phone1(5655658,"Samsung",512);

       phone.receiveNumber();
       System.out.println(phone.getNumber());

       Phone2 phone2 = new Phone2(2544522,"Apple",544);

       phone.receiveNumber();
       System.out.println(phone2.getNumber());

       Phone3 phone3 = new Phone3(8888888, "LG", 450);
       phone.receiveNumber();
       System.out.println(phone3.getNumber());







}
}
