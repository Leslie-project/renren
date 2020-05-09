package com.leslie.renren.modules.sys.form;

public class PasswordForm {
    private String password;
    private String newPassword;
    private String userName;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public PasswordForm(String password, String newPassword, String userName) {
        this.password = password;
        this.newPassword = newPassword;
        this.userName = userName;
    }
}
