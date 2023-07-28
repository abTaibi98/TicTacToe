public class Player {
    private static enum symbol{X,O};
    //private enum chooseEnum = new symbol();
    private symbol chooseEnum = symbol.O;


    Player(int playerNum){
        if (playerNum == 1){
            this.chooseEnum = symbol.X;
        }
    }

    public symbol getChooseEnum() {
        return chooseEnum;
    }

    public void setChooseEnum(symbol chooseEnum) {
        this.chooseEnum = chooseEnum;
    }
}
