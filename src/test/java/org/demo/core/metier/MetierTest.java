package org.demo.core.metier;

import java.util.List;

import org.demo.core.DataBdd2ApplicationTests;
import org.demo.core.entities.Client;
import org.demo.core.metier.Metier;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class MetierTest extends DataBdd2ApplicationTests {

	@Autowired
	protected Metier metier;
	
	@Test
	public void testFindAll(){		
		List<Client> res = metier.getAllClients();
		Assert.assertNotNull(res);
		Assert.assertTrue(res.size() >= 2);
	}


}
