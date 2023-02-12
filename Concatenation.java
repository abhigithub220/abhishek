public class concatenation {
    public static void main(String args[]){
        String firstName = "abhishekkne101";
        String lastName = "gmail.com";
        String fullName = firstName + "@" + lastName;
        // String fullName = firstName + "@" + lastName;
        // System.out.println(fullName);
        
        // print length
        System.out.println(fullName.length());

        // charAt
        for(int i=0; i<fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }
    }
}
