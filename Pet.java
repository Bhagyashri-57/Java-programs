public class Pet {

    int id;
    String type;
    String name;

    static int count=0;

    public Pet(int id,String type,String name){
        this.id=id;
        this.type=type;
        this.name=name;
        count++;

    }
    public void updateName(String newName){
        this.name=newName;

    }
    public static void main(String[] args) {
        Pet p1 = new Pet(123,"Cat","Rana");
        Pet p2 = new Pet(456,"Dog","Luno");
        Pet p3 = new Pet(654,"Cat","Riku");
        Pet p4 = new Pet(876,"DOg","Stuffy");

        System.out.println("Number of pets " + Pet.count);

        System.out.println(p1.name);
        p1.updateName("Stuvert");
        System.out.println(p1.name);

        p2.updateName("Bhagya");
        System.out.println(p2.name);


    }

}

    

