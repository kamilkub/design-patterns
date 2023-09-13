package pl.designs.structural.dynamic_proxy;

import pl.designs.structural.proxy.Image;

import java.awt.geom.Point2D;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ImageInvocationHandler implements InvocationHandler {
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Method setLocationMethod = Image.class.getMethod("setLocation", new Class[]{ Point2D.class });

        if(setLocationMethod.equals(method)) {

        }

        return null;
    }
}
