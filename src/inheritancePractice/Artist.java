package inheritancePractice;

public class Artist {
    boolean isOnSpotify,isonApple,isOnTidal;
    String genre,artistName;
    int billboardRank;


    public Artist(boolean isOnSpotify, boolean isonApple, boolean isOnTidal, String genre, String artistName, int billboardRank) {
        this.isOnSpotify = isOnSpotify;
        this.isonApple = isonApple;
        this.isOnTidal = isOnTidal;
        this.genre = genre;
        this.artistName = artistName;
        this.billboardRank = billboardRank;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "isOnSpotify=" + isOnSpotify +
                ", isonApple=" + isonApple +
                ", isOnTidal=" + isOnTidal +
                ", genre='" + genre + '\'' +
                ", artistName='" + artistName + '\'' +
                ", billboardRank=" + billboardRank +
                '}';
    }

    public void areaMaster(){
        System.out.println(billboardRank>20?"Lollapalooza":"Madison Square Garden");
    }

    public String arenaMaster(){
        return (billboardRank>20?"Lollapalooza":"Madison Square Garden");
    }
}
