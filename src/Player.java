public class Player {
    static Player getPlayer(String comand){
        if(comand.equals("easy")) return new Player(new EasyAi());
    }
}
