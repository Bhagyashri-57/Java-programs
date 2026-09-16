import java.util.*;
class Staff {
    String staffId;
    String name;
    long phone;
    double salary;

    void accept(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the StaffId: ");
        staffId=sc.next();
        System.out.println("Enter the Staff name: ");
        name=sc.next();
        System.out.println("Enter the Phone number: ");
        phone=sc.nextLong();
        System.out.println("Enter the Salary: ");
        salary=sc.nextDouble();
    }
    void display(){
        System.out.println("StaffId ="+staffId);
        System.out.println("Name ="+name);
        System.out.println("Phone Number ="+phone);
        System.out.println("Salary ="+salary);
    }
}
    class Teaching extends Staff{
        String domain;
        int n;
        public void accept(){
            super.accept();
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the Domain: ");
            domain=sc.next();
            System.out.println("Enter the number of publications:");
            n=sc.nextInt();

            
        }
        public void diaplay(){
            super.display();
            System.out.println("Domain ="+domain);
            System.out.println("Publications = "+n);
            }
        }
        class Technical extends Staff{
            String skill;
            public void accept(){
                super.accept();
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the Skills: ");
                skill=sc.next();
            }
            public void dispaly(){
                super.display();
                System.out.println("Skills ="+skill);

            }
        }


        class Contract extends Staff{
            int period;
            public void accept(){
                super.accept();
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter the PEriod: ");
                period=sc.nextInt();

            } 
            public void display(){
                super.display();
                System.out.println("Period = "+period);
            }

        }
        class Four{
            public static void main(String[]args){
                Teaching teach=new Teaching();
                System.out.println("Enter the Deatils of Teaching Staff: ");
                teach.accept();
                Technical tech=new Technical();
                System.out.println("Enter the Details of Technical Staff: ");
                tech.accept();
                Contract con=new Contract();
                System.out.println("Enter the Details of Contract Staff: ");
                con.accept();

                System.out.println("Details of Teaching Staff: ");
                teach.display();
                System.out.println("Details of Technical Staff :");
                tech.display();
                System.out.println("Deatils of Contract Staff: ");
                con.display();

            }

        }