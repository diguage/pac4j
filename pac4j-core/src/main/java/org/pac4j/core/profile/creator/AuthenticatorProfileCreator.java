package org.pac4j.core.profile.creator;

import org.pac4j.core.context.WebContext;
import org.pac4j.core.credentials.Credentials;
import org.pac4j.core.exception.HttpAction;
import org.pac4j.core.profile.CommonProfile;

/**
 * This profile creator retrieves the user profile attached in the {@link org.pac4j.core.credentials.Credentials}.
 * 
 * @author Jerome Leleu
 * @since 1.8.0
 */
public class AuthenticatorProfileCreator<C extends Credentials, P extends CommonProfile>
        implements ProfileCreator<C, P> {

    public final static AuthenticatorProfileCreator INSTANCE = new AuthenticatorProfileCreator<>();

    @Override
    public P create(final C credentials, final WebContext context) throws HttpAction {
        return (P) credentials.getUserProfile();
    }
}
