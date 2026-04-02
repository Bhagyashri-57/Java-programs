class Employee {
    int id;
    String name;
    double Salary;
    int age;

    public Employee(int id,String name,double Salary,int age){
        this.id=id;
        this.name=name;
        this.Salary=Salary;
        this.age=age;

    }
    public static void main(String[] args) {
        Employee e1 = new Employee(345,"Arun",56789,23);
        Employee e2= new Employee(456,"Anil",100000,21);
        Employee e3 = new Employee(123,"Asha",879089,20);

        Employee e4 = new Employee(324,"Shreya",200000,28);

        System.out.println(e1.age);
        System.out.println(e3.Salary);
        System.out.println(e2.name);
        System.out.println(e4.name);

        int a1 = e3.increment(2);
        System.out.println(a1);

        }
        public int increment(int a){
            return this.age+(this.age);
        }


        }


    


