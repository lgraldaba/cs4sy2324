
public class Exercise01_Ph02Aldaba
{
    public static void main(String[] args)
    {

        String object1Name = "Pet cat";
        String object1Species = "Cat";
        int object1Age = 4;

        String object2Name = "Dog sa kalye";
        String object2Species = "Dog";
        int object2Age = 7;

        String object3Name = "Ako";
        String object3Species = "Human ata";
        int object3Age = 15;

        int result1 = object3Age - object1Age; //age difference of object3 and object1: result1
        boolean result2 = object1Name == object2Name; // object1 and object2 are the same species: result2
        int result3 = object1Age + object2Age + object3Age; //total age: result3

        System.out.println("Object1");
        System.out.println("Name: " + object1Name);
        System.out.println("Species: " + object1Species);
        System.out.println("Age: " + object1Age + "\n");

        System.out.println("Object2");
        System.out.println("Name: " + object2Name);
        System.out.println("Species: " + object2Species);
        System.out.println("Age: " + object2Age + "\n");

        System.out.println("Object3");
        System.out.println("Name: " + object3Name);
        System.out.println("Species: " + object3Species);
        System.out.println("Age: " + object3Age + "\n");

        System.out.println("age difference of object3 and object1: " + result1);
        System.out.println("object1 and object2 are the same species: " + result2);
        System.out.println("total age: " + result3);

    }
}
