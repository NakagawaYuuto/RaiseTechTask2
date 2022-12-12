public class GameConsole {
    private String console;
    private int releaseDate;
    private String maker;

    //コンストラクタ
    public GameConsole(String console, int releaseDate, String maker){
        this.console = console;
        this.releaseDate = releaseDate;
        this.maker = maker;
    }

    public String getConsole() {
        return console;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public String getMaker() {
        return maker;
    }
}
