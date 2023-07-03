public class Main {
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Bechkam");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);

        Team<FootballPlayer> csk = new Team<>("CSK");

        System.out.println(adelaideCrows.numPlayers());

        Team<BaseballPlayer> baseballBoat = new Team<>("Baseball Boats");
        BaseballPlayer lakhan = new BaseballPlayer("Lakhan");
        baseballBoat.addPlayer(lakhan);
        baseballBoat.addPlayer(pat);

        Team<SoccerPlayer> susuSoccer = new Team<>("Susu Soccers");
        SoccerPlayer goli = new SoccerPlayer("Goli");
        susuSoccer.addPlayer(goli);
        susuSoccer.addPlayer(beckham);

        Team<SoccerPlayer> brokenTeam = new Team<>("This won't work");
        brokenTeam.addPlayer(beckham);

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team<FootballPlayer> banks = new Team<>("Gordon");

//        adelaideCrows.matchResult(susuSoccer,1,0);
        adelaideCrows.matchResult(adelaideCrows,1,0);

        System.out.println(adelaideCrows.ranking() + " is the ranking");

        System.out.println(adelaideCrows.compareTo(csk));
    }
}