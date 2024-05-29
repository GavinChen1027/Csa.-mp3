public class Feeder{
  private int currentfood;
  public Feeder(int c){
  currentfood=c;
  }
  public void simulateOneDay(int numbird){
    boolean bear=(int) (Math.random()*100+1)<=95;
    if (bear){
      int eaten = (int) (Math.random()*(50-10+1)+10);
      int totaleaten= eaten*numbird;
      if (totaleaten>currentfood){
        currentfood = 0;
      }
      else{
        currentfood-=totaleaten;
      }
    }
    else{
      currentfood=0;
    }
  }
  public int simulateManyDays(int numBirds, int numDays) {
    int curre=currentfood;
    int foodfound = 0;
    for (int i = 0; i < numDays && currentfood > 0; i++) {
        simulateOneDay(numBirds);
      // System.out.println(currentfood+"curr");
        if (currentfood <curre) {
            foodfound++;
            curre=currentfood;
        }
    }
    return foodfound;
  }
  public int getCurrentFood(){
    return currentfood;
  }
}
