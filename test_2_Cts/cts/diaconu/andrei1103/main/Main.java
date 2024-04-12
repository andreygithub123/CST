package cts.diaconu.andrei1103.main;

import cts.diaconu.andrei1103.factory.*;
import cts.diaconu.andrei1103.prototype.ConcertPoster;
import cts.diaconu.andrei1103.prototype.IPoster;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        //ex 1
        ShowFactory showFactory = new ConcertShowFactory();
        IShow concertShow = showFactory.createShow();
        concertShow.printDetails();

        showFactory = new StandupShowFactory();
        IShow standupShow= showFactory.createShow();
        standupShow.printDetails();

        showFactory = new TheatreShowFactory();
        IShow threatreShow = showFactory.createShow();
        threatreShow.printDetails();

        //ex 2
        IPoster theatrePoster= new ConcertPoster();
        IPoster theatrePosterClone = theatrePoster.clone();
        theatrePoster.print();
        theatrePosterClone.print();
    }
}
