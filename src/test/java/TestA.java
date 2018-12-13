/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.mycompany.mavenproject1.Array;
//import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class TestA {
    
    public TestA() {
    }
    
    //@Test
     @org.junit.Test
    public void addToEnd() {

        Array mass=new Array(3);
        mass.addToEnd(1);
        //assertEquals(1, mass.rtnElem(3));
        assertTrue(1==mass.rtnElem(3));

        
    }

    @org.junit.Test
    public void rtnElem() {
        Array mass=new Array(1);

        mass.addToEnd(1);
        mass.addToEnd(2);
        mass.addToEnd(3);
        mass.addToEnd(4);


        assertEquals(1, mass.rtnElem(1));
        assertEquals(2, mass.rtnElem(2));
        assertEquals(3, mass.rtnElem(3));
        assertEquals(4, mass.rtnElem(4));
    }

    @org.junit.Test
    public void substitute() {
        Array mass=new Array(1);

        mass.addToEnd(2);
        mass.substitute(10, 1);
        assertEquals(10, mass.rtnElem(1));
    }

    @org.junit.Test
    public void deleteIndex() {
        Array mass=new Array(1);

        mass.addToEnd(2);
        mass.deleteIndex(1);
        assertEquals(false, mass.find(2));

    }
}
