package dominio.actors;


import java.util.HashSet;
import java.util.Set;

public class Community {
    private Set<Collaborator> collaborators;
    private String communityName;

    public Set<Collaborator> getCollaborators() {
        return collaborators;
    }
    public void setCommunityName (String nameofcommunity){
        this.communityName = nameofcommunity;
    }
    public String getName (){
        return this.communityName;
    }
    public Community() {
        this.collaborators = new HashSet<>();
    }

    public void addCollaborator(Collaborator collaborator) {
        this.collaborators.add(collaborator);
    }
    public void removeCollaborator(Collaborator collaborator){
        this.collaborators.remove(collaborator);
    }
    public boolean isPartofCommunity(Collaborator collaborator){
        return this.collaborators.contains(collaborator);
    }

    public int sizeCommunity() {
        return this.collaborators.size();
    }

}
