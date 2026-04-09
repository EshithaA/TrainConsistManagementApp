class MainTest {
import org.junit.jupiter.api.Test;
import java.util.*;
import java.util.stream.Collectors;
import static org.junit.jupiter.api.Assertions.*;

    class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    public class TrainAppTest {

        @Test
        void testFilter_CapacityGreaterThan60() {

            List<Bogie> bogies = new ArrayList<>();
            bogies.add(new Bogie("Sleeper", 72));
            bogies.add(new Bogie("AC Chair", 60));
            bogies.add(new Bogie("First Class", 40));

            List<Bogie> result = bogies.stream()
                    .filter(b -> b.capacity > 60)
                    .collect(Collectors.toList());

            assertEquals(1, result.size());
            assertEquals("Sleeper", result.get(0).name);
        }
    }
}