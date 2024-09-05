import com.abstracaobootcamp.entities.Bootcamp;
import com.abstracaobootcamp.entities.Content;
import com.abstracaobootcamp.entities.Course;
import com.abstracaobootcamp.entities.Developer;

public class Main {
    public static void main(String[] args) {
        // Exemplo usabilidade
        Bootcamp javaClaro = new Bootcamp("Bootcamp Java Developer", "Descrição Bootcamp Java Developer");

        Content poo = new Course("Java + POO", "Descrição POO", 20);
        Content spring = new Course("Java + Spring", "Descrição Spring", 50);

        javaClaro.addContent(poo);
        javaClaro.addContent(spring);

        Developer bruno = new Developer("Bruno");
        Developer joao = new Developer("João");

        bruno.singUpForBootcamp(javaClaro);
        joao.singUpForBootcamp(javaClaro);

        System.out.println(bruno.getRegisteredContent());

        System.out.println(bruno.calculateTotalXP());

        bruno.progress();

        System.out.println(bruno.calculateTotalXP());
        System.out.println(bruno.getRegisteredContent());

        bruno.progress();

        System.out.println(bruno.calculateTotalXP());
    }
}