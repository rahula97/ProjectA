package inheritancePractice;

public class Band extends Artist{

    int members;
    double netWorthInMillions;
    String topSong;

    public Band(boolean isOnSpotify, boolean isonApple, boolean isOnTidal, String genre, String artistName, int billboardRank, int members, double netWorthInMillions, String topSong) {
        super(isOnSpotify, isonApple, isOnTidal, genre, artistName, billboardRank);
        this.members = members;
        this.netWorthInMillions = netWorthInMillions;
        this.topSong = topSong;
    }

    @Override
    public String toString() {
        return "Band{" +
                "members=" + members +
                ", netWorthInMillions=" + netWorthInMillions +
                ", topSong='" + topSong + '\'' +
                ", isOnSpotify=" + isOnSpotify +
                ", isonApple=" + isonApple +
                ", isOnTidal=" + isOnTidal +
                ", genre='" + genre + '\'' +
                ", artistName='" + artistName + '\'' +
                ", billboardRank=" + billboardRank +
                '}';
    }

    @Override
    public void areaMaster() {
        System.out.println("Their Favorite Stadium to play is "+super.arenaMaster());
    }


}
