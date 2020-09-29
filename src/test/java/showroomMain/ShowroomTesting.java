package showroomMain;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ShowroomTesting {
    @Test
    public void minInvalidInputAddSUV(){
        Showroom showroom = new Showroom(100);
        showroom.addSedan(50);
        assertFalse(showroom.addSUV(0));
    }

    @Test
    public void minBoundaryInputAddSUV(){
        Showroom showroom = new Showroom(100);
        showroom.addSedan(50);
        assertTrue(showroom.addSUV(1));
    }
    @Test
    public void minValidInputAddSUV(){
        Showroom showroom = new Showroom(100);
        showroom.addSedan(50);
        assertTrue(showroom.addSUV(2));
    }
    @Test
    public void maxValidInputAddSUV(){
        Showroom showroom = new Showroom(100);
        showroom.addSedan(50);
        assertTrue(showroom.addSUV(49));
    }
    @Test
    public void maxBoundaryInputAddSUV(){
        Showroom showroom = new Showroom(100);
        showroom.addSedan(50);
        assertTrue(showroom.addSUV(50));
    }
    @Test
    public void maxInvalidInputAddSUV(){
        Showroom showroom = new Showroom(100);
        showroom.addSedan(50);
        assertFalse(showroom.addSUV(51));
    }

    @Test
    public void minInvalidInputAddSedan(){
        Showroom showroom = new Showroom(100);
        showroom.addSUV(50);
        assertFalse(showroom.addSedan(0));
    }

    @Test
    public void minBoundaryInputAddSedan(){
        Showroom showroom = new Showroom(100);
        showroom.addSUV(50);
        assertTrue(showroom.addSedan(1));
    }
    @Test
    public void minValidInputAddSedan(){
        Showroom showroom = new Showroom(100);
        showroom.addSUV(50);
        assertTrue(showroom.addSedan(2));
    }
    @Test
    public void maxValidInputAddSedan(){
        Showroom showroom = new Showroom(100);
        showroom.addSUV(50);
        assertTrue(showroom.addSedan(49));
    }
    @Test
    public void maxBoundaryInputAddSedan(){
        Showroom showroom = new Showroom(100);
        showroom.addSUV(50);
        assertTrue(showroom.addSedan(50));
    }
    @Test
    public void maxInvalidInputAddSedan(){
        Showroom showroom = new Showroom(100);
        showroom.addSUV(50);
        assertFalse(showroom.addSedan(51));
    }

    @Test
    public void minInvalidInputBuySUV(){
        Showroom showroom = new Showroom(100);
        showroom.addSUV(50);
        assertFalse(showroom.buySUV(0));
    }

    @Test
    public void minBoundaryInputBuySUV(){
        Showroom showroom = new Showroom(100);
        showroom.addSUV(50);
        assertTrue(showroom.buySUV(1));
    }
    @Test
    public void minValidInputBuySUV(){
        Showroom showroom = new Showroom(100);
        showroom.addSUV(50);
        assertTrue(showroom.buySUV(2));
    }
    @Test
    public void maxValidInputBuySUV(){
        Showroom showroom = new Showroom(100);
        showroom.addSUV(50);
        assertTrue(showroom.buySUV(49));
    }
    @Test
    public void maxBoundaryInputBuySUV(){
        Showroom showroom = new Showroom(100);
        showroom.addSUV(50);
        assertTrue(showroom.buySUV(50));
    }
    @Test
    public void maxInvalidInputBuySUV(){
        Showroom showroom = new Showroom(100);
        showroom.addSUV(50);
        assertFalse(showroom.buySUV(51));
    }

    @Test
    public void minInvalidInputBuySedan(){
        Showroom showroom = new Showroom(100);
        showroom.addSedan(50);
        assertFalse(showroom.buySedan(0));
    }

    @Test
    public void minBoundaryInputBuySedan(){
        Showroom showroom = new Showroom(100);
        showroom.addSedan(50);
        assertTrue(showroom.buySedan(1));
    }
    @Test
    public void minValidInputBuySedan(){
        Showroom showroom = new Showroom(100);
        showroom.addSedan(50);
        assertTrue(showroom.buySedan(2));
    }
    @Test
    public void maxValidInputBuySedan(){
        Showroom showroom = new Showroom(100);
        showroom.addSedan(50);
        assertTrue(showroom.buySedan(49));
    }
    @Test
    public void maxBoundaryInputBuySedan(){
        Showroom showroom = new Showroom(100);
        showroom.addSedan(50);
        assertTrue(showroom.buySedan(50));
    }
    @Test
    public void maxInvalidInputBuySedan(){
        Showroom showroom = new Showroom(100);
        showroom.addSedan(50);
        assertFalse(showroom.buySedan(51));
    }
    @Test
    public void NominalInvalidInputBuySedan(){
        Showroom showroom = new Showroom(100);
        showroom.addSedan(100);
        assertTrue(showroom.buySedan(51));
    }

}
