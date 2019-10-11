package eu.ensup.cabinet.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import eu.ensup.cabinet.dao.IMedecinDao;
import eu.ensup.cabinet.service.MedecinService;

@RunWith(MockitoJUnitRunner.class)
public class TestMedecinServiceV4 {

	@Mock
	IMedecinDao dao; // remplace le IMedecinDao dao=
						// Mockito.mock(IMedecinDao.class);

	@InjectMocks
	private MedecinService service;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testLectureInfoMedecinV4() { // Test avec @InjectMocks
		service.lireMedecin(2);
		// On verifie que readMedecin avec 2 comme parametre a été appelé 1 fois
		Mockito.verify(dao, Mockito.times(1)).readMedecin(2);

	}

}
