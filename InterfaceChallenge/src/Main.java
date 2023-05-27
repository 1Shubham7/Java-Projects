import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Mappable> mappables = new ArrayList<>();
        mappables.add(new Building("Sydney Townhall", UsageType.GOVERNMENT));
        mappables.add(new Building("Sydney Opera House", UsageType.ENTERTAINMENT));
        mappables.add(new Building("Stadium Australia",UsageType.SPORTS));
        mappables.add(new UtilityLine("College St", UtilityType.FIBER_OPTICS));
        mappables.add(new UtilityLine("Olympic Blvd", UtilityType.WATER));


        for (var x : mappables){
            Mappable.mapIt(x);
        }

    }
}