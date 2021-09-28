import java.util.List;

public class Exercise1 {

    public static void main(String[] args) {

        Address a1 = new Address("qsdf", "qd");
        Address a2 = new Address("diestsevest", "Leuven");

        Person p1 = new Person("Sandy", 43, true);
        p1.setAddress(a2);
        Person p2 = new Person("Gero", 35, true, a1);

        Person p3 = new Person("other",29,false,new Address("my","address"));

        System.out.println("--------------------------------");
        p1.tellInfo("some sentence to repeat");



        Hobby h1 = new Hobby("ju jitsu");
        Hobby h2 = new Hobby("yoga");
        Hobby h3 = new Hobby("reading");
        Hobby h4 = new Hobby("inline skating");

        p1.addHobby(h1);
        p1.addHobby(h2);
        p1.addHobby(h3);
        p1.addHobby(h4);

        p1.removeHobby(h4);

        System.out.println("--------------------------------");
        List<Hobby> hobbies = p1.getHobbyList();
        System.out.println(hobbies);
        /*for (Hobby h : hobbies) {
            System.out.println(h.getName());
        }*/

        System.out.println("--------------------------------");
        Book b1 = new Book();
        p1.readBook(b1);

        System.out.println("--------------------------------");
        Programmer p = new Programmer("Sandy",43,"java");
        p.setAge(43);
        p.tellInfo();

       p.setLanguage("java");
       p.program();

        System.out.println("--------------------------------");

        Person[] persons = {p2,p};
        for (Person pers: persons){
            System.out.println(pers.getClass().getSimpleName());
            System.out.println(pers);
        }

        System.out.println(a1);



    }
}
