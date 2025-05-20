package sit707_week4;

import org.junit.Assert;
import org.junit.Test;

public class LoginFormTest {

    @Test
    public void testStudentIdentity() {
        String studentId = "224234399";  // Your student ID
        Assert.assertNotNull("Student ID is null", studentId);
    }

    @Test
    public void testStudentName() {
        String studentName = "Ritik Gupta";  // Your name
        Assert.assertNotNull("Student name is null", studentName);
    }

    // TC1: Username -, Password -, ValidationCode -
    @Test
    public void testTC1() {
        LoginStatus status = LoginForm.login("", "");
        Assert.assertFalse(status.isLoginSuccess());
        Assert.assertEquals("Empty Username", status.getErrorMsg());
    }

    // TC2: Username -, Password W
    @Test
    public void testTC2() {
        LoginStatus status = LoginForm.login("", "wrong");
        Assert.assertFalse(status.isLoginSuccess());
        Assert.assertEquals("Empty Username", status.getErrorMsg());
    }

    // TC3: Username -, Password C
    @Test
    public void testTC3() {
        LoginStatus status = LoginForm.login("", "ahsan_pass");
        Assert.assertFalse(status.isLoginSuccess());
        Assert.assertEquals("Empty Username", status.getErrorMsg());
    }

    // TC4: Username W, Password W
    @Test
    public void testTC4() {
        LoginStatus status = LoginForm.login("wrong", "wrong");
        Assert.assertFalse(status.isLoginSuccess());
        Assert.assertEquals("Credential mismatch", status.getErrorMsg());
    }

    // TC5: Username W, Password C
    @Test
    public void testTC5() {
        LoginStatus status = LoginForm.login("wrong", "ahsan_pass");
        Assert.assertFalse(status.isLoginSuccess());
        Assert.assertEquals("Credential mismatch", status.getErrorMsg());
    }

    // TC6: Username W, Password -
    @Test
    public void testTC6() {
        LoginStatus status = LoginForm.login("wrong", "");
        Assert.assertFalse(status.isLoginSuccess());
        Assert.assertEquals("Empty Password", status.getErrorMsg());
    }

    // TC7: Username C, Password W
    @Test
    public void testTC7() {
        LoginStatus status = LoginForm.login("ahsan", "wrong");
        Assert.assertFalse(status.isLoginSuccess());
        Assert.assertEquals("Credential mismatch", status.getErrorMsg());
    }

    // TC8: Username C, Password C, ValidationCode X
    @Test
    public void testTC8() {
        LoginStatus status = LoginForm.login("ahsan", "ahsan_pass");
        Assert.assertTrue(status.isLoginSuccess());
        Assert.assertEquals("123456", status.getErrorMsg());
    }

    // TC9: Username C, Password C, ValidationCode -
    @Test
    public void testTC9() {
        boolean isValid = LoginForm.validateCode("");
        Assert.assertFalse(isValid);
    }

    // TC10: Username C, Password C, ValidationCode W
    @Test
    public void testTC10() {
        boolean isValid = LoginForm.validateCode("wrongcode");
        Assert.assertFalse(isValid);
    }

    // TC11: Username C, Password C, ValidationCode C
    @Test
    public void testTC11() {
        boolean isValid = LoginForm.validateCode("123456");
        Assert.assertTrue(isValid);
    }
}
