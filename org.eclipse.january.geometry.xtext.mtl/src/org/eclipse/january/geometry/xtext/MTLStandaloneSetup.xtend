/*
 * generated by Xtext 2.10.0
 */
package org.eclipse.january.geometry.xtext


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class MTLStandaloneSetup extends MTLStandaloneSetupGenerated {

	def static void doSetup() {
		new MTLStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
