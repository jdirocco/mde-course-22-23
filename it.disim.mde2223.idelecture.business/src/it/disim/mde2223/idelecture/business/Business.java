package it.disim.mde2223.idelecture.business;
//
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import Web.Attribute;
import Web.Entity;
import Web.WebApplication;
import Web.WebFactory;
import Web.WebPackage;
//
public class Business {


	
	public static void main (String [] args) throws IOException {
		Business bss = new Business("model.xmi");
		WebApplication app = bss.create();
		bss.serializeModel(app);
		WebApplication app2 = bss.load();
		System.out.println(bss.validate(app2)?"Valid":"Invalid");
		System.out.println(app.getEntities().size());
		app.getEntities().forEach(z->System.out.println(z.getName()));
	}
	
	
	public String getValue () {
		StringBuilder sb = new StringBuilder();
		sb.append("hello ");
		sb.append(path);
		
		return sb.toString();
	}
	

	
	public WebApplication create() {
		WebApplication model = WebFactory.eINSTANCE.createWebApplication();
		Entity entity1 = WebFactory.eINSTANCE.createEntity();
		entity1.setName("entity1");
		Entity entity2 = WebFactory.eINSTANCE.createEntity();
		entity2.setName("entity2");
		model.getEntities().add(entity1);
		model.getEntities().add(entity2);
		Attribute prop = WebFactory.eINSTANCE.createAttribute();
		prop.setName("prop1");
		return model;
	}
	
	
	
	public boolean validate(WebApplication wm) {
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(wm);
		if (diagnostic.getSeverity() == Diagnostic.ERROR)
			return false;
		else
			return true;
	}
	

	
	public WebApplication load() {
		EPackage.Registry.INSTANCE.put(WebPackage.eNS_URI, WebPackage.eINSTANCE);
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(URI.createURI(path), true);
		// Get the first model element and cast it to the right type, in my
		// example everything is hierarchical included in this first node
		WebApplication myWeb = (WebApplication) resource.getContents().get(0);
		System.out.println(myWeb);
		return myWeb;
	}
	
	public void serializeModel(WebApplication wm) throws IOException {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// create a resource
		Resource resource = resSet.createResource(URI.createURI(path));
		resource.getContents().add(wm);

		// now save the content.
		resource.save(Collections.EMPTY_MAP);
		
	}
	
	public Business (String name) {
		setPath(name);
	}
	private String path;

	public String getPath() {
		return path;
	}

	public void setPath(String name) {
		this.path = name;
	}
}
