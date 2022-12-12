import java.util.List;

public class Main {
    public static void main(String[] args) {

        GameConsole ps5 = new GameConsole("PS5", 2020, "SONY");
        GameConsole ninntendoswitch = new GameConsole("Switch", 2017, "任天王");
        GameConsole xbox = new GameConsole("Xbox Series X/S", 2020, "Microsoft");

        //PS5だけを出力する
        System.out.println("英語名のコンソールを表示します。");
        System.out.println(ps5.getConsole() + ninntendoswitch.getConsole() + xbox.getConsole());

        //2020年に発売された物を出力する
        System.out.println("2020年に発売されたコンソールを表示します。");
        System.out.println(ps5.getConsole() + xbox.getConsole());

        //漢字の会社を出力する
        System.out.println("会社名が漢字を表示します。");
        System.out.println(ninntendoswitch.getMaker());

        List<GameConsole> gameConsoleList = List.of(
                new GameConsole("PS5", 2020, "SONY"),
                new GameConsole("Switch", 2017, "任天堂"),
                new GameConsole("Xbox Series X/S", 2020, "Microsoft")
        );

        gameConsoleList.forEach(gameConsole -> {
            System.out.println("ゲーム機の名前は" + gameConsole.getConsole());
            System.out.println("発売された年は" + gameConsole.getReleaseDate() + "年");
            System.out.println("発売した会社は" + gameConsole.getMaker());
        });

        //ifを使った条件分岐
        GameConsole gameConsole = new GameConsole("PS5", 2020, "SONY");

        if(gameConsoleList.equals("Switch")){
            System.out.println("在庫があります。");
        } else if (gameConsole.getConsole().equals("PS5")) {
            System.out.println("入荷の予定がありません。");
        } else if (gameConsoleList.equals("Xbox Series X/S")) {
            System.out.println("取り寄せになります。");
        }else {
            System.out.println("取り扱いがございません。");
        }
    }
}
