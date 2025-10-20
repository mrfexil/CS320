package contact;

public class Contact {
    private final String contactId;
    private String firstName;
    private String lastName;
    private String phone;
    private String address;

    public Contact(String contactId, String firstName, String lastName, String phone, String address) {
        if (contactId == null || contactId.length() > 10) {
            throw new IllegalArgumentException("Contact ID must not be null and must be <= 10 characters");
        }
        if (firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("First name must not be null and must be <= 10 characters");
        }
        if (lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("Last name must not be null and must be <= 10 characters");
        }
        if (phone == null || phone.length() != 10) {
            throw new IllegalArgumentException("Phone must not be null and must be 10 characters");
        }
        if (address == null || address.length() > 30) {
            throw new IllegalArgumentException("Address must not be null and must be <= 30 characters");
        }
        this.contactId = contactId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
    }

    public String getContactId() {
        return contactId;
    }

    public void setFirstName(String firstName) {
        System.out.println("Setting firstName: " + firstName);
        if (firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("First name must not be null and must be <= 10 characters");
        }
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        System.out.println("Setting lastName: " + lastName);
        if (lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("Last name must not be null and must be <= 10 characters");
        }
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setPhone(String phone) {
        System.out.println("Setting phone: " + phone);
        if (phone == null || phone.length() != 10) {
            throw new IllegalArgumentException("Phone must not be null and must be 10 characters");
        }
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setAddress(String address) {
        System.out.println("Setting address: " + address);
        if (address == null || address.length() > 30) {
            throw new IllegalArgumentException("Address must not be null and must be <= 30 characters");
        }
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}