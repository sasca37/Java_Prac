package abst.pet;

public class PetMain {
    public static void main(String[] args) {
        Pet cat = new Cat(false, 4);
        cat.run(getPetNmae(cat));

        Pet parrot = new Parrot(true, 2);
        parrot.run(getPetNmae(parrot));

        Parrot pr = (Parrot) parrot;
        pr.fly(getPetNmae(parrot));

        Pet upPet = pr;
    }

    public static String getPetNmae(Pet pet) {
        String str= "";
        if( pet instanceof Cat) {
            str = "고양이";
        }
        else if (pet instanceof Parrot) {
            str = "앵무새";
        }
        return str;
    }
}
