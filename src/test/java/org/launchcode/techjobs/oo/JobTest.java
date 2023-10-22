package org.launchcode.techjobs.oo;

import org.junit.Test;

import javax.xml.namespace.QName;

import static org.testng.Assert.assertNotEquals;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class JobTest {
    //TODO: Create your unit tests here

    @Test
    public void testSettingJobId() {
        Job test_job = new Job();
        Job second_test_job = new Job();
        assertNotEquals(test_job, second_test_job);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
//        Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//        assertTrue(test_job.getName().instanceof(test_job.name));
//        assertTrue(test_job.getEmployer().instanceof(Employer));
//        assertTrue(test_job.getLocation().instanceof(Location));
//        assertTrue(test_job.getPositionType().instanceof(PositionType));
//        assertTrue(test_job.getCoreCompetency().instanceof(CoreCompetency));
//        assertEquals(test_job.getName().equals(test_job.name));
//        assertEquals(test_job.getEmployer().getValue().equals(test_job.getEmployer()));
//        assertEquals(test_job.getLocation().getValue().equals(test_job.location));
//        assertEquals(test_job.getPositionType().getValue().equals(test_job.positionType));
//        assertEquals(test_job.getCoreCompetency().getValue().equals(test_job.coreCompetency));
    }

    @Test
    public void testJobsForEquality() {

    }
}
