package inheritancePractice;

public class Singer extends Artist{
    public Singer(boolean isOnSpotify, boolean isonApple, boolean isOnTidal, String genre, String artistName, int billboardRank) {
        super(isOnSpotify, isonApple, isOnTidal, genre, artistName, billboardRank);
    }

    public Singer() {
        super(false,false,false,"Rock","Kurt Cobain",12);

    }
}
