package studyprogramsmodel.example;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import studyprograms.Course;
import studyprograms.NTNU;
import studyprograms.StudyprogramsPackage;


public class Studyprograms {
	public static void main(String[] args) {
		ResourceSet resSet = new ResourceSetImpl();
		resSet.getPackageRegistry().put(StudyprogramsPackage.eNS_URI, StudyprogramsPackage.eINSTANCE);
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Resource resource = resSet.getResource(URI.createURI(Studyprograms.class.getResource("NTNU.xmi").toString()), true);
		NTNU dep = (NTNU) resource.getContents().get(0);
		//for (Course course : dep.getOwnsCourses()) {
		//	System.out.println(course);
		//}
		// Running own written constraints
		Diagnostic dig = Diagnostician.INSTANCE.validate(dep);
		System.out.println(dig.getSeverity());
	}

}
