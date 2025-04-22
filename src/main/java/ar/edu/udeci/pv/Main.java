package ar.edu.udeci.pv;

import org.apache.commons.cli.*;
import org.apache.log4j.Logger;

public class Main {
    final static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("Aplicación iniciada.");

        Options options = new Options();
        options.addOption("h", "help", false, "Muestra ayuda");

        CommandLineParser parser = new DefaultParser();
        try {
            CommandLine cmd = parser.parse(options, args);
            if (cmd.hasOption("h")) {
                HelpFormatter formatter = new HelpFormatter();
                formatter.printHelp("Actividad2", options);
                logger.info("Se mostró la ayuda.");
            } else {
                logger.info("Ejecución normal sin ayuda.");
            }
        } catch (ParseException e) {
            logger.error("Error al parsear los argumentos", e);
        }
    }
}
