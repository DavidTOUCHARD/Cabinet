package eu.ensup.cabinet.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import eu.ensup.cabinet.dao.IMedecinDao;
import eu.ensup.cabinet.domaine.Medecin;
import eu.ensup.cabinet.domaine.Patient;
import eu.ensup.cabinet.service.MedecinService;

/**
 * @author David test unitaire de la classe medecin service
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class TestMedecinServiceV1 {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testLectureInfoMedecinV1() { // mock + stubbing
		Patient patient = new Patient(1, "TOUCHARD", "David", "tousse");
		IMedecinDao dao = Mockito.mock(IMedecinDao.class);

		MedecinService meds = new MedecinService(dao);
		Mockito.when(dao.readMedecin(2)).thenReturn(new Medecin(3, "Docteur", "HOUSE", patient, "generaliste"));

		Medecin medReturned = null;
		medReturned = meds.lireMedecin(2);

		Assert.assertEquals(medReturned.getPrenom(), "HOUSE");

	}
}
