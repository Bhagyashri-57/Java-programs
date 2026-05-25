public class LibrarySearch {
    public static void main(String[] args) {

        String[] books = {
            "Java",
            "Python",
            "DBMS",
            "OS"
        };

        String search = "Java";

        boolean found = false;

        for(String book : books) {

            if(book.equals(search)) {
                found = true;
                break;
            }
        }

        if(found)
            System.out.println("Book Found");
        else
            System.out.println("Book Not Found");
    }
}