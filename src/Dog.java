public class Dog {
    private double size;
    private String breed;
    private String name;

    public Dog(double dogSize, String dogBreed, String dogName){
        this.size = dogSize;
        this.breed = dogBreed;
        this.name = dogName;
    }

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


