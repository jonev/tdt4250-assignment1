package studyprogramsmodel.example;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.jsoup.nodes.Document;

import studyprograms.Course;
import studyprograms.NTNU;
import studyprograms.StudyprogramsPackage;
import studyprograms.toHtml.ToHtmlParser;


public class Studyprograms {
	public static void main(String[] args) throws Exception {
		ToHtmlParser parser = new ToHtmlParser();
		EList<EObject> objects = parser.getResource(Studyprograms.class.getResource("NTNU.xmi").toString());
		Document doc = parser.createDocument((NTNU)objects.get(0));
		BufferedWriter writer = new BufferedWriter(new FileWriter("frakode.html"));
	    System.out.println(doc.toString());
		writer.write(doc.toString());   
	    writer.close();
	}

}
