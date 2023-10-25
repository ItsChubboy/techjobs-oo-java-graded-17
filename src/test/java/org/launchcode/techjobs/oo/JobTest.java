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
        Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(test_job.getName() instanceof String);
        assertTrue(test_job.getEmployer() instanceof Employer);
        assertTrue(test_job.getLocation() instanceof Location);
        assertTrue(test_job.getPositionType() instanceof PositionType);
        assertTrue(test_job.getCoreCompetency() instanceof CoreCompetency);
        assertEquals(test_job.getName(), "Product tester");
        assertEquals(test_job.getEmployer().toString(), test_job.getEmployer().getValue());
        assertEquals(test_job.getLocation().toString(), test_job.getLocation().getValue());
        assertEquals(test_job.getPositionType().toString(), test_job.getPositionType().getValue());
        assertEquals(test_job.getCoreCompetency().toString(), test_job.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
//        Job equality_test = new Job("Jiminy Cricket", new Employer("Blue Fairy"), new Location("Undefined"),
//                new PositionType("Conscience"), new CoreCompetency("Journalism"));
//        Job equality_test_2 = new Job("Jiminy Cricket", new Employer("Blue Fairy"), new Location("Undefined"),
//                new PositionType("Conscience"), new CoreCompetency("Journalism"));
//        assertEquals(equality_test, equality_test_2);
    }
}
