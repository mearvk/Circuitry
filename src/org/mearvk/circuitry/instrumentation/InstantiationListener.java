package org.mearvk.circuitry.instrumentation;

import java.lang.instrument.ClassFileTransformer;
import java.security.ProtectionDomain;

public class InstantiationListener implements ClassFileTransformer
{
    @Override
    public byte[] transform(final ClassLoader loader, final String classname, final Class<?> target, final ProtectionDomain protectiondomain, final byte[] classfilebuffer)
    {


        return new byte[0];
    }
}
