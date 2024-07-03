package com.example;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

    @Override
    public void start(BundleContext context) {
        System.out.println("Starting the bundle");
    }

    @Override
    public void stop(BundleContext context) {
        System.out.println("Stopping the bundle");
    }
}
