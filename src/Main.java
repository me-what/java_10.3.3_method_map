import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Phone> phoneStream = Stream.of(new Phone("iPhone 6 S", 54000), new Phone("Lumia 950", 45000),
                new Phone("Samsung Galaxy S 6", 40000));
        phoneStream
                .map(p-> "название: " + p.getName() + ", цена: " + p.getPrice())
                .forEach(s->System.out.println(s));
// res:    название: iPhone 6 S, цена: 54000
//         название: Lumia 950, цена: 45000
//         название: Samsung Galaxy S 6, цена: 40000*/
    }
}