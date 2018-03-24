package ru.vamereh.testjavaee.support;

import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;

public class AppTest {

    protected static WebArchive createWAR() {
        return ShrinkWrap.create(WebArchive.class, "test.war")
                .addAsResource("META-INF/persistence.xml")
                .addAsResource("META-INF/eclipselink-orm.xml")
                .addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml");
    }

}
