public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();

        int miles = service.calculate(10_000_00);

        System.out.println(miles);
    }
}
