public class BonusMilesService {
    public int calculate(int price) {
        byte milePrice = 20;
        int miles = price / milePrice;
        return miles;
    }
}
