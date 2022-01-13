package org.eclipse.epsilon.emc.xtext;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory;
import org.eclipse.xtext.resource.ClassloaderClasspathUriResolver;

public class ClasspathXtextResourceFactory implements Factory {

	public ClasspathXtextResourceFactory() {
		
	}

	@Override
	public Resource createResource(URI uri) {
		ClassloaderClasspathUriResolver resolver = new ClassloaderClasspathUriResolver();
		uri = resolver.resolve(getClass().getClassLoader(), uri);
		return  Resource.Factory.Registry.INSTANCE.getFactory(uri).createResource(uri);
	}

}
