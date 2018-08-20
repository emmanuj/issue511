package issue511

import grails.gorm.transactions.Transactional
import io.micronaut.configuration.picocli.PicocliRunner
import io.micronaut.context.ApplicationContext

import picocli.CommandLine
import picocli.CommandLine.Command
import picocli.CommandLine.Option
import picocli.CommandLine.Parameters

@Command(name = 'issue511', description = '...',
        mixinStandardHelpOptions = true)
class Issue511Command implements Runnable {

    @Option(names = ['-v', '--verbose'], description = '...')
    boolean verbose

    static void main(String[] args) throws Exception {
        PicocliRunner.run(Issue511Command.class, args)
    }

    @Transactional
    void run() {
        // business logic here
        if (verbose) {
            println "Hi!"
        }
    }
}
