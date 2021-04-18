package ReviewClass10.Encapsulation;

public class FacebookAccount {
    private String email;
    private String password;

    public FacebookAccount(String email, String password) {
        setEmail(email);
    }

    public void resetPassword(){
        System.out.println( "An email has been "+ "SENT TO YOUR EMAIL id" + email+" CLICK ON THAT LINK TO RESET PASSWORDD");
    }
    public void setEmail(String email){
        if(email.contains("@")&& email.endsWith(".com")) {
            this.email = email;
        }else{
            System.out.println("your email is not correct");
        }


    }
}
