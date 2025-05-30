package service;

import static org.junit.Assert.*;
import org.junit.Test;

public class OTest {

    // --- Start Portfolio Tests ---

    @Test
    public void testStartPortfolioValid() {
        assertEquals("Preparation Started", portfolio.startPortfolio("start"));
    }

    @Test
    public void testStartPortfolioInvalidTrigger() {
        assertNull(portfolio.startPortfolio("begin"));
    }

    @Test
    public void testStartPortfolioNullInput() {
        assertNull(portfolio.startPortfolio(null));
    }

    @Test
    public void testStartPortfolioEmptyInput() {
        assertNull(portfolio.startPortfolio(""));
    }

    // --- Select Grade Tests ---

    @Test
    public void testSelectGradeValid() {
        assertEquals("Distinction", portfolio.selectGrade("Distinction"));
    }

    @Test
    public void testSelectGradeEmpty() {
        assertNull(portfolio.selectGrade(""));
    }

    @Test
    public void testSelectGradeNull() {
        assertNull(portfolio.selectGrade(null));
    }

    // --- Upload Learning Summary Tests ---

    @Test
    public void testUploadLearningSummaryTrue() {
        assertTrue(portfolio.uploadLearningSummary("true"));
    }

    @Test
    public void testUploadLearningSummaryFalse() {
        assertFalse(portfolio.uploadLearningSummary("false"));
    }

    @Test
    public void testUploadLearningSummaryEmpty() {
        assertFalse(portfolio.uploadLearningSummary(""));
    }

    @Test
    public void testUploadLearningSummaryNull() {
        assertFalse(portfolio.uploadLearningSummary(null));
    }

    // --- Select Tasks Tests ---

    @Test
    public void testSelectTasksValid() {
        assertTrue(portfolio.selectTasks("task1,task2"));
    }

    @Test
    public void testSelectTasksSingle() {
        assertTrue(portfolio.selectTasks("task1"));
    }

    @Test
    public void testSelectTasksEmpty() {
        assertFalse(portfolio.selectTasks(""));
    }

    @Test
    public void testSelectTasksNull() {
        assertFalse(portfolio.selectTasks(null));
    }

    // --- Upload Other Files Tests ---

    @Test
    public void testUploadOtherFilesValid() {
        assertTrue(portfolio.uploadOtherFiles("Document File", "true"));
    }

    @Test
    public void testUploadOtherFilesInvalidType() {
        assertFalse(portfolio.uploadOtherFiles("Image File", "true"));
    }

    @Test
    public void testUploadOtherFilesNotUploaded() {
        assertFalse(portfolio.uploadOtherFiles("Document File", "false"));
    }

    @Test
    public void testUploadOtherFilesNullInput() {
        assertFalse(portfolio.uploadOtherFiles(null, null));
    }

    // --- Review Portfolio Tests ---

    @Test
    public void testReviewPortfolioTrue() {
        assertTrue(portfolio.reviewPortfolio("true"));
    }

    @Test
    public void testReviewPortfolioFalse() {
        assertFalse(portfolio.reviewPortfolio("false"));
    }

    @Test
    public void testReviewPortfolioEmpty() {
        assertFalse(portfolio.reviewPortfolio(""));
    }

    @Test
    public void testReviewPortfolioNull() {
        assertFalse(portfolio.reviewPortfolio(null));
    }
}
