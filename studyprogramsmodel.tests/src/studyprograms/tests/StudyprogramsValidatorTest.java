package studyprograms.tests;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import junit.framework.TestCase;
import studyprograms.NTNU;
import studyprograms.Semester;
import studyprograms.StudyPlan;
import studyprograms.StudyprogramsPackage;

public class StudyprogramsValidatorTest extends TestCase {

	
	private NTNU getResource() {
		ResourceSet resSet = new ResourceSetImpl();
		resSet.getPackageRegistry().put(StudyprogramsPackage.eNS_URI, StudyprogramsPackage.eINSTANCE);
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Resource resource = resSet.getResource(URI.createURI(StudyprogramsValidatorTest.class.getResource("ValidatorInstances.xmi").toString()), true);
		return (NTNU) resource.getContents().get(0);
	}
	
	
	/**
	 * @generated NOT
	 */
	public void testValidateSemester_coursesHasRightLevel() {
		NTNU ntnu = getResource();
		
		// Semester with error
		Semester semester = ntnu.getStudyplan().get(0).getSemester().get(0);
		Diagnostic dig = Diagnostician.INSTANCE.validate(semester);
		boolean errorFound = false;
		for(Diagnostic d: dig.getChildren()) {
			//System.out.println(d.toString());
			if(d.getMessage().contains("coursesHasRightLevel")) {
				errorFound = true;
			}
		}
		assertTrue(errorFound);
		
		// Semester without errors
		semester = ntnu.getStudyplan().get(0).getSemester().get(1);
		dig = Diagnostician.INSTANCE.validate(semester);
		errorFound = false;
		for(Diagnostic d: dig.getChildren()) {
			//System.out.println(d.toString());
			if(d.getMessage().contains("coursesHasRightLevel")) {
				errorFound = true;
			}
		}
		assertFalse(errorFound);
		
	}
	
	/**
	 * @generated NOT
	 */
	public void testValidateSemester_taughtAtTheRigthTimeOfTheYear() {
		NTNU ntnu = getResource();
		
		// Semester with error
		Semester semester = ntnu.getStudyplan().get(0).getSemester().get(0);
		Diagnostic dig = Diagnostician.INSTANCE.validate(semester);
		boolean errorFound = false;
		for(Diagnostic d: dig.getChildren()) {
			//System.out.println(d.toString());
			if(d.getMessage().contains("taughtAtTheRigthTimeOfTheYear")) {
				errorFound = true;
			}
		}
		assertTrue(errorFound);
		
		
		// Semester without errors
		semester = ntnu.getStudyplan().get(0).getSemester().get(1);
		dig = Diagnostician.INSTANCE.validate(semester);
		errorFound = false;
		for(Diagnostic d: dig.getChildren()) {
			//System.out.println(d.toString());
			if(d.getMessage().contains("taughtAtTheRigthTimeOfTheYear")) {
				errorFound = true;
			}
		}
		assertFalse(errorFound);
	}
}
