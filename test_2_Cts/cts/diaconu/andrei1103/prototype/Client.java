package cts.diaconu.andrei1103.prototype;

import java.util.HashMap;
import java.util.Map;

public class Client {
    private Map<String, IPoster> posters = new HashMap<>();

    public Client() {
    }

    public IPoster create(String type) throws InterruptedException {
        IPoster posterToReturn = posters.get(type);
        if(posterToReturn == null)
        {
            System.out.println("[Posters have to be created]:");
            if(type=="Concert")
                posterToReturn = new ConcertPoster();
            else if (type=="Theatre")
                posterToReturn = new TheatrePoster();
            else
                posterToReturn = new StandupPoster();

            this.posters.put(type, posterToReturn);
        }

        return posterToReturn.clone();
    }
}
