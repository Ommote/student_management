package com.nology.users;

import java.util.ArrayList;
import java.util.List;

public class MockUsers {
    private List<Administrator> admins = new ArrayList<>();

    public void createAdmins(String firstname, String lastName) {
        admins.add(new Administrator(firstname, lastName));
    }

    public List<Administrator> getAdmins() {
        return admins;
    }

    public void setAdmins(List<Administrator> admins) {
        this.admins = admins;
    }
}
