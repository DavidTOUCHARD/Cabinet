package eu.ensup.cabinet.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import eu.ensup.cabinet.dao.IMedecinDao;
import eu.ensup.cabinet.domaine.Medecin;
import eu.ensup.cabinet.domaine.Patient;
import eu.ensup.cabinet.service.MedecinService;

@RunWith(MockitoJUnitRunner.class)
public class TestMedecinServiceV3 {

	@Mock
	IMedecinDao dao;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testLectureInfoMedecinV3() { // @Mock + times
		Patient patient = new Patient(1, "TOUCHARD", "David", "tousse");
		// IMedecinDao dao = Mockito.mock(IMedecinDao.class);

		MedecinService meds = new MedecinService(dao);
		Mockito.when(dao.readMedecin(2)).thenReturn(new Medecin(3, "Docteur", "HOUSE", patient, "generaliste"));
		Mockito.when(dao.readMedecin(2)).thenReturn(new Medecin(3, "Docteur", "HOUSE", patient, "generaliste"));

		Medecin medReturned = null;
		medReturned = meds.lireMedecin(2);

		// On verifie que readMedecin avec 2 comme parametre a été appelé 1 fois
		Mockito.verify(dao, Mockito.times(1)).readMedecin(2);
		// On verifie que readMedecin a été appelé au moins 1 fois
		Mockito.verify(dao, Mockito.atLeast(1)).readMedecin(2);

	}

}
