// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    Feeder f1= new Feeder(5000);
   // f1.simulateOneDay(12);
    int foodday=f1.simulateManyDays(10, 10);
    System.out.println(f1.getCurrentFood());
System.out.println(foodday);
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}
