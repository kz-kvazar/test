package Theatr;

public class Skill extends Human {
    String skill;

    public Skill(String name, Integer age) {
        super(name, age);
        String[] skills = new String[] {"петь в опере", "играть рок", "танцевать диско", "танцевать в балете", "играть на гитаре","играть на барабане"};
        this.skill = skills[(int)Math.floor(Math.random()*(5+1))];
    }

    public String getSkill() {
        return skill;
    }
}
