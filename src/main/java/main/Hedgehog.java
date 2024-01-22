package main;

public class Hedgehog {
    private String name;
    private int age;

    public Hedgehog(){
        name = "Pikseli";
        age = 5;
    }
    public Hedgehog(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void message(String messag){
        if (messag == "") {
            System.out.println("I am "+name+" and my age is "+age+", but could you still give me input values?");
        }
        else{
            System.out.println(this.name+": "+messag);
        }
    }
    public void run(int lap){
        for(int i=0; i<lap;i++){
            System.out.println(this.name+" runs really fast!");
        }
    }
}
