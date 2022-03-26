package Plants;

public class Grass implements Plants{
double len;

    public double getLen() {
        return len;
    }

    public void setLen(double len) {
        this.len = len;
    }

    @Override
    public void plants(double lenghts) {

        len += lenghts;

        if (len > 0.5){
            len = 0.5;
            System.out.println("Трава не может вырасти выше " + len + " метра");
        } else {
            System.out.println("Высота травы " + len + " метра");
        }
    }
}
