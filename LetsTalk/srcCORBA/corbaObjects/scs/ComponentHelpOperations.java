package corbaObjects.scs;

/**
 * corbaObjects/scs/ComponentHelpOperations.java . Generated by the IDL-to-Java
 * compiler (portable), version "3.2" from deployment.idl Sexta-feira, 9 de
 * Dezembro de 2005 18h26min28s BRST
 */

public interface ComponentHelpOperations {
	String getHelpInfo(corbaObjects.scs.ComponentId id)
			throws corbaObjects.scs.ComponentNotFound,
			corbaObjects.scs.HelpInfoNotAvailable;
} // interface ComponentHelpOperations