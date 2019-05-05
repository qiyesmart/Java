package teXing;

/**
 * Author:QiyeSmart
 * Created:2019/5/4
 */
public class testPerson {
    public static void main(String[] args){
        Person person=new Person();
        person.setName("aduo");
        person.setAge(21);
        person.setGender(Gender.MALE);
        System.out.println(person);
        //switch支持枚举
        switch(person.getGender()) {
            case MALE:
                System.out.println("男同志");
                break;
            case FEMALE:
                System.out.println("女同志");
                break;
              default:
                    System.out.println("未知");

        }
    }
}
