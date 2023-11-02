package dominio.actors;

import dominio.Photo;
import dominio.Video;

import java.util.List;

public class Collaborator {
    private String name;
    private String lastName;
    private List<Photo> photos;
    private List<Video> videos;
    private String roleInCommunity;
    private String roleInResearch;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRoleInCommunity() {
        return roleInCommunity;
    }

    public void setRoleInCommunity(String roleInCommunity) {
        this.roleInCommunity = roleInCommunity;
    }

    public String getRoleInResearch() {
        return roleInResearch;
    }

    public void setRoleInResearch(String roleInResearch) {
        this.roleInResearch = roleInResearch;
    }

    public Collaborator(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getFullName() {
        String fullNameString ="First Name: " + this.name + " Last name: " + this.lastName;
        return fullNameString ;
    }
}
