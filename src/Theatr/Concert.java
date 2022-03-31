package Theatr;

public interface Concert {

    static void Show (Human[] human){
        System.out.println();
        System.out.println("Концерт начинается!!! ");
        for (Human value : human) {
            if (value instanceof Artyst) {
                System.out.println("Я артист " + ((Artyst) value).getAlias() + " я умею " + ((Artyst) value).getSkill());
            }
        }

    }

static void Present (Human[] human){
    System.out.println();
    System.out.println("В концерте участвуют : ");
    for (Human value : human) {
        if (value instanceof Artyst) {
            System.out.println("Я артист " + ((Artyst) value).getAlias() + " мне " + value.getAge());
        }
    }

    }

}
