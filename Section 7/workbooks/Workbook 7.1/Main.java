public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        person.name =  "Rishab";
        person.nationality = "USA";
        person.dateOfBirth = "02/03/2024";
        person.passport = new String[]{person.name, person.nationality, person.dateOfBirth};
        person.seatNumber = 2;

        System.out.println(person.name);
        System.out.println(person.nationality);
        System.out.println(person.dateOfBirth);
        System.out.println(person.passport);
        System.out.println(person.seatNumber);
    }
    


}
