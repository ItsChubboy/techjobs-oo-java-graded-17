package org.launchcode.techjobs.oo;

import org.junit.Test;

import javax.swing.text.Position;
import javax.xml.namespace.QName;

import static org.testng.Assert.assertNotEquals;
import static org.testng.AssertJUnit.*;

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

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job test_job = new Job("Spy", new Employer("MI6"), new Location("London"),
                new PositionType("00 Agent"), new CoreCompetency("Gadget Proficiency"));
        String newline1 = System.lineSeparator();
        char newline = newline1.charAt(0);
        assertEquals(newline, test_job.toString().charAt(0));
        assertEquals(newline, test_job.toString().charAt(test_job.toString().length()-1));
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job test_job = new Job("Spy", new Employer("MI6"), new Location("London"),
                new PositionType("00 Agent"), new CoreCompetency("Gadget Proficiency"));
        String newline = System.lineSeparator();
        assertEquals(test_job.toString(), newline + "ID:  " + test_job.getId() +
                "\nName: " + test_job.getName() +
                "\nEmployer: " + test_job.getEmployer() +
                "\nLocation: " + test_job.getLocation() +
                "\nPosition Type: " + test_job.getPositionType() +
                "\nCore Competency: " + test_job.getCoreCompetency() + newline);
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job test_job = new Job("Spy", new Employer(""), new Location("London"),
                new PositionType(""), new CoreCompetency("Gadget Proficiency"));
        test_job.toString();
        System.out.println(test_job.toString());
        assertTrue(test_job.getEmployer().getValue() == "Data not available");
        assertTrue(test_job.getPositionType().getValue() == "Data not available");
    }
}
