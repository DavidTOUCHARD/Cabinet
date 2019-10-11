package eu.ensup.cabinet.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import eu.ensup.cabinet.dao.IMedecinDao;
import eu.ensup.cabinet.dao.MedecinDao;
import eu.ensup.cabinet.domaine.Medecin;
import eu.ensup.cabinet.domaine.Patient;
import eu.ensup.cabinet.service.MedecinService;

@RunWith(MockitoJUnitRunner.class)
public class TestMedecinServiceV5 {

	@Mock
	IMedecinDao dao; // remplace le IMedecinDao dao=
						// Mockito.mock(IMedecinDao.class);
	@Spy
	MedecinDao medecinDao;

	@Spy
	List<String> spiedList = new ArrayList<String>();

	@InjectMocks
	private MedecinService service;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testLectureInfoMedecinV5() { // Test avec @InjectMocks
		Patient patient = new Patient(1, "TOUCHARD", "David", "tousse");
		medecinDao.readMedecin(2);
		Medecin test = Mockito.verify(medecinDao, Mockito.times(1)).readMedecin(2);

		Mockito.when(medecinDao.readMedecin(2)).thenReturn(new Medecin(3, "Docteur", "HOUSE", patient, "generaliste"));
	}

	@Test
	public void whenUseSpyAnnotation_thenSpyIsInjectedCorrectly() {
		spiedList.add("one");
		spiedList.add("two");

		Mockito.verify(spiedList).add("one");
		Mockito.verify(spiedList).add("two");

		Assert.assertEquals(2, spiedList.size());

		Mockito.doReturn(100).when(spiedList).size();
		Assert.assertEquals(100, spiedList.size());
	}

}
