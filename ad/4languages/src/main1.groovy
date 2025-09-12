import org.codehaus.groovy.runtime.InvokerHelper

class Maing extends Script {
    def run() {
        println("Hello World")
    }

    static void main(String[] args) {
        InvokerHelper.runScript(Main, args)
    }
}