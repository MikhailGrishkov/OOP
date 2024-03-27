package phone;

public class Phone2 {
    private int number;
    private String model;
    private int weight;

    public void receiveNumber(){
        System.out.println("Incoming call");

    }
    public void setNumber(int number){

        this.number=number;
    }
    public int getNumber(){

        return number;
    }
    public void setModel(String model){

        this.model=model;
    }
    public String getModel(){

        return model;
    }
    public void setWeight(int weight){

        this.weight=weight;
    }
    public int getWeight(){

        return weight;
    }
    public Phone2(int number, String model,int weight){
        this.number=number;
        this.model=model;
        this.weight=weight;
    }
}


