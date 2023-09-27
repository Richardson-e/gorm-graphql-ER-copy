import groovy.transform.CompileStatic

@CompileStatic
trait ExecutesClosures {

    static void withDelegate(Closure closure) {
        if (closure != null) {
            closure.resolveStrategy = Closure.DELEGATE_ONLY

            try {
                closure.call()
            } finally {
                closure.delegate = null
            }
        }
    }

}