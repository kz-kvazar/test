package tree;

public class Main {
    public static void main(String[] args) {

        InOut in = new InOut();
        Wood[] woodsArr = new Wood[3];

        for (int i= 0; i < woodsArr.length; i++ ){
            woodsArr [i] = new Wood(in.getNameTree(),in.getLenghts());
        }
        for (Wood wood : woodsArr) {
            System.out.println(wood.getNam() + " высотой " + wood.getLeg() + " метров");
        }
    }
}