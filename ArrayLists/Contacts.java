public class Contacts
{
   private String fName, lName;
   private long phone;
   private String email;

   public Contacts()
   {
       phone = 0;
   }

    public void setfName(String fName) {
        this.fName = fName;
    }
    public String getfName() {
        return fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }
    public String getlName() {
        return lName;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }
    public long getPhone() {
        return phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

}
