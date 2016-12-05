/*
 * generated by Xtext 2.10.0
 */
package fr.paris10.miage.ui;

import com.google.inject.Injector;
import fr.paris10.miage.SimpleJ.ui.internal.SimpleJActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class SimpleJExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return SimpleJActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return SimpleJActivator.getInstance().getInjector(SimpleJActivator.FR_PARIS10_MIAGE_SIMPLEJ);
	}
	
}