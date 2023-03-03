/**
 * Interfaces and classes which are agnostic to ROS version of ROS Services.
 *
 * @see <a href="https://github.com/pinorobotics/jros2services">Java client for ROS2 Services</a>
 * @see <a href="https://github.com/pinorobotics/jros1services">Java client for ROS1 Services</a>
 * @see <a href="https://github.com/pinorobotics/jrosservices/releases">Download</a>
 * @see <a href="https://github.com/pinorobotics/jrosservices">GitHub repository</a>
 * @author lambdaprime intid@protonmail.com
 */
module jrosservices {

    // since many of our API relies on jrosclient classes we need to ensure
    // that all modules reading this module also read jrosclient
    requires transitive jrosclient;
    requires id.xfunction;

    exports pinorobotics.jrosservices;
    exports pinorobotics.jrosservices.msgs;
    exports pinorobotics.jrosservices.exceptions;
}
