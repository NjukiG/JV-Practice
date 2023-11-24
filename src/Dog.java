public class Dog {
    private double size;
    private String breed;
    private String name;

    public Dog(double dogSize, String dogBreed, String dogName){
        this.size = dogSize;
        this.breed = dogBreed;
        this.name = dogName;
    }

//    Setter (mutator ) methods.

    public void setSize(int dogSize){
        this.size = dogSize;
    }

    public void setBreed(String dogBreed){
        this.breed = dogBreed;
    }

    public void setName(String dogName){
        this.name = dogName;
    }

//    Getter (accessor ) methods
    public String getName(){
        return this.name;
    }

    public String getBreed(){
        return this.breed;
    }

    public int getSize(){
        return (int) this.size;
    }

    public void printDetails(){
        System.out.println(this.getName() + " is a beautiful " + this.getBreed() + " dog that weighs "+ this.getSize() + " pounds.");
        this.bark();
    }


    public void bark(){
        if(size > 60){
            System.out.println("Woof woof!");
        }else if(size > 20){
            System.out.println("Ruff ruff!");
        }else{
            System.out.println("Yip yip!");
        }
    }
}


