public class Buffer {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Bhagya");

        sb.append(" Patil");

        sb.length();

        sb.deleteCharAt(2);

        sb.insert(2,"a");

        sb.setLength(30);
        
        sb.ensureCapacity(10);

        System.out.println(sb);
    }
}
    
