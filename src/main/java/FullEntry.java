public class FullEntry {
    private String id;
    private Name name;
    private String phone;

    public FullEntry(String id, Name name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Name getName() {
        return this.name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
