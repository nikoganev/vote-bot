package org.symphonyoss.vb.api;

import com.sun.jersey.core.spi.component.ComponentContext;
import com.sun.jersey.spi.inject.Injectable;
import com.sun.jersey.spi.inject.PerRequestTypeInjectableProvider;

import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.ext.Provider;
import java.time.OffsetDateTime;
import java.util.List;

@Provider
public class OffsetDateTimeProvider extends PerRequestTypeInjectableProvider<QueryParam, OffsetDateTime> {
    private final UriInfo uriInfo;

    public OffsetDateTimeProvider(@Context UriInfo uriInfo) {
        super(OffsetDateTime.class);
        this.uriInfo = uriInfo;
    }

    @Override
    public Injectable<OffsetDateTime> getInjectable(final ComponentContext cc, final QueryParam a) {
        return new Injectable<OffsetDateTime>() {
            @Override
            public OffsetDateTime getValue() {
                final List<String> values = uriInfo.getQueryParameters().get(a.value());

                if (values == null || values.isEmpty())
                    return null;
                if (values.size() > 1) {
                    throw new WebApplicationException(Response.status(Status.BAD_REQUEST).
                            entity(a.value() + " cannot contain multiple values").build());
                }

                return OffsetDateTime.parse(values.get(0));
            }
        };
    }
}