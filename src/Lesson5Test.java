/**
 * Java 1. Homework 5. Task 1-5.
 *
 * @author Andrey Ievlev.
 * @version Dec 8, 2017.
 * @link https://github.com/OLskrain/Lesson5Test.git.
 */

public class Lesson5Test {
    public static void main(String[] args){
        //Task 1-3
        FellowWorker fellowWorker = new FellowWorker("Ievlev Andrey Mikhailovich", "Engineer", "Ols@ya.ru", "+79211234323", "56000p.", 27);
        FellowWorker fellowWorker1 = new FellowWorker("Konin Boris Anatol'evich","Security","35000p.", 41);

        fellowWorker.setFull_name("Romanov Denis Petrovich");
        System.out.println(fellowWorker.getFull_name());

        System.out.println(fellowWorker.toString());
        System.out.println(fellowWorker1.toString());
        System.out.println();

        //Task 4-5
        FellowWorker[] persArray = new FellowWorker[5];
        persArray[0] = new FellowWorker("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "+79231231200", "30000p.", 30);
        persArray[1] = new FellowWorker("Denisov Denis", "Accountant", "DenDen@yahoo.com", "+7929504732", "75000p.", 37);
        persArray[2] = new FellowWorker("Kovalev Alexander", "Brigadier", "Kovaln@yandex.ru", "+79236667323", "43000p.", 45);
        persArray[3] = new FellowWorker("Men'shikov Dima", "Director", "Ronin@gmail.com", "+79111471132", "100000p.", 63);
        persArray[4] = new FellowWorker("Nikitina Nina", "Programmer", "HikNin@mail.com", "+79051475532", "70000p.", 25);

        System.out.println("Employees over 40 years of age:");
        for(FellowWorker fellow : persArray){
            if(fellow.getAge() > 40){
                System.out.println(fellow);
            }
        }
    }
}
class FellowWorker{
    private String full_name;
    private String post;
    private String email;
    private String phone;
    private String salary;
    private int age;

    FellowWorker(String full_name, String post, String email, String phone, String salary, int age){
        this.full_name = full_name;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    FellowWorker(String full_name, String post, String salary, int age){
        this.full_name = full_name;
        this.post = post;
        this.salary = salary;
        this.age = age;
    }
    @Override
    public String toString(){
        return (full_name + ", " + post + " " + email + ", " + phone + ", " + salary + ", " + age);
    }
    void setFull_name(String full_name){
        this.full_name = full_name;
    }
    String getFull_name(){
        return full_name;
    }
    int getAge(){
        return age;
    }
}
