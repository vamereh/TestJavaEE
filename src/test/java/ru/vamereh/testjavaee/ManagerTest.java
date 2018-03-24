package ru.vamereh.testjavaee;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Test;
import org.junit.runner.RunWith;
import ru.vamereh.testjavaee.support.AppTest;

import javax.ejb.EJB;

@RunWith(Arquillian.class)
public class ManagerTest extends AppTest {

    @Deployment
    public static WebArchive createDeployment() {
        return createWAR().addClass("ru.vamereh.testjavaee.Manager");
    }

    private @EJB Manager manager;

    @Test
    public void execute_SendsDeliveries() throws Exception {
        manager.execute();
    }

}
