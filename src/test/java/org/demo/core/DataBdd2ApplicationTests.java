package org.demo.core;

import org.apache.commons.pool.impl.GenericKeyedObjectPool.Config;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = { DataBdd3Application.class, Config.class })
public abstract class DataBdd2ApplicationTests {

}
