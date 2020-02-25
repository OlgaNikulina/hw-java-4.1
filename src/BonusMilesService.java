public class BonusMilesService {
    public int calculate(int cost) {
        int price = 20000;
        int rubles = 20;
        int miles = cost/ rubles;
        return miles;
    }
}
