package org.launchcode.techjobs_oo.tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    Job testJobObject1;
    Job testJobObject2;
    Job testJobObject3;
    Job testJobObject4;

    @Before
    public void createJobObjects(){
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
}
