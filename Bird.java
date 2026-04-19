
public class Bird {
    int id;
    String name;
    String color;
    static int count=0;

    public Bird(int id,String name,String color){
        this.id=id;
        this.name=name;
        this.color=color;
        count++;


        }
        public void updateName(String newName){
            this.name= newName;
        }
    
        public static void main(String[]args){
            Bird B1= new Bird(123,"Dove","White");
            Bird B2= new Bird(234,"Duck","Black");
            Bird B3= new Bird(565,"Swan","Blue");
            Bird B4= new Bird(345,"Sparrow","Pink");

            System.out.println("Total Birds = " + Bird.count);

            System.out.println("Name = "+B1.name);
            B1.updateName("Eagle");
            System.out.println("Updated Name = "+B1.name);


        }
        
    }

    

