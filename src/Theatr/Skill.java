package Theatr;

public class Skill extends Human {
    String skill;

    public Skill(String name, Integer age) {
        super(name, age);
        int digit  =(int)Math.floor(Math.random()*(5+1));
        String result = "";
        switch (digit) {
            case 0 :
                result = "петь в опере";
                break;
            case 1 :
                result = "играть рок";
                break;
            case 2 :
                result = "танцевать диско";
                break;
            case 3 :
                result = "танцевать в балете";
                break;
            case 4 :
                result = "играть на гитаре";
                break;
            case 5 :
                result = "играть на барабане";
                break;
        }
        this.skill = result;
    }

    public String getSkill() {
        return skill;
    }
}
