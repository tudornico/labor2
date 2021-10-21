package Labor2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BenutzerTest {
    public Benutzer create_unit_for_testing(){
        Basketball b1 = new Basketball();//55
        Basketball b2 =new Basketball();
        Fussball f1 = new Fussball();//6
        Fussball f2 = new Fussball();
        Hindernslauf h1= new Hindernslauf();//30
        Hindernslauf h2 = new Hindernslauf();
        Hochsprung hp1= new Hochsprung();//20
        Hochsprung hp2 = new Hochsprung();
        List<Sport> sport_list_1 =new ArrayList<Sport>();
        sport_list_1.add(b1);
        sport_list_1.add(b2);
        sport_list_1.add(h2);
        sport_list_1.add(hp1);

        Benutzer _b1 = new Benutzer("Tudor","Nicolaescu",sport_list_1);
        return _b1;
    }
    @Test
    void kalkuliereZeit() {
        Benutzer benutzer=create_unit_for_testing();
        assertEquals(160,benutzer.kalkuliereZeit());
    }

    @Test
    void testKalkuliereZeit() {
        Benutzer benutzer = create_unit_for_testing();
        assertEquals(110,benutzer.kalkuliereZeit(new Basketball()));
    }

    @Test
    void kalkuliereDurchschnittszeit() {
        Benutzer benutzer = create_unit_for_testing();
        assertEquals(40,benutzer.kalkuliereDurchschnittszeit());
    }
}