public class Programmer extends Person {

    private String language;

    /*public Programmer(){
        System.out.println("programmer created");
    }*/

    public Programmer(String firstName, int age, String language) {
        super(firstName, age);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void program() {
        System.out.println("programming in " + language);
    }

    //@Override
    public void tellInfo() {
        super.tellInfo();
        this.program();
    }



   public String toString() {
        return super.toString() + " is programming in " + language;

    }
}







