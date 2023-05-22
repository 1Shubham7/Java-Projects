public class Main {
    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Shubham";
//        player.weapon = "Chain-Saw";
//        player.health = 20;
//
//        player.loseHealth(10);
//        System.out.println("Remaining health = "+ player.healthRemaining());
//
//        player.loseHealth(11);
//        player.health = 200;
//        System.out.println("Remaining Health = " + player.healthRemaining());

        EncapsulatedPlayer tim = new EncapsulatedPlayer("Shubham");
        System.out.println("Initial Health is " + tim.healthRemaining());



    }
}