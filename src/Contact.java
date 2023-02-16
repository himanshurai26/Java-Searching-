public class Contact {
    private String name;
    private String phoneNumbe;

    public Contact(String name, String phoneNumber){
        this.name = name;
        this.phoneNumbe = phoneNumber;
    }

    public String getName(){
        return name;

    }

    public String getPhoneNumbe(){
        return phoneNumbe;
    }

    public static Contact_createContact(String name, String phoneNumbe){
        return new Contact(name,phoneNumbe);
    }

}
