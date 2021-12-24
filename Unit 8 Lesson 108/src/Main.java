public class Main {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("12535226");
        Contact contact = new Contact("Alex", "3251325");
        Contact contact1 = new Contact("Bob", "351325");
        Contact contact2 = new Contact("Mike", "547939442");
        mobilePhone.addNewContact(contact);
        mobilePhone.addNewContact(contact1);
        mobilePhone.addNewContact(contact2);
        mobilePhone.printContacts();
    }
}
