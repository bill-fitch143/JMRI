package jmri.jmrix.nce;

import jmri.util.JUnitUtil;

import org.junit.Assert;
import org.junit.jupiter.api.*;

/**
 *
 * @author Paul Bender Copyright (C) 2017
 */
public class NceClockControlTest {

    private NceTrafficControlScaffold tcis = null;

    @Test
    public void testCTor() {
        NceClockControl t = new NceClockControl(tcis,"N");
        Assert.assertNotNull("exists",t);
    }

    @BeforeEach
    public void setUp() {
        JUnitUtil.setUp();
        JUnitUtil.resetInstanceManager();
        tcis = new NceTrafficControlScaffold();
    }

    @AfterEach
    public void tearDown() {
        tcis = null;
        JUnitUtil.clearShutDownManager(); // put in place because AbstractMRTrafficController implementing subclass was not terminated properly
        JUnitUtil.tearDown();
    }

    // private final static Logger log = LoggerFactory.getLogger(NceClockControlTest.class);

}
