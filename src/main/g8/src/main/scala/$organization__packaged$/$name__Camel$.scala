package $organization;format="package"$

import $organization;format="package"$.configuration.Configuration
import com.typesafe.scalalogging.LazyLogging

object $name;format="Camel"$ extends LazyLogging {
    def run(config:Configuration): Unit = logger.info(s"\${config.message}")
}