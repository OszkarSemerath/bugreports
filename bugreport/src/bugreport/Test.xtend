package bugreport

import examplePackage.ExamplePackagePackage
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.query.runtime.emf.EMFScope

class Test {
	def static void main(String[] args) {
		ExamplePackagePackage.eINSTANCE.class
		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("xmi",new XMIResourceFactoryImpl)
		val resourceSet = new ResourceSetImpl
		val resource = resourceSet.getResource(URI.createURI('''model/instance.xmi''',true),true)
		val engine = ViatraQueryEngine.on(new EMFScope(resource))
		/*val matcher1= SwithToRightMatcher.on(engine)
		println('''|matches1| = «matcher1.countMatches»''')
		val matcher2= SwitchToRight2Matcher.on(engine)
		println('''|matches2| = «matcher2.countMatches»''')*/
		
	}
}