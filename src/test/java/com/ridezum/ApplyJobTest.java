package com.ridezum;

import com.ridezum.Page.ApplyJobPage;
import com.ridezum.Page.CareersPage;
import com.ridezum.Page.HomePage;
import org.junit.Test;

public class ApplyJobTest extends BaseTest {


    private HomePage homePage;
    private CareersPage careersPage;
    private ApplyJobPage driverJobsPage;

    public ApplyJobTest(ApplyJobPage driverJobsPage) {
        this.driverJobsPage = driverJobsPage;
    }

    @Test
    public void testApplyJob() {
        homePage = new HomePage(driver);

    }




















}
