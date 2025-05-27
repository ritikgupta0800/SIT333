package web.service;

import org.junit.Assert;
import org.junit.Test;

public class LoginServiceUnitTest {

    @Test public void testValidLogin() {
        Assert.assertTrue(LoginService.isValid("ritik", "ritik_pass", "2000-01-01"));
    }

    @Test public void testUsernameCaseSensitivity() {
        Assert.assertFalse(LoginService.isValid("RITIK", "ritik_pass", "2000-01-01"));
    }

    @Test public void testPasswordCaseSensitivity() {
        Assert.assertFalse(LoginService.isValid("ritik", "RITIK_PASS", "2000-01-01"));
    }

    @Test public void testWrongPassword() {
        Assert.assertFalse(LoginService.isValid("ritik", "wrong_pass", "2000-01-01"));
    }

    @Test public void testWrongUsername() {
        Assert.assertFalse(LoginService.isValid("wrong_user", "ritik_pass", "2000-01-01"));
    }

    @Test public void testWrongUsernameAndPassword() {
        Assert.assertFalse(LoginService.isValid("wrong", "wrong", "2000-01-01"));
    }

    @Test public void testNullUsername() {
        Assert.assertFalse(LoginService.isValid(null, "ritik_pass", "2000-01-01"));
    }

    @Test public void testNullPassword() {
        Assert.assertFalse(LoginService.isValid("ritik", null, "2000-01-01"));
    }

    @Test public void testNullUsernameAndPassword() {
        Assert.assertFalse(LoginService.isValid(null, null, "2000-01-01"));
    }

    @Test public void testEmptyUsername() {
        Assert.assertFalse(LoginService.isValid("", "ritik_pass", "2000-01-01"));
    }

    @Test public void testEmptyPassword() {
        Assert.assertFalse(LoginService.isValid("ritik", "", "2000-01-01"));
    }

    @Test public void testEmptyUsernameAndPassword() {
        Assert.assertFalse(LoginService.isValid("", "", "2000-01-01"));
    }

    @Test public void testLoginWithEmptyDob() {
        Assert.assertFalse(LoginService.isValid("ritik", "ritik_pass", ""));
    }

    @Test public void testLoginWithNullDob() {
        Assert.assertFalse(LoginService.isValid("ritik", "ritik_pass", null));
    }
}

