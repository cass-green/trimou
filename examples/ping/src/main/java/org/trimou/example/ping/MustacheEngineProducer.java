package org.trimou.example.ping;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

import org.trimou.engine.MustacheEngine;
import org.trimou.engine.MustacheEngineBuilder;
import org.trimou.engine.resolver.i18n.DateTimeFormatResolver;
import org.trimou.servlet.locator.ServletContextTemplateLocator;

/**
 *
 * @author Martin Kouba
 */
public class MustacheEngineProducer {

    /**
     * Make an instance of {@link MustacheEngine} an injectable resource. The
     * producer is application-scoped, so there's one engine per application.
     *
     * @return an instance of {@link MustacheEngine}
     */
    @Produces
    @ApplicationScoped
    public MustacheEngine produceMustacheEngine() {
        // CDI, servlet and PrettyTime resolvers are registered automatically
        return MustacheEngineBuilder
                .newBuilder()
                // Register lambda as a global data object
                .addGlobalData("oddEven", new OddEvenIndexLambda())
                // Add basic date and time formatting resolver
                .addResolver(new DateTimeFormatResolver())
                // ServletContextTemplateLocator is most suitable for webapp
                .addTemplateLocator(
                        new ServletContextTemplateLocator(1,
                                "/WEB-INF/templates", "html")).build();
    }

}
