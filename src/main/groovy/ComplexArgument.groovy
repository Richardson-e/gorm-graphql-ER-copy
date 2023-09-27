
import groovy.transform.CompileStatic
import groovy.transform.InheritConstructors

/**
 * Used to create arguments to custom operations that are a custom (complex) type
 *
 * @author James Kleeh
 * @since 1.0.0
 */
@CompileStatic
@InheritConstructors
class ComplexArgument implements ExecutesClosures {

    String typeName

    ComplexArgument typeName(String typeName) {
        this.typeName = typeName
        this
    }


    void accepts(@DelegatesTo(strategy = Closure.DELEGATE_ONLY) Closure closure) {
        withDelegate(closure)
    }

}
