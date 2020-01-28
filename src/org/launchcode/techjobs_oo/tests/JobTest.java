package org.launchcode.techjobs_oo.tests;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    static Job testJobObject1;
    static Job testJobObject2;
    static Job testJobObject3;
    static Job testJobObject4;
    static Job testJobObject5;

    @BeforeClass
    public static void createJobObjects(){
        testJobObject1 = new Job();
        testJobObject2 = new Job();
        testJobObject3 = new Job("Product tester",
                                new Employer("ACME"),
                                new Location("Desert"),
                                new PositionType("Quality control"),
                                new CoreCompetency("Persistence"));
        testJobObject4 = new Job("Product tester",
                                new Employer("ACME"),
                                new Location("Desert"),
                                new PositionType("Quality control"),
                                new CoreCompetency("Persistence"));
        testJobObject5 = new Job("Product tester",
                                new Employer(),
                                new Location("Desert"),
                                new PositionType("Quality control"),
                                new CoreCompetency());
    }

    @Test
    public void testSettingJobId(){
        assertEquals(1, testJobObject1.getId());
        assertEquals(2, testJobObject2.getId());
        assertFalse(testJobObject1.getId() == testJobObject2.getId());
        assertTrue(testJobObject1.getId() < testJobObject2.getId());
        assertEquals(1, testJobObject2.getId()-testJobObject1.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        assertTrue(testJobObject3.getName() instanceof String);
        assertEquals("Product tester", testJobObject3.getName());
        assertTrue(testJobObject3.getEmployer() instanceof Employer);
        assertEquals("ACME", testJobObject3.getEmployer().getValue());
        assertTrue(testJobObject3.getLocation() instanceof Location);
        assertEquals("Desert", testJobObject3.getLocation().getValue());
        assertTrue(testJobObject3.getPositionType() instanceof PositionType);
        assertEquals("Quality control", testJobObject3.getPositionType().getValue());
        assertTrue(testJobObject3.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Persistence", testJobObject3.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality(){
        assertEquals(false, testJobObject3 == testJobObject4);
    }

    @Test
    public void testForLeadBlankLine(){     // Check for /n
        assertTrue(testJobObject1.toString().startsWith("\n")); //(testJobObject3)
//        System.out.println(testJobObject1.toString());                    //debug
//        System.out.println(testJobObject1.toString().startsWith("/n"));   //debug
    }

    @Test
    public void testForTrailBlankLine(){     // Check for /n
        assertTrue(testJobObject1.toString().endsWith("\n")); //(testJobObject3)
    }

    @Test
    public void testForLabelsWithDataOnNewLines(){
        System.out.println(testJobObject3.toString());                    //debug
        System.out.println(testJobObject3.toString().startsWith("\n"));   //debug
        String expected = "\n" +
                "ID: 3\n" +
                "Name: Product tester\n" +
                "Employer: ACME\n" +
                "Location: Desert\n" +
                "Position Type: Quality control\n" +
                "Core Competency: Persistence\n";                        // put the expected value here
        assertEquals(expected, testJobObject3.toString());
        }

    @Test
    public void testForSomeNullFields(){
        System.out.println(testJobObject5.toString());                    //debug
        System.out.println(testJobObject5.toString().startsWith("\n"));   //debug
        String expected = "\n" +
                "ID: 5\n" +
                "Name: Product tester\n" +
                "Employer: Data not available\n" +
                "Location: Desert\n" +
                "Position Type: Quality control\n" +
                "Core Competency: Data not available\n";                        // put the expected value here
        assertEquals(expected, testJobObject5.toString());
    }

    @Test
    public void testForAllNullFields(){
        System.out.println(testJobObject1.toString());                    //debug
        System.out.println(testJobObject1.toString().startsWith("\n"));   //debug
        String expected = "\nOOPS! This job does not seem to exist.\n";
        assertEquals(expected, testJobObject1.toString());
    }

    }
