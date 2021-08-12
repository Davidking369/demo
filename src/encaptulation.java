

public class encaptulation {

    private String name ;
    private String Email;
    private long  ACno;
    private float amount;

    public String getName(){
        return name;

}


    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public long getACno() {
        return ACno;
    }

    public void setACno(long ACno) {
        this.ACno = ACno;
    }

    public float getAmount() {
        return amount;
      }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}
class Customer
   {
public static void main(String[] args)
{    encaptulation n =new encaptulation();
n.setName("David");
n.setACno(1662);
n.setEmail("jardivad@gmail.com");
n.setAmount(400000);
n.getName();
n.getAmount();
n.getACno();
n.getEmail();
System.out.println("Account holder name:"+n.getName());
    System.out.println("AccountNumber:"+n.getACno());
    System.out.println("Email:"+n.getEmail());
    System.out.println("Balance:"+n.getAmount());
}}