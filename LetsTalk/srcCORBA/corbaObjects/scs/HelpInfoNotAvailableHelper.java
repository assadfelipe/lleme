package corbaObjects.scs;

/**
 * corbaObjects/scs/HelpInfoNotAvailableHelper.java . Generated by the
 * IDL-to-Java compiler (portable), version "3.2" from deployment.idl
 * Sexta-feira, 9 de Dezembro de 2005 18h26min28s BRST
 */

abstract public class HelpInfoNotAvailableHelper {
	private static String _id = "IDL:corbaObjects/scs/HelpInfoNotAvailable:1.0";

	public static void insert(org.omg.CORBA.Any a,
			corbaObjects.scs.HelpInfoNotAvailable that) {
		org.omg.CORBA.portable.OutputStream out = a.create_output_stream();
		a.type(type());
		write(out, that);
		a.read_value(out.create_input_stream(), type());
	}

	public static corbaObjects.scs.HelpInfoNotAvailable extract(
			org.omg.CORBA.Any a) {
		return read(a.create_input_stream());
	}

	private static org.omg.CORBA.TypeCode __typeCode = null;

	private static boolean __active = false;

	synchronized public static org.omg.CORBA.TypeCode type() {
		if (__typeCode == null) {
			synchronized (org.omg.CORBA.TypeCode.class) {
				if (__typeCode == null) {
					if (__active) {
						return org.omg.CORBA.ORB.init()
								.create_recursive_tc(_id);
					}
					__active = true;
					org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember[0];
					org.omg.CORBA.TypeCode _tcOf_members0 = null;
					__typeCode = org.omg.CORBA.ORB.init().create_exception_tc(
							corbaObjects.scs.HelpInfoNotAvailableHelper.id(),
							"HelpInfoNotAvailable", _members0);
					__active = false;
				}
			}
		}
		return __typeCode;
	}

	public static String id() {
		return _id;
	}

	public static corbaObjects.scs.HelpInfoNotAvailable read(
			org.omg.CORBA.portable.InputStream istream) {
		corbaObjects.scs.HelpInfoNotAvailable value = new corbaObjects.scs.HelpInfoNotAvailable();
		// read and discard the repository ID
		istream.read_string();
		return value;
	}

	public static void write(org.omg.CORBA.portable.OutputStream ostream,
			corbaObjects.scs.HelpInfoNotAvailable value) {
		// write the repository ID
		ostream.write_string(id());
	}

}