package corbaObjects.letstalk.usermanager;

/**
 * corbaObjects/letstalk/usermanager/enum_typeHolder.java . Generated by the
 * IDL-to-Java compiler (portable), version "3.2" from letstalk.idl Sexta-feira,
 * 9 de Dezembro de 2005 18h26min29s BRST
 */

public final class enum_typeHolder implements org.omg.CORBA.portable.Streamable {
	public corbaObjects.letstalk.usermanager.enum_type value = null;

	public enum_typeHolder() {
	}

	public enum_typeHolder(
			corbaObjects.letstalk.usermanager.enum_type initialValue) {
		value = initialValue;
	}

	public void _read(org.omg.CORBA.portable.InputStream i) {
		value = corbaObjects.letstalk.usermanager.enum_typeHelper.read(i);
	}

	public void _write(org.omg.CORBA.portable.OutputStream o) {
		corbaObjects.letstalk.usermanager.enum_typeHelper.write(o, value);
	}

	public org.omg.CORBA.TypeCode _type() {
		return corbaObjects.letstalk.usermanager.enum_typeHelper.type();
	}

}