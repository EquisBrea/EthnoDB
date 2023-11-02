package dominioTest;

import dominio.actors.Collaborator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CollaboratorTest {


    @Test
    public void collaboratorPruebaFullNameMethod() {
        Collaborator collab1 = new Collaborator("Anja", "Cizel");
        Assertions.assertEquals("First Name: Anja Last name: Cizel", collab1.getFullName());

}

}
