package api.model.user;

import api.model.workspace.Membership;

import java.util.List;

public class UserloggedResponse {
    private String id;
    private String email;
    private String name;
    private List<Membership> memberships;
    private String profilePicture;
    private String activeWorkspace;
    private String defaultWorkspace;
    private Settings settings;
    private String status;

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public List<Membership> getMemberships() { return memberships; }

    public void setMemberships(List<Membership> memberships) { this.memberships = memberships; }

    public String getProfilePicture() { return profilePicture; }

    public void setProfilePicture(String profilePicture) { this.profilePicture = profilePicture; }

    public String getActiveWorkspace() { return activeWorkspace; }

    public void setActiveWorkspace(String activeWorkspace) { this.activeWorkspace = activeWorkspace; }

    public String getDefaultWorkspace() { return defaultWorkspace; }

    public void setDefaultWorkspace(String defaultWorkspace) { this.defaultWorkspace = defaultWorkspace; }

    public Settings getSettings() { return settings; }

    public void setSettings(Settings settings) { this.settings = settings; }

    public String getStatus() { return status; }

    public void setStatus(String status) { this.status = status; }
}
