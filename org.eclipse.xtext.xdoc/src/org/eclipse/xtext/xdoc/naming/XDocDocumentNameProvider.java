package org.eclipse.xtext.xdoc.naming;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.xdoc.xdoc.Identifiable;

public class XDocDocumentNameProvider extends DefaultDeclarativeQualifiedNameProvider {
	
	String qualifiedName(Identifiable identifiable) {
		return identifiable.getName();
	}
}
