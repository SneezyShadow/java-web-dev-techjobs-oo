package org.launchcode.techjobs_oo.Tests;
import org.junit.Assert;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

public class JobTests {

    @Test
    public void testSettingJobId(){
        Job testId = new Job();
        Job testId2 = new Job();
        Assert.assertEquals(1,testId.getId());
        Assert.assertEquals(2, testId2.getId());
    }
    @Test
    public void testJobConstructorSetsAllFields(){
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Assert.assertTrue(testJob instanceof Job);
    }
    @Test
    public void testJobsForEquality(){
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job testJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Assert.assertFalse(testJob.equals(testJob2));
    }
    @Test
    public void testIfHaveBlankLines(){
        Job testJobs = new Job();
        Assert.assertTrue(testJobs.toString().startsWith("\n"));
        Assert.assertTrue(testJobs.toString().endsWith("\n"));
    }
    @Test
    public void testForFormating(){
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Assert.assertTrue(testJob.toString().equals("\n" +
                "Id: " + testJob.getId() +
                "\nName: " + testJob.getName() +
                "\nEmployer: " + testJob.getEmployer() +
                "\nLocation: " + testJob.getLocation() +
                "\nPosition Type: " + testJob.getPositionType() +
                "\nCore Competency: " + testJob.getCoreCompetency() +
                "\n"));
    }



}
