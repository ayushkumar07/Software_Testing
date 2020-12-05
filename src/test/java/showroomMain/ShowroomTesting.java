package showroomMain;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShowroomTesting {

    //Todo INVALID WEIGHTS
    @Test(expected = Exception.class)
    public void Test1() throws Exception {
        Showroom showroom = new Showroom();
        showroom.costDocument(false, 111114, 0);
    }
    @Test(expected = Exception.class)
    public void Test2() throws Exception {
        Showroom showroom = new Showroom();
        showroom.costOtherParcel(false, 111114, 5001);
    }
    @Test(expected = Exception.class)
    public void Test3() throws Exception {
        Showroom showroom = new Showroom();
        showroom.costDocument(false, 111114, 302);
    }

    //todo INVALID ZIP
    @Test(expected = Exception.class)
    public void Test4() throws Exception {
        Showroom showroom = new Showroom();
        showroom.costDocument(false, 111110, 50);
    }

    @Test(expected = Exception.class)
    public void Test5() throws Exception {
        Showroom showroom = new Showroom();
        showroom.costDocument(false, 10000000, 50);
    }

    //todo VALID
    @Test
    public void Test6() throws Exception {
        Showroom showroom = new Showroom();
        assertEquals(100,showroom.costDocument(false, 111111, 50));
    }
    @Test
    public void Test7() throws Exception {
        Showroom showroom = new Showroom();
        assertEquals(200,showroom.costDocument(true, 111111, 50));
    }
    @Test
    public void Test8() throws Exception {
        Showroom showroom = new Showroom();
        assertEquals(200,showroom.costDocument(false, 111111, 150));
    }
    @Test
    public void Test9() throws Exception {
        Showroom showroom = new Showroom();
        assertEquals(400,showroom.costDocument(true, 111111, 150));
    }

    @Test
    public void Test10() throws Exception {
        Showroom showroom = new Showroom();
        assertEquals(1500,showroom.costDocument(false, 2347899, 50));
    }
    @Test
    public void Test11() throws Exception {
        Showroom showroom = new Showroom();
        assertEquals(3000,showroom.costDocument(true, 2347899, 50));
    }
}
