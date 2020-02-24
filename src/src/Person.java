public class Person {
    private String FName;
    private String LName;
    private String eMail;
    private String Number;

    public Person(String FName, String LName, String eMail, String Number) {
        this.FName = FName;
        this.LName = LName;
        this.eMail = eMail;
        this.Number = Number;
    }

    public String getFName() {
        return this.FName;
    }

    public void setFName(String fName) {
        this.FName = FName;
    }

    public String getLName() {
        return this.LName;
    }

    public void setLName(String lName) {
        this.LName = LName;
    }

    public String geteMail() {
        return this.eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getNumber() {
        return this.Number;
    }

    public void setNumber(String number) {
        this.Number = Number;
    }
}
