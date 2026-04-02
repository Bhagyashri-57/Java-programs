class Movie {
    String title;
    String hero;
    String heroine;
    int year;

    public Movie(String title,String hero,String heroine,int year){
        this.title=title;
        this.hero=hero;
        this.heroine=heroine;
        this.year=year;
    }


        public static void main(String[]args){
            Movie m1 = new Movie("Hero","Nani","Anushka",2012);
            Movie m2 = new Movie("Arya","Shivarajkumar","Janaki",2002);
            Movie m3 = new Movie("Milana","Puneeth","Sushma",2005);
            Movie m4 = new Movie("Akash","Abhi","Reshma",2009);
            Movie m5 = new Movie("Appu","Yash","Ashika",2025);

            System.out.println(m1.title);
            System.out.println(m2.hero);
            System.out.println(m3.heroine);
            System.out.println(m4.year);
            System.out.println(m5.hero);


            int y1= m4.increment(2);
                System.out.println(y1);


            }

            public int increment(int a){
                return this.year+(this.year);

            }




        }
        


