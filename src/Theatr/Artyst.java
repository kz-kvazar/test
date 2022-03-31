package Theatr;

public class Artyst extends Skill{

    private final String alias;


    public Artyst(String name, Integer age, String alias) {
        super(name, age);
        this.alias = alias;
    }

    public String getSkill() {
        return skill;
    }

    public String getAlias() {
        return alias;
    }

}
