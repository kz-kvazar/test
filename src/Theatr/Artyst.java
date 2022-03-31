package Theatr;

public class Artyst extends Skill{

    private final String alias;


    public Artyst(String name, Integer age, String alias) {
        super(name, age);
        this.alias = alias;
        this.skill = new Skill(name,age).getSkill();
    }

    public String getSkill() {
        return skill;
    }

    public String getAlias() {
        return alias;
    }

}
