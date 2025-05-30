package web.service;

public class portfolio_service {

    public static String startPortfolio(String trigger) {
        try {
            if (trigger == null || trigger.isEmpty() || !trigger.equalsIgnoreCase("start")) {
                return null;
            }
            return "Preparation Started";
        } catch (Exception e) {
            return null;
        }
    }

    public static String selectGrade(String grade) {
        try {
            if (grade == null || grade.isEmpty()) {
                return null;
            }
            return grade;
        } catch (Exception e) {
            return null;
        }
    }

    public static boolean uploadLearningSummary(String uploaded) {
        try {
            if (uploaded == null || uploaded.isEmpty()) {
                return false;
            }
            return Boolean.parseBoolean(uploaded);
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean selectTasks(String tasksCSV) {
        try {
            if (tasksCSV == null || tasksCSV.isEmpty()) {
                return false;
            }
            String[] tasks = tasksCSV.split(",");
            return tasks.length > 0;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean uploadOtherFiles(String fileType, String uploaded) {
        try {
            if (fileType == null || uploaded == null || fileType.isEmpty() || uploaded.isEmpty()) {
                return false;
            }
            return Boolean.parseBoolean(uploaded) && fileType.equals("Document File");
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean reviewPortfolio(String allStepsComplete) {
        try {
            if (allStepsComplete == null || allStepsComplete.isEmpty()) {
                return false;
            }
            return Boolean.parseBoolean(allStepsComplete);
        } catch (Exception e) {
            return false;
        }
    }
}
