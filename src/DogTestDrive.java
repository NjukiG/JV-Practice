public class DogTestDrive {

    public static void main(String[] args){
        System.out.println("In the Dog tester!");

        Dog rex = new Dog(45, "German Shepherd", "Rex");
        Dog bear = new Dog(80, "Doberman", "Bear");
        Dog bud = new Dog(20, "Golden retriever", "Bud");

        bear.printDetails();
        bear.setSize(90);
        bear.printDetails();

        rex.printDetails();
        bud.printDetails();


    }
}
